package com.other.cloning.shallowclone;
/*
* When we use the default implementation of clone() method then a shallow copy of object is returned,
* meaning if the object that we are trying to clone contains both primitive and non-primitive or reference type
* variable, then only the object's reference is copied not the entire object itself.
* */
class Company{
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
}


//Employee class
public class Employee implements Cloneable {
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
