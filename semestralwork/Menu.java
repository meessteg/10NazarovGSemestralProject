
package SemestralWork;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        /** 
        * Semestral Project number 10
        * Program for each entered positive number creates a list of digits of this number
        * @author Georgij Nazarov
        * @version 1.0 22.01.2023
        */ 
        Scanner sc = new Scanner(System.in);
        int choise;
        boolean repeat = true;
        do {
            System.out.println("1:Semestral Work" +"\n"+"2:Christmas Task"+"\n"+"0:end");
            choise=sc.nextInt();
            switch (choise){
                case 1:
                    numberRoster.run();
                    break;
                case 2:
                    ChristmasTask.run(); 
                    break;
                case 0:
                    repeat = false; 
                    break;
                default:
                    System.out.println("Invalid request");
            } 
        } while(repeat);
    }
}
