package crm.genericlibrery;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Fileutil {
	 String filepath="./Data/commondata.properties";
	 String excelpath="./Data/testdata.xlsx";
	 public Properties getpropertiesfileobject() throws IOException
	 {
		 FileInputStream fis=new FileInputStream(filepath);
		 Properties pobj=new Properties();
		 pobj.load(fis);
		return pobj;
		 
	 }
	 
public String getexcelData(String sheetname,int rownum,int celnum) throws Throwable   
{
FileInputStream fis=new FileInputStream(excelpath);
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet(sheetname);
String data=sh.getRow(rownum).getCell(celnum).getStringCellValue();
wb.close();

return data;

}
public void setexceldata(String sheetname,int rownum,int colnum,String data) throws EncryptedDocumentException, InvalidFormatException, IOException
{
FileInputStream fis=new FileInputStream(excelpath);
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet(sheetname);
sh.getRow(rownum).createCell(colnum).setCellValue(data);
FileOutputStream fos=new FileOutputStream(excelpath);
wb.write(fos);
wb.close();
}

}
