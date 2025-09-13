public class convertIntegerToTheSumOfTwoNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        
        int num1 = 1;
        int[] result = new int[2];

        while(true){
            
            int num2 = n - num1;
            
            if(noZero(num2) && noZero(num1)){
                result[0] = num1;
                result[1] = num2;
                return result;
            }

            num1++;

        }
    }

    public boolean noZero(int num){
        while (num > 0) {
            if (num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
