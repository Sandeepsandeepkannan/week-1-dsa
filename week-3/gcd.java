public class gcd {


    public static void main(String []args){
          int a=24,b=36;
         int gcd=1;
        for(int i=2;i<=b;i++){
           
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.print(gcd);
       
    }
    
}
