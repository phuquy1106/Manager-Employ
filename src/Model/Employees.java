package Model;

import utils.Validator;

import java.util.List;
import java.util.Scanner;

public abstract class Employees {
    private String employeeCode;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String emaill;
    private int basicSalary;

    public Employees(){ }

    public Employees(String employeeCode, String fullName, int age, String phoneNumber, String emaill, int basicSalary) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emaill = emaill;
        this.basicSalary = basicSalary;
    }

    public void inputEmployees(List<Employees> employeesList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Information:");
        boolean checkID;
        do {
            checkID = true;
            this.employeeCode = Validator.getString(scanner, "Employee Code: ");

            for (Employees employees : employeesList ) {
                if (employees.getEmployeeCode().equalsIgnoreCase(this.employeeCode) ) {
                    System.out.println("The ID is available");
                    checkID = false;
                    break;
                }
            }
        } while (!checkID);
        this.fullName = Validator.getString(scanner, "Full name: ");
        this.age = Validator.getInt(scanner, "Age: ");
        this.phoneNumber = Validator.getString(scanner, "Phone Number: ");
        this.emaill = Validator.getString(scanner, "Email: ");
        this.basicSalary = Validator.getInt(scanner, "Basic Salary: ");
    }
    public abstract int salary();

    @Override
    public String toString() {
        return "Employees: "+
                "employeeCode: " + employeeCode + ", "+
                "fullName: " + fullName + ", " +
                "age: " + age +", "+
                "phoneNumber: " + phoneNumber + ", " +
                "emaill: " + emaill +", " +
                "basicSalary: " + basicSalary ;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }


}
