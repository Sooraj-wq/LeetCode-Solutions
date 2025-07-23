//50. Pow(x, n)
public class powXN {
    class Solution {
    
    public double myPow(double x, int n) {
        
        if(n<0){
            n = -n;
            return 1/power(x,n);
        }

        return power(x,n);
    }

    public double power(double x,int n){
        if(n==0){
            return 1; 
        }

        double product = power(x,n/2);

        if(n%2==0){
            return product*product;
        }
        else{
            return x*product*product;
        }
    }
}
}
