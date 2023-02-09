public class ScoresAverage{
    public static void main(String[] args) {
        int[] scores = {2, 2, 4, 4};

        System.out.println(scoresAverage(scores));
    }

    public static int scoresAverage(int[] scores) {
        int halfPoint = scores.length/2;

        int av1 = average(scores, 0, halfPoint);
        int av2 = average(scores, halfPoint+1, scores.length-1);

        if(av1 > av2){
            return av1;
        }
        else{
            return av2;
        }
    }


static int average(int[] scores, int start, int end){
    int average = 0;
    for(int i = start;i<end-start;i++){
        average += scores[i];
    }
    average /= (scores.length/2                    );
    return average;

}
}
}