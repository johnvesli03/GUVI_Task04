package Task4_4;

import java.util.Scanner;

public class StudentDriver {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Student_manager manager = new Student_manager();

            while (true) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Add Student");
                System.out.println("2. Remove Student");
                System.out.println("3. Display Student Grade");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter student grade: ");
                        double grade = scanner.nextDouble();
                        manager.addStudent(name, grade);
                        break;
                    case 2:
                        System.out.print("Enter student name to remove: ");
                        name = scanner.nextLine();
                        manager.removeStudent(name);
                        break;
                    case 3:
                        System.out.print("Enter student name to display grade: ");
                        name = scanner.nextLine();
                        manager.displayGrade(name);
                        break;
                    case 4:
                        System.out.println("Exiting program...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
