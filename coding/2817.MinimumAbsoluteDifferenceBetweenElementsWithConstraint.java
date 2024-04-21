class Solution {
		public int minAbsoluteDifference(List<Integer> nums, int x) {
			int n = nums.size();
			TreeSet<Integer> all = new TreeSet<>();
			int ans = Integer.MAX_VALUE;
			for(int i = n-1;i >= 0;i--){
				int cur = nums.get(i);
				if(i + x < n){
					all.add(nums.get(i+x));
				}
				Integer ceil = all.ceiling(cur);
				Integer floor = all.floor(cur);
				if(ceil != null){
					ans = Math.min(ans, ceil - cur);
				}
				if(floor != null){
					ans = Math.min(ans, cur - floor);
				}
			}
			return ans;
		}
}