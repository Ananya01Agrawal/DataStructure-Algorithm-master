
// class Solution {
//     public boolean containsDuplicate(int[] nums) { //time complexity O(n^2)
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j])
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// import java.util.Arrays;
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums); //time complexity O(nlogn)
//        for(int i=0;i<nums.length-1;i++) //time complexity O(n) 
//        {
//            if(nums[i]==nums[i+1])
//            return true;
//        }
//         return false;
//     }
// }   //total time complexity O(nlogn) + O(n) = O(nlogn)

 

import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> hs=new HashSet<>(); // --> time complexity O(1)
      for(int i=0;i<nums.length;i++) //time complexity O(n)
      {
          if(hs.contains(nums[i]))// --> time complexity O(1)
          return true; // --> time complexity O(1)
          else 
          hs.add(nums[i]);// --> time complexity O(1)
      }
      return false; // --> time complexity O(1)
    }
}

//total time complexity O(n) + O(1) + O(1) + O(1) + O(1) + O(1) = O(n) 