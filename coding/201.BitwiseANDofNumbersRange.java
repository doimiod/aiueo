class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // if(left<1 || (left<=1 && right>1))return 0;
        // if(left==right)return left;
        // int ans = right;
        // String lefBin = Integer.toBinaryString(left);
        // String rigBin = Integer.toBinaryString(right);
        // if(lefBin.length() != rigBin.length())return 0;
        // while(left<right){
        //     ans = ans & (right-1 & right);
        //     System.out.println(ans);
        //     if(ans == 0)return 0;
        //     // if(!(identifer == 0 && identifer2 == 0)){
        //     //     identifer = identifer >>1;
        //     //     identifer2 = identifer2 >>1;
        //     // }  
        //     // if(left == 0 && right>0)return 0;
        //     // left++;
        //     right--;
        // }
        // return ans;
        int shift = 0;
        // find the common 1-bits
        while (left < right) {
            left >>= 1;
            right >>= 1;
            System.out.println(left);
            System.out.println(right);
            System.out.println("-----------------------");
            ++shift;
        }
            return left << shift;
    }
}

