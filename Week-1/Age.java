import java.util.Scanner;
public class Age {
    
    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();

        if(age>=18){
            System.out.println("you are eligible to vote");
            
        }
      else{
        System.out.println("you are not eligible to vote");
      }
    }
}
