//486. Predict the Winner

public class predictTheWinner {
    public boolean predictTheWinner(int[] nums) {
        return winner(nums, 0, nums.length - 1, 0, 0, true);
    }

    public boolean winner(int[] nums, int start, int end, int score1, int score2, boolean chance) {
        if (start == end) {
            if (chance) {
                score1 += nums[start];
            } else {
                score2 += nums[start];
            }
            return score1 >= score2;
        }

        if (chance) {
            // Either branch must return true (OR)
            return winner(nums, start + 1, end, score1 + nums[start], score2, false) ||
                   winner(nums, start, end - 1, score1 + nums[end], score2, false);
        } else {
            //Both branches must return true (AND)
            return winner(nums, start + 1, end, score1, score2 + nums[start], true) &&
                   winner(nums, start, end - 1, score1, score2 + nums[end], true);
        }
    }
}
