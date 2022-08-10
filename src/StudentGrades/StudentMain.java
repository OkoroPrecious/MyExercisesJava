package StudentGrades;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        Student Student1 = new Student(null, null, 0.0);
        Student Student2 = new Student(null, null, 0.0);
        Student Student3 = new Student(null, null, 0.0);

        System.out.println("Enter subject scores for Student1");

        System.out.println("What's the first students name?: ");
        Student1.setName(keyboardInput.nextLine());

        System.out.println("What is their grade score?: ");
        Student1.setGradeScore(keyboardInput.nextDouble());

        System.out.println("For which subject?: ");
       // Student1.setSubject();

//        System.out.println("Enter subject scores for Student2");
//
//        System.out.println("What's the second students name?: ");
//        Student1.setName(keyboardInput.nextLine());
//
//        System.out.println("What is their grade score?: ");
//        Student1.setGradeScore(keyboardInput.nextDouble());
//
//        System.out.println("For which subject?: ");
//        Student1.setSubject(keyboardInput.nextLine());
//
//        System.out.println("Enter subject scores for Student3");
//
//        System.out.println("What's the third students name?: ");
//        Student1.setName(keyboardInput.nextLine());
//
//        System.out.println("What is their grade score?: ");
//        Student1.setGradeScore(keyboardInput.nextDouble());
//
//        System.out.println("For which subject?: ");
//        Student1.setSubject(keyboardInput.nextLine());

        System.out.println("=============================");
        System.out.println("=============================");

        System.out.println("Subject Summary");
        System.out.println(Student1.getSubject());
    }
}
