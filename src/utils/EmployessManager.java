package utils;

import Model.Employees;
import Model.Programmer;
import Model.Verifier;

import java.util.ArrayList;
import java.util.List;

public class EmployessManager {
    private List<Employees> employeesList = new ArrayList<>();

    public EmployessManager() {
    }

    public EmployessManager(List<Employees> employees) {
        this.employeesList = employeesList;
    }

    public void addVerifier(){
        Verifier vr = new Verifier();
        vr.inputEmployess(employeesList);
        employeesList.add(vr);
    }
    public void addProgrammer(){
        Programmer pr = new Programmer();
        pr.inputEmployess(employeesList);
        employeesList.add(pr);
    }
    public void printEmployees(){
        for(Employees employees:employeesList){
            System.out.println(employees);
        }
    }
}
