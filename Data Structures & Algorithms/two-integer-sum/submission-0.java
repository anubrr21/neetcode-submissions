class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]={0,0};
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]+nums[j]==target){
                    
                    result[0]=j;
                    result[1]=i;
                  
                }

               
            }
        }
            return result;
        }
    }

   
