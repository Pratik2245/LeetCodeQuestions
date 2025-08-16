public class LeetCode_2264Largest3SameDigitNumberInString {
    public static void main(String[] args) {
        String s="2300019";
        String ans=largestGoodInteger(s);
        System.out.println(ans);
    }
    public static String largestGoodInteger(String num) {
//          16 percent success
//        int count=1;
//        int maxi=-1;
//        for (int i = 0; i < num.length(); i++) {
//            if(i>=1 && num.charAt(i)==num.charAt(i-1) ){
//                count++;
//                if(count==3){
//                  maxi=Math.max(Integer.parseInt(String.valueOf(num.charAt(i))),maxi);
//                }
//            }else{
//                count=1;
//            }
//        }
//
//        return maxi==-1?"": maxi + "" + maxi + maxi;

//        100% accuracy
        String[] numbers={"999","888","777","666","555","444","333","222","111","000"};
        for(String i:numbers){
            if(num.contains(i)){
                return i;
            }
        }
        return "";
//        81 percent accuracy
        //    char maxChar = 0;
        //     for (int i = 0; i <= num.length() - 3; i++) {
        //         char c = num.charAt(i);
        //         if (c == num.charAt(i + 1) && c == num.charAt(i + 2)) {
        //             if (c > maxChar) {
        //                 maxChar = c;
        //             }
        //         }
        //     }
        //     return maxChar == 0 ? "" : String.valueOf(maxChar).repeat(3);
    }
}
