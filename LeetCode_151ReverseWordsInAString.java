import java.util.Arrays;

public class LeetCode_151ReverseWordsInAString {
  public static void main(String[] args) {
    // String s = "  Hello   world   ";
    // String[] words = s.trim().split("\\s+"); // Removes leading/trailing and multiple spaces
    // System.out.println(Arrays.toString(words));
    // StringBuilder builder = new StringBuilder();
    // for (int i = words.length - 1; i >= 0; i--) {
    //   builder.append(words[i] + " ");
    // }
    // System.out.println(builder);

  }
  public String reverseWords(String s) {
    char[] ch=s.toCharArray();
    int n=s.length();
    char res[] = new char[n];
    int res_index=0;
    int end=n-1;
    while(end>=0){
        while(end>=0 && ch[end]==' ')
          end--;
        int start=end;
        while(start>=0 && ch[start]!=' ')
          start--;
        if(res_index>0){
            res[res_index++]=' ';
        }
        for(int i=start+1;i<=end;i++){
            res[res_index++]=ch[i];
        }
        end=start-1;
    }
    return new String(res,0,res_index).trim();
    }
}
