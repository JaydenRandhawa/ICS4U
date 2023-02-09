public class ScoresIncreasing {
    public static void main(String[] args) {
        int[] scores = {12, 19, 15, 17};
        System.out.println(scores(scores));
    }

    public static boolean scores(int[] scores) {
        for(int i=0; i<(scores.length - 1); i++){
            if(scores[i] > scores[i+1]){
                return false;
            }
        }
        return true;
    }

    
}
