public class reverse {
 
    public static void main(String[]args){

        int n=1234999,sum=0,l;

        while(n>0){
            l=n%10;
            sum=sum*10+l;
            n=n/10;

        }
        System.out.println(sum);
    }
}
