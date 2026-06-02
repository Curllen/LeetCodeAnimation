import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int N = pushed.length;
        Stack<Integer> stack = new Stack();

        int j = 0;
        for (int x: pushed) {
            stack.push(x);
            while (!stack.isEmpty() && j < N && stack.peek() == popped[j]) {
                //锟斤拷头元锟截筹拷锟接ｏ拷栈锟斤拷元锟截筹拷栈
                stack.pop();
                j++;
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }
}