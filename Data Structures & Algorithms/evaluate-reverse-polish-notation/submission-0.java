class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> pq = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+")) {
                int a = pq.pop();
                int b = pq.pop();
                pq.push(b + a);
            }
            else if(tokens[i].equals("-")) {
                int a = pq.pop();
                int b = pq.pop();
                pq.push(b - a);
            }
            else if(tokens[i].equals("*")) {
                int a = pq.pop();
                int b = pq.pop();
                pq.push(b * a);
            }
            else if(tokens[i].equals("/")) {
                int a = pq.pop();
                int b = pq.pop();
                pq.push(b / a);
            }
            else {
                pq.push(Integer.parseInt(tokens[i])); // FIXED
            }
        }
        return pq.pop();
    }
}