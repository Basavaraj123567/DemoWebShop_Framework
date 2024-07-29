package genericlibrary;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class DataUtility {

		
		
		public String getDataFormProperties (String key ) throws IOException 
		{
			
			FileInputStream fis=new FileInputStream("./src/test/resources/TestData/CommonData.properties");
		
			
	       Properties	 per =new Properties();

	         per.load(fis);
	      String value=per.getProperty(key);
		return value;
	      
	                       


	}
		
		public String getDatafromExel(String sheet, int rownum, int cellnum) throws EncryptedDocumentException, IOException{
			
			
			File f = new File("./src/test/resources/TestData/Book3.xlsx");
			FileInputStream fis=new FileInputStream(f);
	        Workbook book=WorkbookFactory.create(fis);
	        Sheet sh=book.getSheet(sheet);
	        String value=sh.getRow(rownum).getCell(cellnum).toString();
	        
			return value;
			

		}
		public Object[][] getMultipleDataFromExel(String sheetname) throws EncryptedDocumentException, IOException{

			File f = new File("./src/test/resources/TestData/Book3.xlsx");
			FileInputStream fis=new FileInputStream(f);
	        Workbook book=WorkbookFactory.create(fis);
	        Sheet shee=book.getSheet(sheetname);
	        
	        int lastrownumber=shee.getPhysicalNumberOfRows();
	        int lastcellnumber=shee.getRow(0).getPhysicalNumberOfCells();
	        
	        Object [][] arr =new Object[lastrownumber-1][lastcellnumber];
	        for(int i=1; i<lastrownumber-1;  i++) {
	        	
	        	for (int j=0; j<lastcellnumber; j++){
	        		
	        		
	        		arr[i-1][j]=shee.getRow(i).getCell(j).toString();
	        		
	        		
	        		
	        	}
	        }
	        
	     
	    	return arr;

	        
	        
	        
	        
	        
	        
	        

		}	
		
	}


