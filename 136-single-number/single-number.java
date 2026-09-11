class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 0 ; i< nums.length ; i++){
boolean hasdupcatie = false ;
for(int j = 0; j < nums.length ; j++){
if(i != j && nums[i] == nums[j]){
hasdupcatie = true;

break ;


}


}if(!hasdupcatie){
return nums[i];


}


        }
        return -1;
        
    }
}