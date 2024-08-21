package arrayTechnoSoft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarksEntry {

    static List<Student> studentList = new ArrayList<>();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    public void takeMarks(Student student) throws IOException {
        System.out.println("How many student data do you you want to enter");
        int sizeOfStudent = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < sizeOfStudent; i++) {
            System.out.println("What is the name of student");
            String name = bufferedReader.readLine();
            System.out.println("Enter the marks in math");
            float math = Float.parseFloat(bufferedReader.readLine());
            System.out.println("Enter the marks in english");
            float english = Float.parseFloat(bufferedReader.readLine());
            System.out.println("Enter the marks in science");
            float science = Float.parseFloat(bufferedReader.readLine());
            System.out.println("Enter the marks in nepali");
            float nepali = Float.parseFloat(bufferedReader.readLine());
            System.out.println("Enter the marks in social");
            float social = Float.parseFloat(bufferedReader.readLine());
            float totalMarks = math + science + english + social + nepali;
            float percentage = (totalMarks / 500) * 100;
            boolean isPass = social >= 40 && science >= 40 && math >= 40 && english >= 40 && nepali >= 40;
            Student student1 = new Student(name, math, english, science, nepali, social, totalMarks, percentage, isPass);
            studentList.add(student1);

        }
    }

//    public void printDetails() {
//        System.out.println("--------------------------------------------------------------------------------------------");
//        System.out.println("|Name             |                               Marks                                    |");
//        System.out.println("-------------------------------------------------------------------------------------------|");
//        System.out.println("|                 | Math    | English | Science | Nepali | Social | total |Percent| remarks|");
//        System.out.println("--------------------------------------------------------------------------------------------");
//
//        for (Student student1 : studentList) {
//            System.out.println("|" + student1.studentName + "              | " + student1.math + "        | "
//                    + student1.english + "        |" +
//                    student1.science + "          |" + student1.nepali + "    |" + student1.social + "     |" +
//                    student1.totalMarks + "    |" +
//                    student1.percentage + "      |" + student1.isPass + " |");
//            System.out.println("|------------------------------------------------------------------------------------------|");
//
//        }
//
//    }



    public void printDetails() {
        // Print header
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("| Name             | Math   | English | Science | Nepali | Social | Total | Percent | Remarks  |");
        System.out.println("------------------------------------------------------------------------------------------------");

        // Print each student's details
        for (Student student1 : studentList) {
            System.out.printf("| %-17s | %-6.2f | %-7.2f | %-7.2f | %-6.2f | %-6.2f | %-5.2f | %-7.2f | %-7s |\n",
                    student1.studentName,
                    student1.math,
                    student1.english,
                    student1.science,
                    student1.nepali,
                    student1.social,
                    student1.totalMarks,
                    student1.percentage,
                    student1.isPass ? "Pass" : "Fail");
            System.out.println("----------------------------------------------------------------------------------------------");
        }
    }


}
