public class ScoresAverage{
    public static void main(String[] args) {
        int[] scores = {5, 6};

        System.out.println(scoresAverage(scores));
    }

    public static int scoresAverage(int[] scores) {
        int halfPoint = scores.length/2;

        int av1 = average(scores, 0, halfPoint);
        int av2 = average(scores, halfPoint, scores.length);

        if(av1 > av2){
            return av1;
        }
        else{
            return av2;
        }
    }


static int average(int[] scores, int start, int end){
    int average = 0;
    int len = (scores.length>2)?end-start:(start == 0)?0:1;
    for(int i = start;i<= len;i++){
        average += scores[i];
        System.out.println(average);
    }
    average /= (end-start);
    return average;

}
}