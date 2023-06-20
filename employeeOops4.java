package com.example.fulljavacourse;

class Employee{

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    String name;
    String jobTitle;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void raiseSalary(double percentage) {
        salary = salary + salary * percentage / 100;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}
public class employeeOops4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Gautam Rana", "Senior Java Developer ", 5000000);
        e1.printEmployeeDetails();

        e1.raiseSalary(70);
        System.out.println(e1.salary);


    }
}
