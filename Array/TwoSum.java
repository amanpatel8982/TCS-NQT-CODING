package Array;

public class TwoSum 
{

    public static int[] sum(int target,int num[])
    {
         
      
        for (int i = 0; i < num.length; i++) 
        {
            for (int j =  i + 1 ; j < num.length; j++) 
            {
                if(num[i] + num[j] == target)
                {
                  return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }
    public static void main(String[] args) 
    {
        int num[] =  {2, 7, 11, 15};
        int target = 9;

        System.out.println(sum(target, num));

        
    }
    
}


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{}; // No solution found
//     }
// }