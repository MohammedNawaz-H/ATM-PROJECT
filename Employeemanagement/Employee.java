package Employeemanagement;

import java.io.*;
class Employee implements Serializable {
 private static final long serialVersionUID = 1L;

 private String id;
 private String name;
 private String department;
 private double salary;

 public Employee(String id, String name, String department, double salary) {
     this.id = id;
     this.name = name;
     this.department = department;
     this.salary = salary;
 }

 // Getters
 public String getId() { return id; }
 public String getName() { return name; }
 public String getDepartment() { return department; }
 public double getSalary() { return salary; }

 // Setters (for update)
 public void setName(String name) { this.name = name; }
 public void setDepartment(String department) { this.department = department; }
 public void setSalary(double salary) { this.salary = salary; }

 @Override
 public String toString() {
     return String.format("ID: %-8s | Name: %-15s | Dept: %-12s | Salary: Rs: %,.2f",
             id, name, department, salary);
 }
}
