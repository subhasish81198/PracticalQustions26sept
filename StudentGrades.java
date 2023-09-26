//2.Write a Java switch case program to take the students names and attendance % of 10 students as input and display their grades according to the below conditions:
 //* If attendance above 90 then “A” 
// * If attendance between 90-80 then “B” 
// * If attendance between 80-70 then “C” 
// * If attendance between 70-60 then “D” 
 //* If attendance between 45-60 then “E”


package Javanew;

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        int[] attendance = new int[10];
        char[] grades = new char[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter attendance percentage of student " + (i + 1) + ": ");
            attendance[i] = Integer.parseInt(scanner.nextLine());

            switch (attendance[i] / 10) {
                case 10:
                case 9:
                    grades[i] = 'A';
                    break;
                case 8:
                    grades[i] = 'B';
                    break;
                case 7:
                    grades[i] = 'C';
                    break;
                case 6:
                    grades[i] = 'D';
                    break;
                default:
                    if (attendance[i] >= 45 && attendance[i] <= 60) {
                        grades[i] = 'E';
                    } else {
                        grades[i] = 'F';
                    }
            }
        }

        System.out.println("\nName\tAttendance\tGrade");
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i] + "\t" + attendance[i] + "%\t\t" + grades[i]);
        }
    }
}
;
    }

    return grade;
}
}
