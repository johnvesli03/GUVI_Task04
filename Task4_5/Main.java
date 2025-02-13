package Task4_5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackOperations stackOps = new StackOperations();

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Is Empty");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stackOps.push(element);
                    System.out.println("Element pushed onto the stack.");
                    break;
                case 2:
                    int poppedElement = stackOps.pop();
                    System.out.println("Popped element: " + poppedElement);
                    break;
                case 3:
                    if (stackOps.isEmpty()) {
                        System.out.println("Stack is Empty.");
                    } else {
                        System.out.println("Stack is not Empty.");
                    }
                    break;
                case 4:
                    stackOps.displayElements();
                    break;
                case 5:
                    System.out.println("Exiting the Program..");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid option.Please Try Again!...");
            }

        }

    }

}