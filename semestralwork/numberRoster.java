
package SemestralWork;
import java.util.Scanner;
public class numberRoster {
    public static int[] countingDigits(long number){ 
        long digit;
        int i;
        int [] digitsAmount = new int[10];
        for (int j=0 ;j<10 ;j++){
                digitsAmount[j]=0;
        }
        while(number>0){
                    digit = number%10;
                    i=(int)digit;
                    digitsAmount[i]++;
                    number/=10;
                }
        return digitsAmount;
        } 
    public static void rosterPrint (long number, int[] digitsAmount) {
        for (int i =0;i<10;i++){
            if(digitsAmount[i]>0){
                System.out.print(digitsAmount[i]+""+i);
            }
        }
    }
    public static boolean isSame (long number, int[] digitsAmount){
        long digit;
        int i;
        int amount;
        while(number>0){
             digit = number%10;
             i=(int)digit;
             amount = (int)((number%100)/10);
             if(digitsAmount[i]!=amount){
                 return false;
             }
             number/=100;
        }       
        return true;
    }
    public static void run() {
        Scanner sc = new Scanner(System.in); 
        long number;
        int [] digitsAmount = new int[10];
        while (true){
            System.out.println("Zadej cislo");
            number=sc.nextLong();
            if(number<=0){
                break;
            }
            digitsAmount=countingDigits(number);
            System.out.print("Cislo "+ number + " ma soupisku ");
            rosterPrint(number,digitsAmount);
            boolean isSame=isSame(number,digitsAmount);
            System.out.println("\n" + "Cislo " +number+((isSame) ? " je " : " neni ")+"zapisem sve soupisky");
        }       
    }
}
