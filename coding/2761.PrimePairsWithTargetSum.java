class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();
        if(n==1 || n==2)return arr;
        boolean[] booArr = sieveOfEratosthenes(n);
        for (int i = 2; i <= n/2; i++) {
            if (booArr[i] && booArr[n-i]) {
                ArrayList<Integer> row = new ArrayList<>();
                row.add(i);
                row.add(n-i);
                arr.add(row);
                
            }
        }
        return arr;
    }
    
    public static boolean[] sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        
        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }
}