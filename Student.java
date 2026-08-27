import java.util.Scanner;
public class Student {
    public static void main(String []args){

        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        if(num>=90){
            System.out.println("A");

        }
        else if(num>=80){
            System.out.println("B");
            
        }
        else if(num>=60){
            System.out.println("C");
            
        }
        else if(num>=35){
            System.out.println("D");
            
        }
        else if(num<35){
            System.out.println("fail");
            
        }
        else {
            System.out.println("enter valid number");
            
        }
    }
}
