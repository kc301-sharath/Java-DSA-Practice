class Solution {
    public int singleNumber(int[] nums) {
    
        
        for (int i = 0; i < nums.length; i++) {
            
            boolean founddup=false;
            for(int j=0;j<nums.length;j++){
                if((i!=j )&&( nums[i]^nums[j])==0){
                    founddup=true;
                }
         
            }
            if(founddup==false){
                return nums[i];
            }
             }
             if(nums.length==1){
                return nums[0];
             }
            return -1;
    }
}
