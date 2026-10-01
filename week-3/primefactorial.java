public class primefactorial {

    public static void main(String []args){

        int n=6,sum=1;
          
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                sum=sum+i;
             if(n/i!=i){
                sum=sum+(n/i);
             }
            }
        }
        if(sum==n){
            System.out.println("it is perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }

    }
    
}
