class Clg {
    static int code = 1000;
    int collegeCode;
    String collegeName;
    String dept;

    Clg(String collegeName, String dept) {
        this.collegeCode = code++;
        this.collegeName = collegeName;
        this.dept = dept;
    }

    void displayCollege() {
        System.out.println("College Code: " + collegeCode);
        System.out.println("College Name: " + collegeName);
        System.out.println("Dept: " + dept);
    }
}

class Stu extends Clg {
    String studentName;
    int regNum;

    Stu(String studentName, int regNum, String collegeName, String dept) {
        super(collegeName, dept);
        this.studentName = studentName;
        this.regNum = regNum;
    }

    void displayStudent() {
        displayCollege();
        System.out.println("Student Name: " + studentName);
        System.out.println("Register Number: " + regNum);
    }
}

public class single {
    public static void main(String[] args) {
        Stu student = new Stu("Madhav", 28, "HICET", "CSE");
        Stu student1 = new Stu("Madhav", 28, "HICET", "CSE");
        Stu student2 = new Stu("Madhav", 28, "HICET", "CSE");
        student.displayStudent();
        student1.displayStudent();
        student2.displayStudent();
    }
}
