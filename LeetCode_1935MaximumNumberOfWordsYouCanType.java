public class LeetCode_1935MaximumNumberOfWordsYouCanType {
    public static void main(String[] args) {
       String text = "leet code", brokenLetters = "lt";
       int ans=canBeTypedWords(text,brokenLetters);
        System.out.println(ans);
    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        boolean freq[]=new boolean[26];
        for(char ch:brokenLetters.toCharArray()){
            freq[ch-'a']=true;
        }
        int count=0;
        int flag=0;
        for(char ch:text.toCharArray()){
            if(ch!=' ' && freq[ch-'a'] ){
               flag=1;
            }
            if(ch==' '){
                if(flag!=1){
                    count++;
                }
                flag = 0;
            }
        }
        if(flag!=1){
            count++;
        }
        return count;
    }
}
