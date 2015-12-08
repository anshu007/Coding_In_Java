package com.ser;
public class Employee {
   public int identity;
   public String firstName; 
   public String lastName;   
   public int salary;  

   public Employee() {}
   public Employee(int identity,String fname, String lname, int salary) {
	   this.identity=identity;
      this.firstName = fname;
      this.lastName = lname;
      this.salary = salary;
   }
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getIdentity() {
	return identity;
}
public void setIdentity(int identity) {
	this.identity = identity;
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

}