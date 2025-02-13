import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Students> studentsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Registration System");
        while (true) {
            System.out.print("Student name: ");
            String studentName = sc.nextLine();

            System.out.print("Student email: ");
            String studentEmail = sc.nextLine();

            System.out.print("Grade 1: ");
            double studentGrade1 = sc.nextDouble();
            System.out.print("Grade 2: ");
            double studentGrade2 = sc.nextDouble();

            Students studentObj = new Students(studentName, studentEmail, studentGrade1, studentGrade2);
            studentsList.add(studentObj);
            sc.nextLine();//limpar o buffer
            System.out.print("Do you want to add another student? (yes/no): ");
            String response = sc.nextLine().toLowerCase();

            if (response.equals("no")) {
                break;
            }

        }
        sc.close();

        System.out.println("Student List");
        System.out.println("---------------");
        for (Students student : studentsList) {
            System.out.println("Student details: ");
            System.out.println("Name: " + student.getName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Grade 1: " + student.getGrade1());
            System.out.println("Grade 2: " + student.getGrade2());
            System.out.println("Grades Average: " + student.getAverage());
            System.out.println("---------------");
        }
    }

}
