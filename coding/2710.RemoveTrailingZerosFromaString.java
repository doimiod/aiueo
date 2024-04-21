class Solution {
    public String removeTrailingZeros(String num) {
        boolean started = false;
        boolean finished = false;
        int start = 0;
        int finishPoint = num.length()-1;
        while(start<=finishPoint){
            if(!started && num.charAt(start) == '0')start++;
            else started = true;
            if(!finished && num.charAt(finishPoint) == '0')finishPoint--;
            else finished = true;
            if(started && finished)break;
        }
        return num.substring(start,finishPoint+1);
    }
}