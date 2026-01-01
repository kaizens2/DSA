import java.util.logging.Logger;

public class SumOdDigits{
    public static void main(String[] args) {
        try {
            getSum(12345); //Approch 1  using %(Mod) operator
            getSum("12345"); // Approch 2 using char array
        } catch (Exception e) {
           Logger.getLogger(e.getMessage());
        }
       
    
    }

    static int getSum(int n){
        int sum = 0,r;
        while(n > 0){
            r = n % 10;
            sum += r;
            n/=10;
        }
        return sum;
    }
    static int getSum(String no){
        int sum = 0;
        char arr[] = no.toCharArray();
        int len = no.length()-1;
        while(len >= 0){
            sum+=(arr[len--]-'0');
        }
        return sum;
    }
} 