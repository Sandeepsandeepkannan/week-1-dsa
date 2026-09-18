public class flsum {
    

    public int cornerDigitSum(int n) {
        int fd=0,ld;
        
        ld=n%10;
        
        while(n>0){
            int temp =n%10;
            n=n/10;
            if(n==0){
                fd=temp;
                
            }
        }
        int sum=fd+ld;
        return sum;
    }
};

