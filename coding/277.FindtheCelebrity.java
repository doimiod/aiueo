/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        int a = 0;
        for(int i = 0; i<n-1; i++){
            if(knows(a,i+1))a=i+1;
        }
        System.out.println(a);
        for(int i = 0; i<n; i++){
            if(i!=a && (knows(a,i) || !knows(i,a)))return -1;
        }

        return a;
    }
}