public class aliceAndBobPlayingFlowerGame {
    public long flowerGame(int n, int m) {
        long evenN = n/2;
        long oddN = (n+1)/2;
        long evenM = m/2;
        long oddM = (m+1)/2;

        return evenN*oddM + oddN*evenM;
    }
}
