package p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Created by carguell on 2/25/2016.
 */
public class Main {
    public static void main (String[] arg){
        File file = new File("myFile.txt");
        System.out.println("Does it exist? " + file.exists());

        try {
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                try {
                    double grade = input.nextDouble();
                    System.out.println("GRADE = " + grade);
                } catch (Exception e) {
                    System.out.println("bad data");
                    input.nextLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}
