//390. Elimination Game

public class eliminationGame {
    public int lastRemaining(int n) {
        int head = 1;
        int step = 1; //gap between subsequent numbers
        int remaining = n;
        boolean isLeftToRight = true;


        while(remaining > 1){
            if(isLeftToRight || remaining % 2 == 1){
                head+=step;
            }
            remaining/=2;
            step*=2;
            isLeftToRight = !isLeftToRight;

        }

        return head;
    }
}
