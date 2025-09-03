class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
         int curr = Integer.MIN_VALUE;
         
         for(int i = arr.length-1; i>=0; i--){
            if(arr[i] >= curr){
                list.add(arr[i]);
                curr = arr[i];
            }
         }
         Collections.reverse(list);
         return list;
    }
}
