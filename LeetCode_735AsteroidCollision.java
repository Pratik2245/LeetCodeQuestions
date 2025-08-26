import java.util.Arrays;
import java.util.Stack;
public class LeetCode_735AsteroidCollision {
    public static void main(String[] args) {
        int arr[]={4,7,2,1,1,-3,-7,17,15,-16};
        int ans[]=collision(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] collision(int asteroids[]){
        Stack<Integer> stack=new Stack<>();

        int top=-1;

        for(int ast:asteroids){
            boolean destroyed = false;
            //process collision
            while (top>=0 && asteroids[top]>0 && ast<0 ){
                if(asteroids[top]< -ast){
                    top--;
                    continue;
                }else if (asteroids[top]== -ast){
                    top--;
                }
                destroyed=true;
                break;
            }
            if(!destroyed){
                asteroids[++top]=ast;
            }

        }
        return Arrays.copyOfRange(asteroids, 0, top + 1);


    }
}