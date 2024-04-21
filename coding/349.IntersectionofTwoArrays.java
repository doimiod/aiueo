class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<Integer>();
    for (Integer n : nums1) set1.add(n);
    HashSet<Integer> set2 = new HashSet<Integer>();
    for (Integer n : nums2) set2.add(n);

    set1.retainAll(set2);

    int [] output = new int[set1.size()];
    int idx = 0;
    for (int s : set1) output[idx++] = s;
    return output;
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int num1Max = nums1[nums1.length-1];
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

      for(int i = 0; i<nums2.length; i++){
        int num = nums2[i];
        if(num > num1Max)break;
        if(Arrays.binarySearch(nums1, num) >=0){
          if(!map.containsKey(num))map.put(num,num);
        }
      }

      int[] ans = map.values().stream().mapToInt(Integer::intValue).toArray();
      return ans;
    }
}