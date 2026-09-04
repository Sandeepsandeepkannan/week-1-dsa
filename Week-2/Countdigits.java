
public class Countdigits {

    public static void main(String[]args){
  
        int n =2134432;

        int c=0;
           
        while(n>0){

            int ld=n%10;
            c=c+ld;
            n=n/10;

        }
        System.out.println(c);
    }}