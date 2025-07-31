// User function Template for Java

class Solution {
    static void insertBottom(Stack<Integer> s, int element){
        if(s.isEmpty()){
            s.push(element);
            return ;
        }
        
        int top = s.pop();
        insertBottom(s,element); // insert element
        s.push(top); //top element insert;
    }
    static void reverse(Stack<Integer> s) {
        // add your code here
        if(s.isEmpty())
            return;
            
        int top = s.pop();
        reverse(s);
        insertBottom(s,top);
    }
}