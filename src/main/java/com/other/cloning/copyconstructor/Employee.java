package com.other.cloning.copyconstructor;

class Company{
    private String companyName;

    public Company(String companyName){
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

public class Employee {
    private String employeeName;
    private int employeeAge;
    private Company company;

    public Employee(String employeeName, int employeeAge, Company company){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.company = company;
    }

    public  Employee(Employee employee){
        this.employeeName = employee.getEmployeeName();
        this.employeeAge = employee.getEmployeeAge();
        this.company = new Company(employee.getCompany().getCompanyName());
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public static void main(String[] args) {
        Company company = new Company("ABC_Company");
        Employee employee1 = new Employee("Mike", 32, company);
        System.out.println("Employee1 Company Name: " + employee1.getCompany().getCompanyName());

        //Invoking Copy Constructor
        Employee employee2 = new Employee(employee1);
        System.out.println("Employee2 Company Name: " + employee2.getCompany().getCompanyName());
        employee2.getCompany().setCompanyName("XYZ");
        System.out.println("------------------------------------------");
        System.out.println("Employee1 Company Name: " + employee1.getCompany().getCompanyName());
        System.out.println("Employee2 Company Name: " + employee2.getCompany().getCompanyName());
    }
}
