class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while(mainTank>0){
            if(mainTank >=5 && additionalTank > 0){
                distance = distance + 5*10;
                mainTank = mainTank - 5;
                mainTank++;
                additionalTank--;
            }else{
                distance = distance + mainTank*10;
                mainTank = 0;
            }
        }
        return distance;
    }
}