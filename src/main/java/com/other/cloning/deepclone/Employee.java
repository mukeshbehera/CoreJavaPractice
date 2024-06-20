package com.other.cloning.deepclone;

class Company implements Cloneable{
    private String companyName;

    public Company(String name){
        this.companyName = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

//Employee class
/*
* provided clone() method for deep cloning
* */
public class Employee implements Cloneable{
    private String employeeName;
    private int employeeAge;
    private Company company;

    public Employee(String name, int age, Company company){
        this.employeeName = name;
        this.employeeAge = age;
        this.company = company;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        employee.company = (Company) this.company.clone();
        return employee;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Company company = new Company("ABC_Company");
        Employee employee1 = new Employee("Mike", 32, company);
        System.out.println("Employee1 Company Name: " + employee1.getCompany().getCompanyName());

        Employee employeeClone = (Employee) employee1.clone();
        System.out.println("Employee2 Company Name: " + employeeClone.getCompany().getCompanyName());
        employeeClone.getCompany().setCompanyName("XYZ");
        System.out.println("-----------------------------------------");
        System.out.println("Employee1 Company Name: " + employee1.getCompany().getCompanyName());
        System.out.println("Employee1 Company Name: " + employeeClone.getCompany().getCompanyName());
    }
}
