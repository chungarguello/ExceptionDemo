package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter a radius: ");
                String reply = input.next();

                double radius = Double.parseDouble(reply);

                //double radius = input.nextDouble();

                double area = Math.PI * Math.pow(radius, 2);

                System.out.printf("Area of circle radius %f is %f%n", radius, area);
                continueInput = false;

            } catch (InputMismatchException e) {
                System.out.println("YOU MESSED UP, try again");
                //Flush the input buffer
                input.nextLine();

            } catch (NumberFormatException e){
                System.out.println("you messed up 2 , try again");
                //flush input buffer
                input.nextLine();

            } catch (Exception e){

                System.out.println("Fuck off, try again");
                System.exit(1);
            }
        }while (continueInput);
        System.out.println("See you late asshole!");
    }
}
