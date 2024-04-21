import java.lang.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.*;
// class KthLargest {

//     public int kth;
//     public int[] arr = {};

//     public KthLargest(int k, int[] nums) {
//         this.kth = k;
//         this.arr = nums;
//     }
    
//     public int add(int val) {
//         int[] arr2 = new int[this.arr.length+1];
//         System.arraycopy(this.arr, 0, arr2, 0, this.arr.length);
//         arr2[this.arr.length] = val;
//         this.arr = arr2;
//         Arrays.sort(this.arr);
//         return this.arr[this.arr.length-this.kth];
//     }
// }

class KthLargest {
    private static int k;
    private PriorityQueue<Integer> heap;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();
        
        for (int num: nums) {
            heap.offer(num);
        }
        
        while (heap.size() > k) {
            heap.poll();
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) {
            heap.poll();
        }

        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */