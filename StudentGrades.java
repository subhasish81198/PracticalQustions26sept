package Javanew;
import java.util.Scanner;
public class StudentGrades {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= 10; i++) {
        System.out.println("Enter the name of student " + i + ":");
        String name = sc.nextLine();
        System.out.println("Enter the attendance % of " + name + ":");
        double attendance = sc.nextDouble();
        sc.nextLine();
        char grade = getGrade(attendance);
        System.out.println(name + "'s grade is: " + grade);
    }
}

public static char getGrade(double attendance) {
    int category;

    if (attendance > 90) {
        category = 1;
    } else if (attendance > 80) {
        category = 2;
    } else if (attendance > 70) {
        category = 3;
    } else if (attendance > 60) {
        category = 4;
    } else if (attendance >= 45) {
        category = 5;
    } else {
        category = 6;
    }

    char grade;

    switch (category) {
        case 1:
            grade = 'A';
            break;
        case 2:
            grade = 'B';
            break;
        case 3:
            grade = 'C';
            break;
        case 4:
            grade = 'D';
            break;
        case 5:
            grade = 'E';
            break;
        default:
            grade = 'F';
            break;
    }

    return grade;
}
}