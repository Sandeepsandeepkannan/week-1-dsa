public class palindrome {
    
    public static void main(String[]args){

     int n=53235,l,sum=0;
     int temp=n;
     while(n>0){
        l=n%10;
        sum=sum*10+l;
        n=n/10;
        
     }
        if(temp==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println(" not a palindrome");
        }
    }
}
