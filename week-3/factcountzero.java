public class factcountzero {
    
   public static void main (String []args){

    int n=19;
    long fact=1;
    for(int i=1;i<=n;i++){
      
        fact=fact*i;
    }

    
    long  count =0,l;
       while(fact>0){
         l=fact%10;
         if(l==0){
            count++; 

         }
         fact=fact/10;
         
       }

       System.out.println(count);



   }

}
