class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        
        for(int j=0; j<b.length; j++){
                set.add(b[j]);
        }
        
        for(int num : set){
            arr.add(num);
        }
        
        Collections.sort(arr);
        return arr;
    }
}
