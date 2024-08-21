package ObjectsAndClasses;
//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

public class Student {

    String name;
    int roll;

    Student(String name, int roll){
        this.name= name;
        this.roll=roll;
    }
    Student(){

    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name="John";
        student.roll=2;
        System.out.println("Name:"+ student.name +" roll:"+ student.roll);


        Student student1 = new Student("Ram",1);
        Student student2 = new Student("Hari",2);
        System.out.println("name:"+student1.name + "   roll: "+student1.roll);
        System.out.println("name:"+student2.name +"   roll: "+student2.roll);

    }
}
