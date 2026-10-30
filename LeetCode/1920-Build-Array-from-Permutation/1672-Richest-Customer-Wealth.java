class Solution {
    
    public int maximumWealth(int[][] accounts) {
    
        
        int[] arr=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
            
                arr[i]+=accounts[i][j];
                

                }
    
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<max){
                max=max;

            }
            else{
                   continue;
            }
        }
        return max;
    }
}
