import java.util.Stack;

public class LeetCode_1021RemoveTheOuterMostParenthesis {
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
        String ans=removeOuterParentheses(s);
        System.out.println(ans);
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        int depth=0;
        StringBuilder builder=new StringBuilder();
//        for(char ch:s.toCharArray()){
//            if(ch=='('){
//                if(!stack.isEmpty()){
//                 builder.append(ch);
//                }
//                stack.push(ch);
//            }else{
//                stack.pop();
//                if(!stack.isEmpty()){
//                    builder.append(ch);
//                }
//            }
//        }
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(depth>0){
                    builder.append(ch);
                }
                depth++;
            }else{
                depth--;
                if(depth>0){
                    builder.append(ch);
                }
            }
        }


        return builder.toString();
    }
}
