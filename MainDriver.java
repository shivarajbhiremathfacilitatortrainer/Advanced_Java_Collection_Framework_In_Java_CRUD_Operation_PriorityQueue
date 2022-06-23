package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.priorityqueue_crud_operation.PriorityQueueCrudOperation;

public class MainDriver
{
	static PriorityQueueCrudOperation priorityQueueCrudOperation = new PriorityQueueCrudOperation();
	public static void main(String[] args)
	{
		priorityQueueCrudOperation.createTheData();
		
		priorityQueueCrudOperation.readTheData();
		
		priorityQueueCrudOperation.updateTheData();
		
		priorityQueueCrudOperation.deleteTheData();
	}
}