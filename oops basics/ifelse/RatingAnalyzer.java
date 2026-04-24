import java.util.*;

public class RatingAnalyzer {
    public static void main(String[] args){
        int[] ratings={4,5,3,4,5};
        int sum=0;
        int max=ratings[0];
        for(int i=0;i<ratings.length;i++){
            sum+=ratings[i];
            if(ratings[i]>max){
                max=ratings[i];
            }
        }
        double avg=(double) sum/ratings.length;
        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Maximum Rating: " + max);
        System.out.println("Average Rating: " + avg);
    }
    
}
