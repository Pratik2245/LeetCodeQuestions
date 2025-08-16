public class LeetCode_1323Maximum69Number {
    public static void main(String[] args){
        int num=9996;
        int ans=maximum69Number(num);
        System.out.println(ans);
    }
    public static int maximum69Number (int num) {
//       String s=String.valueOf(num);
//       char ch[]=s.toCharArray();
//       for(int i=0;i<ch.length;i++){
//           if(ch[i]=='6'){
//               ch[i]='9';
//               break;
//           }
//       }
//       String s1=new String(ch);
//       return Integer.parseInt(s1);
        StringBuilder s= new StringBuilder();
        s.append(num);
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='6'){
               s.setCharAt(i,'9');
               break;
            }
            i++;
        }
        return Integer.parseInt(s.toString());
    }
}
