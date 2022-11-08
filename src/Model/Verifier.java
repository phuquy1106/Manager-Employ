package Model;

import utils.Validator;

import java.util.List;
import java.util.Scanner;

public class Verifier extends Employees{
    private int numberDetected;

    public Verifier(){ }

    @Override
    public int salary() {
        int salary = super.getBasicSalary()+numberDetected*150000;
        return salary;
    }

    public Verifier(int numberDetected) {
        this.numberDetected = numberDetected;
    }

    public Verifier(String employeeCode, String fullName, int age, String phoneNumber, String emaill, int basicSalary, int numberDetected) {
        super(employeeCode, fullName, age, phoneNumber, emaill, basicSalary);
        this.numberDetected = numberDetected;
    }
    public void inputEmployess(List<Employees> employeesList) {
        Scanner scanner = new Scanner(System.in);
        super.inputEmployees(employeesList);
        this.numberDetected = Validator.getInt(scanner, "Number Detected: ");
    }

    @Override
    public String toString() {
        return super.toString() +", "+
                "numberDetected: " + numberDetected +", "+
                "salary: " + salary()
                ;
    }

    public int getNumberDetected() {
        return numberDetected;
    }

    public void setNumberDetected(int numberDetected) {
        this.numberDetected = numberDetected;
    }
}
