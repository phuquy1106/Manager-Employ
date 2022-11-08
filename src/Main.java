import Model.Employees;
import utils.EmployessManager;
import utils.MenuUtil;
import utils.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employees> employeesList = new ArrayList<>();
        EmployessManager employessManager = new EmployessManager(employeesList);
        int i;
        do {
            MenuUtil.printMenu();

            do {
                i = Validator.getInt(scanner, "Choice: ");

                if ((i < 1) || (i > 5))
                    System.out.println("Enter a number from 1 to 5");
            } while ((i < 1) || (i > 5));

            switch (i) {
                case 1:
                    employessManager.addProgrammer();
                    System.out.println();
                    break;
                case 2:
                    employessManager.addVerifier();
                    System.out.println();
                    break;
                case 3:
                    employessManager.printEmployees();
                case 4:
                    System.out.println("Program is finished");
                    break;
            }
        }while(i!=5);
    }
}

