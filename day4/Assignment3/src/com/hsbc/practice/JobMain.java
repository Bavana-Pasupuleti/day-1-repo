package com.hsbc.practice;

import com.hsbc.practice.Job.Status;

public class JobMain {

	public static void main(String[] args) {
		Job obj=new Job("Programming","HSBC","August",85,2022,Status.WORKINPROGRESS);
		Job obj1=new Job("  ","HSBC","August",80,2022,Status.WORKINPROGRESS);
		System.out.println(obj.getjobID());
		Job j=new Job();
	}

}
