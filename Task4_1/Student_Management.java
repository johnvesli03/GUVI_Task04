package Task4_1;

import java.util.Scanner;

public class Student_Management {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Enter Roll No: ");
                String rollNo = scanner.next();
                scanner.nextLine();

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter Course: ");
                String course = scanner.nextLine();

                Student student = new Student(rollNo, name, age, course);
                student.display();
            } catch (Age_Not_WithinRangeException | Name_Not_ValidException e) {
                System.out.println("Exception: " + e.getMessage());
            }
            scanner.close();
        }
    }

