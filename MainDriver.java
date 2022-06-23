package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.treemap_crud_operation.TreeMapCrudOperation;

public class MainDriver
{
	static TreeMapCrudOperation treeMapCrudOperation = new TreeMapCrudOperation();
	public static void main(String[] args)
	{
		treeMapCrudOperation.createTheData();
		
		treeMapCrudOperation.readTheData();
		
		treeMapCrudOperation.updateTheData();
		
		treeMapCrudOperation.deleteTheData();
	}
}