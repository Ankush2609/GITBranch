package com.testng.dp;

import org.testng.annotations.DataProvider;

public class DP {
	
	@DataProvider(name="dp1")
	public Integer[][] numbers()
	{
		Integer [][]arr = {{1,2},{3,4},{5,6}};
		return arr;
		
	}
}
