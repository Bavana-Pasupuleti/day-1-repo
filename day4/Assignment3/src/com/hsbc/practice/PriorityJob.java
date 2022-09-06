package com.hsbc.practice;

public class PriorityJob extends Job {
	enum Priority{
		LOW,
		MEDIUM,
		HIGH,
	}
	String monitoredBy;
	Priority priority;

}
