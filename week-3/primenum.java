public class primenum {
    
    public static  void main(String[]args){
            
         int n=100;
        for(int i =2;i<=n;i++){
            boolean b =true;

         for (int j=2;j<i;j++){
            
            if(i%j==0){
               b=false;
                break;
            }
           
           }
            if(b){
                System.out.println(i);
            }
        }

    }
}
