package arrayTechnoSoft;

public class Student {
    String studentName;
    float math;
    float english;
    float science;
    float nepali;
    float social;
    float totalMarks;
    float percentage;
    boolean isPass;

    public Student() {
    }

    public Student(String studentName, float math, float english, float science, float nepali,
                   float social, float totalMarks, float percentage, boolean isPass) {
        this.studentName = studentName;
        this.math = math;
        this.english = english;
        this.science = science;
        this.nepali = nepali;
        this.social = social;
        this.totalMarks = totalMarks;
        this.percentage = percentage;
        this.isPass = isPass;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getScience() {
        return science;
    }

    public void setScience(float science) {
        this.science = science;
    }

    public float getNepali() {
        return nepali;
    }

    public void setNepali(float nepali) {
        this.nepali = nepali;
    }

    public float getSocial() {
        return social;
    }

    public void setSocial(float social) {
        this.social = social;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", math=" + math +
                ", english=" + english +
                ", science=" + science +
                ", nepali=" + nepali +
                ", social=" + social +
                ", totalMarks=" + totalMarks +
                ", percentage=" + percentage +
                ", isPass=" + isPass +
                '}';
    }
}
