package programs;
import java.util.Stack;
public class PrintNextSuccessor {
    static int[] next(int nums[]){
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                result[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        return result;
    }
    public static void main(String arg[]){
        int nums[]={5,1,2,6,4,8,3,9};
        int res[]=next(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" -> "+res[i]);
        }
    }
}
