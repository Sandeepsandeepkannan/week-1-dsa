import java.util.Scanner;
public class Multiples {
    
    public static void main(String[]args){
    Scanner scan=  new Scanner(System.in) ;

    int a =scan.nextInt();
    
    for (int i=a;i<=1000;i=i+a){
        System.out.println(i);
    }
}}
