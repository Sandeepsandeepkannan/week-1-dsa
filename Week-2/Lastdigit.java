public class Lastdigit {
 
    public static void main(String[]args){
      int n=54564;
      int total=0;

      while(n>0){

        int lg=n%10;
        total=total+lg;
        
        System.out.println(lg);
         n=n/10;

      }
       System.out.println(total);
      

    }


}
