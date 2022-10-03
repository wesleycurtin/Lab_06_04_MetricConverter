import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";

        System.out.print("Enter the number of meters: ");

        if(in.hasNextDouble()) {
            meters = in.nextDouble();
            in.nextLine();
            miles = meters / 1609;
            feet = meters * 3.281;
            inches = meters * 39.3701;
            System.out.println("Your number converted to miles is " + miles);
            System.out.println("Your number converted to feet is " + feet);
            System.out.println("Your number converted to inches is " + inches);
        }
        else {
            trash = in.nextLine();
            System.out.println("\n You said you had " + trash + " meters");
            System.out.println("That is not a valid number!");
            System.out.println("Run the program again and enter a valid number!");
            System.exit(0);
        }










    }
}