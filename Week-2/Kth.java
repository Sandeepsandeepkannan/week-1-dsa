public class Kth {

    public static void main(String[]args){

       int a=9,b=5,k=1,num=0;

       int res=a;
       for(int i=1;i<b;i++){
        res=res*a;
       }


       for(int i=1;i<=k;i++){

           num=res%10;
           res=res/10;
       }
       System.out.println(num);

    }
}