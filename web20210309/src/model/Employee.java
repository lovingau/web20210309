package model;

public class Employee {
	int employeeNumber,reportsTo;
	String firstName,lastName,extension,officeCode,email,jobTitle;
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public int getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(int reportsTo) {
		this.reportsTo = reportsTo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public Employee() {}
	public Employee(int no,String fn,String ln,String ex,String code,String mail,String title,int report)
	{
		employeeNumber=no;
		reportsTo=report;
		firstName=fn;
		lastName=ln;
		extension=ex;
		officeCode=code;
		email=mail;
		jobTitle=title;
				
	}
	
	public String toString() {
		return ""+this.employeeNumber; 
	}
}
