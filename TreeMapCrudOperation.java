package com.advanced_java.collection_framework_in_java.treemap_crud_operation;

import com.advanced_java.collection_framework_in_java.collection_framework_crud_operation.CollectionFrameworkCrudOperation;

public class TreeMapCrudOperation implements CollectionFrameworkCrudOperation
{
	@Override
	public void createTheData()
	{
		System.out.println("Create Operation Performed Successfully");
	}
	@Override
	public void readTheData()
	{
		System.out.println("Read Operation Performed Successfully");
	}
	@Override
	public void updateTheData()
	{
		System.out.println("Update Operation Performed Successfully");
	}
	@Override
	public void deleteTheData()
	{
		System.out.println("Delete Operation Performed Successfully");
	}
}