package excelOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHrmLib;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlOps {

	public static void main(String[] args) throws IOException
	{
		OrgHrmLib om=new OrgHrmLib();
		String xlpath="F:\\Venkat_sashidarRecordings\\Workspace\\Seleniumproject\\src\\testdata\\EmpReg.xlsx";
		String xlout="F:\\Venkat_sashidarRecordings\\Workspace\\Seleniumproject\\src\\results\\Empres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpData");
//		XSSFRow r=ws.getRow(5);
//		XSSFCell c=r.getCell(1);
		
//		System.out.println(c.getStringCellValue());
		
		int Rc=ws.getLastRowNum();
		om.OrgLaunch("http://orangehrm.qedgetech.com");
		om.OrgLogin("Admin", "Admin");
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.getCell(2);
			XSSFCell c3=r.createCell(3);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			String EmpId=c2.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+EmpId);
			
			String res=om.OrgEmp(f, l, EmpId);
			c3.setCellValue(res);
			
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.OrgLogout();
		om.OrgClose();
	}

}
