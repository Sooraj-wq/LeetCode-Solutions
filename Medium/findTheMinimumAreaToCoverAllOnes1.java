public class findTheMinimumAreaToCoverAllOnes1 {
        public int minimumArea(int[][] grid) {
            int n = grid.length, m = grid[0].length;
            int rl = n, rh = -1, cl = m, ch = -1;
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[0].length; j++){
                    if(grid[i][j]==1){
                        rl = Math.min(i,rl);
                        rh = Math.max(i,rh);
                        cl = Math.min(j,cl);
                        ch = Math.max(j,ch);
                    }
                }
            }

            return (rh-rl+1)*(ch-cl+1);
    }
}
