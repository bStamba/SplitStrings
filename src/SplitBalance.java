public class SplitBalance {

    public int balancedStringSplit(String s) {

        //Counters for our letters 'R', 'L', and int for our result.
        int rCounter = 0;
        int lCounter = 0;
        int result = 0;

        //Traverse the string char by char and increment the counters accordingly.
        //If counters R & L are greater than 0 and equal to each other then that is
        //our first substring. Increment results and reset counters.
        for(char c : s.toCharArray()){
            if(c == 'R'){
                rCounter++;
            }
            else{
                lCounter++;
            }

            if(rCounter > 0 && lCounter > 0 && rCounter == lCounter){
                result++;
                rCounter = 0;
                lCounter = 0;
            }
        }

        return result;
    }
}
