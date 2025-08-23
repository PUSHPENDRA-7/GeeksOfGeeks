// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
       
        int count = 0;
        // code here
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        return count;
    }
}
