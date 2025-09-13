public class maximumAreaOfLongestDiagonalRectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
       int m = dimensions.length;
       double maxdiag = 0;
       int maxarea = 0;
        for(int i=0; i<m; i++){
          int l = dimensions[i][0];
          int b = dimensions[i][1];
          int area = l*b;
          double diag = Math.sqrt(l*l + b*b);
          if (diag > maxdiag){
              maxdiag = diag;
              maxarea = area;
          }else if (diag==maxdiag){
              if(area > maxarea){
                  maxarea=area;
              }
          }
        }

    return maxarea;
    }
}
