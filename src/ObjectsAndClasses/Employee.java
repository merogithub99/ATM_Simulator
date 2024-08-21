package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    String name;
    String yearOfJoining;
    String address;

    Employee(String name, String yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-20s", name, yearOfJoining, address);
    }


//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", yearOfJoining='" + yearOfJoining + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many employees' information do you want to store?");
        int size = scanner.nextInt();
        scanner.nextLine();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the name, year of joining, and address of the employee:");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Year of Joining: ");
            String yearOfJoin = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();
            Employee employee = new Employee(name, yearOfJoin, address);
            employeeList.add(employee);
        }

        // Printing the header
        System.out.printf("%-10s %-20s %-20s%n", "Name", "Year of Joining", "Address");
        // Printing employee details
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        scanner.close();
    }
}
