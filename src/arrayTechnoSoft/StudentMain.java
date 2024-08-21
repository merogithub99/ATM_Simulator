package arrayTechnoSoft;

import java.io.IOException;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        Student student =new Student();
        MarksEntry marksEntry= new MarksEntry();
        marksEntry.takeMarks(student);
        marksEntry.printDetails();

    }
}
