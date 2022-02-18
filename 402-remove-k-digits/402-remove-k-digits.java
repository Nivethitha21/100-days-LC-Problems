class Solution {
    public String removeKdigits(String num, int k) {
        //case where all elements needed to be removed
        if(num.length()==k) {
            return "0";
        }
        //take stack to hold data
        Deque<Character> stack = new LinkedList<>();
        stack.push(num.charAt(0));
        //iterate each element
        for(int i=1;i<num.length();i++) {
            //loop and remove from stack till top element is greater then current element
            //once k reaches 0 it means no need to delete further.
            while(!stack.isEmpty() && k>0 && stack.peek()>num.charAt(i)) {
                stack.pop();
                k--;
            }
            //item will be added to stack in every case.
            stack.push(num.charAt(i));
        }
        //now we have stack with all the data except few elements which are removed.
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()) {
            //if k> 0 it means further deletion required from end
            if(k>0) {
                stack.pop();
                k--;        
            } else {
                //else build the answer StringBuilder
                ans.insert(0,stack.pop());
            }
        }
        //remove leading zero now
        while(1<ans.length() && ans.charAt(0)=='0') {
            ans.deleteCharAt(0);
        }
        //return ans.
        return ans.toString();
    }
}