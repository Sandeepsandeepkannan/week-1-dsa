import java.util.Scanner;
public class Positiveor {
    public static void main(String[]args){
      
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
         if(a>0){
            if(a%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
         }
         else{
            System.out.println("negative");
         }

    }
}
