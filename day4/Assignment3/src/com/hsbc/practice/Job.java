package com.hsbc.practice;

public class Job {
	
	public enum Status{
	NOTSTARTED,
	WORKINPROGRESS,
	COMPLETED,
	}
	private static int jobCount=0;
	private String jobID;
	String jobName, owner, monthofCreation;
	int effort, yearOfCreation;
	Status status;
	
	public String getjobID(){
		return jobName+"_"+jobCount;
	}
	public Job (String jobName, String owner) {
		try{
			if (jobName. trim().isEmpty() ||  owner.trim().isEmpty() ) {
				throw new Exception ("Jobname and owner cannot be empty") ;
			}
	}
	catch (Exception e){
		if(e.getMessage()!=null) {
			System.out.println(e.getMessage());
		}
	}
	}
	public Job(String jobName, String owner, String monthofCreation, int effort, int yearOfCreation,
			Status status) {
		this(jobName,owner);
		this.jobName = jobName;
		this.owner = owner;
		this.monthofCreation = monthofCreation;
		this.effort = effort;
		this.yearOfCreation = yearOfCreation;
		this.status = status;
		jobCount++;
	}
	public Job() {
		System.out.println(new Exception("All Parameters should be passed").getMessage());
	}
	public String showDetails() {
		return jobName+" "+owner+" "+jobID+" "+monthofCreation+" "+yearOfCreation+" "+effort+" "+status+" "+jobCount;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getMonthofCreation() {
		return monthofCreation;
	}
	public void setMonthofCreation(String monthofCreation) {
		this.monthofCreation = monthofCreation;
	}
	public int getEffort() {
		return effort;
	}
	public void setEffort(int effort) {
		this.effort = effort;
	}
	public int getYearOfCreation() {
		return yearOfCreation;
	}
	public void setYearOfCreation(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	

}
	