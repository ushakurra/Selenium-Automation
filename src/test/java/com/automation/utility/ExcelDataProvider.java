package com.automation.utility;

import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	//Get Test Data from Excel
	 //Create a function and provide TestNG annotation
	 @Test(dataProvider = "test1data")
	 
	 public void GetCellDatafromExcel(String username, String password)
	 {
	  //Get input parameters equal to parameters in excel
	//  System.out.println(username + " | " + password);  
	 }
	 
	 
	 //Create a function and provide TestNG annotation
	 @DataProvider(name = "test1data")
	 
	 public String[][] getData()
	 {
	  
	  String excelpath = ".\\TestData\\idpwd.xlsx";
	  
	  String sheetname = "Sheet1";
	  
	  //Call the excel data provider function
	  String data [][] = testData(excelpath,sheetname);
	  
	  return data; //return the data object
	 
	  
	 }
	 
	 
	 public static String[][] testData(String excelpath, String sheetname)
	 {
	  
	  ExcelUtils excel = new ExcelUtils(excelpath,sheetname);
	  
	  int rowCount = excel.getRowCount();
	  
	 // System.out.println(rowCount);
	  
	  int colCount = excel.getColumnCount();
	  
	 // System.out.println(colCount);
	  
	  //Create the Object
	 // Object data [][] = new Object [rowCount-1] [colCount];
	  
	  String data [][] = new String [rowCount] [colCount];
	  
	  for (int i=0; i< rowCount; i++)  
		  
	 
	  {   
	   for (int j=0; j < colCount; j++)
	   {
	    String cellData = excel.getCellDataString(i, j);
	    data [i][j]  = cellData; //Store the value in the object array
	    
	   } 
	   	    
	 }
	  return data;
	 }
}
