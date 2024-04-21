class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        backtrack(candidates, target, ans, row, 0);
        return ans;
    }

    public void backtrack(int[] candidates, int target, ArrayList<List<Integer>> ans, ArrayList<Integer> row, int start){
        if(target==0){
            ans.add(new ArrayList<Integer>(row));
        }
        else if(target<0)return;

        for(int i = start;i<candidates.length; i++){
            row.add(candidates[i]);
            backtrack(candidates, target-candidates[i], ans, row, i);
            row.remove(row.size()-1);
        }
    }
}