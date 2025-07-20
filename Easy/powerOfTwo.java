class powerOfTwo {
    public boolean isPowerOfTwo(int n) {

        if(n==1){
            return true;
        }

        if(n<=0 || n%2==1){
            return false;
        }

        return isPowerOfTwo((int)Math.floor(n/2));
    }
}
