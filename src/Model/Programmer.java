package Model;

import utils.Validator;

import java.util.List;
import java.util.Scanner;




public class Programmer extends Employees{
    private int overtimeHours;

    public Programmer(){ }

    @Override
    public int salary() {
        int salary;
        salary = super.getBasicSalary()+overtimeHours*400000;
        return salary;
    }


    public void inputEmployess(List<Employees> employeesList) {
        Scanner scanner = new Scanner(System.in);
        super.inputEmployees(employeesList);
        this.overtimeHours = Validator.getInt(scanner, "Overtime Hours: ");
    }

    public Programmer(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Programmer(String employeeCode, String fullName, int age, String phoneNumber, String emaill, int basicSalary, int overtimeHours) {
        super(employeeCode, fullName, age, phoneNumber, emaill, basicSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public String toString() {
        return super.toString() +", "+
                "overtimeHours: " + overtimeHours +", "+
                "salary: "+ salary();
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}
