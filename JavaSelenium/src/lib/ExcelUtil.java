package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	public static boolean ExcelFileCheck(String sExcelFile)
	{
		if(sExcelFile.isEmpty()==false)
		{
			if(sExcelFile.endsWith(".xls") || sExcelFile.endsWith(".xlsx"))
			{
				if(new File(sExcelFile).exists())
				{
					return true;
				}
				else
				{
					System.err.println("File does not exists : "+ sExcelFile);
					return false;
				}
			}
			else
			{
				System.err.println("Invalid file : "+ sExcelFile);
				return false;
			}
		}
		else
		{
			System.err.println("Excel file path is empty/blank");
			return false;
		}
	}
	
	public static boolean SheetCheck(String excelFile, String sSheet)
	{
		if(ExcelFileCheck(excelFile))
		{
			try {
				InputStream oFile = new FileInputStream(excelFile);
				Workbook oWBook = WorkbookFactory.create(oFile);
				Sheet oSheet = oWBook.getSheet(sSheet);
				
				if(oSheet!=null)
				{
					return true;
				}
				else
				{
					System.err.println("Sheet not found : "+ sSheet);
					return false;
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
		}
		else
		{
			return false;
		}
	}
	
	public static int GetMaxRowFromSheet(String excelFile,String sSheet) {
		
		if(SheetCheck(excelFile, sSheet))
		{
			InputStream oFile;
			try {
				oFile = new FileInputStream(excelFile);
				Workbook oWBook = WorkbookFactory.create(oFile);
				Sheet oSheet = oWBook.getSheet(sSheet);
				return oSheet.getLastRowNum();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -100;
			}
		}
		else
		{
			return -100;
		}
	}
	
	public static String GetCellStringValue(String excelFile,String sSheet,int iRow,int iCell) {
		InputStream oFile;
		
		try {
			
			oFile = new FileInputStream(excelFile);
			Workbook oWBook = WorkbookFactory.create(oFile);
			Sheet oSheet = oWBook.getSheet(sSheet);		
			Row oRow = oSheet.getRow(iRow);
			
			if(oRow==null)
			{
				System.err.println("Invalid row number : "+ excelFile + sSheet + iRow);
				oWBook = null;
				oFile.close();
				return "****Invalid oRow****";
			}
			Cell oCell = oRow.getCell(iCell);
			
			if(oCell==null)
			{
				System.err.println("Invalid Cell : "+ excelFile + sSheet + iRow + iCell);
				oWBook = null;
				oFile.close();
				return "****Invalid oCell****";
			}
			
			return oCell.getStringCellValue();
			
		} catch (Exception e) {
			// TODO: handle exception
			return "****Invalid****";
		}
	}
	
}
