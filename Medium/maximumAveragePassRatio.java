import java.util.PriorityQueue;

public class maximumAveragePassRatio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        //Greedy method is used
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b) -> Double.compare(b[0],a[0])); //Note how double array is stored, b comes before a
        int n = classes.length;
        double totalAvg = 0;

        //Calculate gain of each class
        for(int i = 0; i < n; i++){    
            int[] curr = classes[i];
            double pass = curr[0];
            double total = curr[1];
            double gain = calculateGain(pass,total);
            pq.offer(new double[]{gain,pass,total}); //Note the difference between offer function and add, also see how new double array is passed as the argument
        }

        //Give the extra students to class with the highest gain, note that after subsequent additions, the marginal gain may decrease

        for(int i = 0; i<extraStudents; i++){
            double[] curr = pq.poll();
            double newPass = curr[1]+1;
            double newTotal = curr[2]+1;
            double newGain = calculateGain(newPass,newTotal);
            pq.offer(new double[]{newGain,newPass,newTotal});
        }

        while(!pq.isEmpty()){
            double[] curr = pq.poll();
            totalAvg += curr[1]/curr[2]; 
        }

        return totalAvg/n;

    }

    public double calculateGain(double pass, double total){
        return (pass+1)/(total+1) - pass/total;
    }
}
