import java.util.ArrayList;

public class divisorofn {
    public static void main(String[] args) {

        class Solution {
                public ArrayList<Integer> getDivisors(int n) {
                    ArrayList<Integer> numbers=new ArrayList<>(50);
                    for(int i=1;i<=n;i++){
                        if(n%i==0){
                        numbers.add(i);           
                    }        
                }
                return numbers;
            }}

        Solution obj = new Solution();
        ArrayList<Integer> result = obj.getDivisors(12);
        System.out.println(result);
    }
}