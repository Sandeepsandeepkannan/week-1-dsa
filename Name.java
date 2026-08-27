import java.util.Scanner;

public class Name {
    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);

         String firstname=scan.next();
         String lastname=scan.next();   
         int a=scan.nextInt();

         for(int i=1;i<=a;i++){

            System.out.println(firstname+lastname);
         
        }
    }
}
