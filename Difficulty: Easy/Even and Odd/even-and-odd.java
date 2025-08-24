// User function Template for Java

class Solution {
    static void reArrange(int[] arr, int N) {
        // code here
        int even = 0 ,odd  = 1;
        int[] a = new int[N];
        for(int i=0; i<N; i++){
            if(arr[i] % 2 != 0){
                a[odd] = arr[i];
                odd+=2;
            }else{
                a[even] = arr[i];
                even+=2;
            }
        }
        for(int i=0; i<N; i++){
            arr[i] = a[i];
        }
    }
};