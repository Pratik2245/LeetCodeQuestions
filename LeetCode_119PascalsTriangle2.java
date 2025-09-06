import java.util.ArrayList;
import java.util.List;

public class LeetCode_119PascalsTriangle2 {
    public static void main(String[] args) {
      int row=30;
      getRow(row);
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        long res=1;
        list.add((int)res);
        for(int col=1;col<=rowIndex;col++){
            res= res*(rowIndex+1-col)/col;
            list.add((int)res);
        }
        return list;
    }
}