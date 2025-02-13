package Task4_3;
import java.util.Scanner;
public class Week_Days_Manager {
        public static void main(String[] agrs) {
            Scanner sc = new Scanner(System.in);
            Week_Day weekday = new Week_Day();;
            System.out.print("Enter the day Index(0-6): ");
            try{
                int index=sc.nextInt();
                System.out.println("Day: " + Week_Day.getDay(index));
            } catch (Invalid_Day_IndexException e) {
                System.out.println(e.getMessage());
            }
        }
    }

