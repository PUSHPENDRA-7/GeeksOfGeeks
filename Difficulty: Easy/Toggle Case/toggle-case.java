class Solution {
    public String toggleCase(String s) {
        // code here
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            if(Character.isLowerCase(arr[i])){
                arr[i] = Character.toUpperCase(arr[i]);
            }else{
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        return new String(arr);
        
    }
}
