public class LeetCode_3541FindMostFrequentVowelAndConsonant {
    public static void main(String[] args) {
        String  s = "aeiaeia";
        int ans=maxFreqSum(s);
        System.out.println(ans);
    }
    public static int maxFreqSum(String s) {
        int freq[]=new int[26];
      for(int i=0;i<s.length();i++){
          freq[s.charAt(i)-'a']++;
      }
      int vowelMax=0;
      int consMax=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u'){
               vowelMax=Math.max(vowelMax,freq[s.charAt(i)-'a']);
           }else{
               consMax=Math.max(consMax,freq[s.charAt(i)-'a']);
           }
       }
        System.out.println(vowelMax);
        System.out.println(consMax);
      return vowelMax+consMax;
    }
}
