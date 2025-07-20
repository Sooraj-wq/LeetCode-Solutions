public class powerOfFour {
    public boolean isPowerOfFour(int n) {
        
        long base = 1;
        
        while(base < n){
            base*=4;
        }

        return base == n;
    }
}
