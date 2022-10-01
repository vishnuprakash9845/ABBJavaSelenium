package day3;

import lib.ExcelUtil;

public class WD0021_ExcelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sNewExcelFile, sOldExcelFile, sSheetName;
		
		sNewExcelFile = "C:\\Users\\invim19\\Downloads\\Java-Selenium\\test1.xlsx";
		sOldExcelFile = "C:\\Users\\invim19\\Downloads\\Java-Selenium\\test2.xls";
		
		sSheetName = "Sheet1";
		
		System.out.println("New Excel file check : " + ExcelUtil.ExcelFileCheck(sNewExcelFile));
		System.out.println("Old Excel file check : " + ExcelUtil.ExcelFileCheck(sOldExcelFile));
		System.out.println("New Excel File Sheet Check : " + ExcelUtil.SheetCheck(sNewExcelFile, sSheetName));
		System.out.println("Old Excel File Sheet Check : " + ExcelUtil.SheetCheck(sOldExcelFile, sSheetName));
		System.out.println("Invalid Excel File Sheet Check : " + ExcelUtil.SheetCheck(sOldExcelFile, "TTTTTT"));
		System.out.println("Invalid Excel File Path Check : " + ExcelUtil.ExcelFileCheck("C:\\Users\\invim19\\Downloads\\Java-Selenium1\\test2.xls"));
		
		
		System.out.println("1,1 from old file : "+ ExcelUtil.GetCellStringValue(sOldExcelFile, sSheetName, 1, 1));
		System.out.println("0,1 from old file : "+ ExcelUtil.GetCellStringValue(sOldExcelFile, sSheetName, 0, 1));
		System.out.println("0,0 from old file : "+ ExcelUtil.GetCellStringValue(sOldExcelFile, sSheetName, 0, 0));
		System.out.println("10,10 from old file : "+ ExcelUtil.GetCellStringValue(sOldExcelFile, sSheetName, 10, 10));
		System.out.println("0,3 from old file : "+ ExcelUtil.GetCellStringValue(sOldExcelFile, sSheetName, 0, 3));
	}

}
