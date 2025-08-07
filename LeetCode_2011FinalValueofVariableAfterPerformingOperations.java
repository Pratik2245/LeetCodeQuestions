public class LeetCode_2011FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String operations[] = {"++X","++X","X++"};
        int ans=finalValueAfterOperations(operations);
        System.out.println(ans);
    }
    public static int finalValueAfterOperations(String[] operations) {
//        int count=0;
//        for (int i = 0; i <operations.length ; i++) {
//            switch (operations[i]){
//                case "++X":
//                    ++count;
//                    break;
//                case "X++":
//                    count++;
//                    break;
//                case "--X":
//                    --count;
//                    break;
//                case "X--":
//                    count--;
//                    break;
//            }
//        }
//        return count;
        int count=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].charAt(1)=='+')
                count++;
            else
                count--;
        }
        return count;
    }
}
