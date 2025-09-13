public class findTheNumberOfWaysToPlacePeople1 {
    public int numberOfPairs(int[][] points) {

        int validPair = 0;
        int len = points.length;
        boolean flag = false;

        for(int i = 0; i < len; i++){
            int[] pointA = points[i];
            
            for(int j = 0; j < len; j++){
    
                if(j==i){
                    continue;
                }
    
                int[] pointB = points[j];
                int xA = pointA[0];
                int yA = pointA[1];
                int xB = pointB[0];
                int yB = pointB[1];

                if(xA <= xB && yA >= yB){

                    if(len == 2){
                        return 1;
                    }
                    
                    for(int k = 0; k < len; k++){
                        
                        if(k==i || k==j){
                            continue;
                        }

                        int[] pointC = points[k];
                        int xC = pointC[0];
                        int yC = pointC[1];
                        
                        if(xC >= xA && xC <= xB && yC <= yA && yC >= yB){
                            flag = true;
                            break;
                        }
                    }
                    if(flag == false){
                        validPair++;
                    }else{
                        flag = false;
                    }
                }
    
            }
        }

        return validPair;
    }
}
