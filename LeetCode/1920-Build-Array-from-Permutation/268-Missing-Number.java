class Solution {
    public int missingNumber(int[] nums) {
        int[] arr=new int[nums.length];
        int isum=0;
        int csum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
           
           arr[i]=i;

        }
        for(int i=0;i<n;i++){
            if((arr[i]^nums[i])==0){
                isum=isum^nums[i];
            }
        }
    
        return isum;
    }
}
