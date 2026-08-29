
import java.util.Scanner;
public class Largest {
     
    public static void main(String[]args){
 
        Scanner scan=new Scanner(System.in);
        int num1 =scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
 
       if (num1>num2 && num1>num3){
        System.out.println("number 1 is greater");
       }
       else if(num2>num1 && num2>num3){
           System.out.println("number 2 is greater");
       }
        else {
           System.out.println("number 3 is greater");
       }

    }
}
