public class LeetCode_409LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        int ans=longestPalindrome(s);
        System.out.println(ans);
    }
    public static int longestPalindrome(String s) {
//       int freq[]=new int[58];
//       int count=0;
//       boolean isOdd=false;
//        for (int i = 0; i < s.length(); i++) {
//            freq[s.charAt(i)-'A']++;
//        }
//        for (int num:freq) {
//            if(num!=0 && num%2==0){
//                count+=num;
//            }else if (num%2!=0){
//                count+=num-1;
//                isOdd=true;
//            }
//        }
//        if(isOdd)count++;
//
//        return count;

        int ar[]=new int[52];
        for(char x:s.toCharArray()){
            if(x>=97){
                ar[x-97]++;
            }
            else{
                ar[x-39]++;
            }
        }
        int count=0;
        boolean isOdd=false;
        for (int i = 0; i < 52; i++) {
            if(ar[i]%2==0){
                count+=ar[i];
            }else{
                count+=ar[i]-1;
                isOdd=true;
            }
        }
        return isOdd?count+1:count;
}
}