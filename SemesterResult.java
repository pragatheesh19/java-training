import java.util.Scanner;

public class SemesterResult {
    String name;
    String department;
    String[] subjects = {
        "INTRO TO SPACE SCIENCE",
        "PROJECT BASED LEARNING",
        "COMPILER DESIGN",
        "MOBILE COMPUTING & APP DEV",
        " MACHINE LEARNING",
        "PREDICTIVE MODELING",
       
    };
    int[] marks = new int[subjects.length];
    boolean pass = true;
    int total = 0;
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your department: ");
        department = sc.nextLine();
        System.out.println("\nEnter your marks (out of 100):");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + ": ");
            marks[i] = sc.nextInt();
            if (marks[i] < 50) {
                pass = false;
            }
            total += marks[i];
        }
    }
    void showResult() {
        System.out.println("\n----- SEMESTER RESULT -----");
        System.out.println("Name      : " + name);
        System.out.println("Department: " + department);
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " --> Marks: " + marks[i]);
        }
        double average = total / (double) subjects.length;
        System.out.println("\nAverage Marks: " + average);
        if (!pass) {
            System.out.println("Final Grade : RA(Re-Appear)");
        } else {
            String grade;
            if (average >= 90) grade = "O";
            else if (average >= 80) grade = "A+";
            else if (average >= 70) grade = "A";
            else if (average >= 60) grade = "B+";
            else grade = "B";
            System.out.println("Final Grade : " + grade + " ");
        }
    }
    public static void main(String[] args) {
        SemesterResult s = new SemesterResult();
        s.getDetails();
        s.showResult();
    }
}
