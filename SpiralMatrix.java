import java.util.ArrayList;

public class SpiralMatrix{
   public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        int rowStart=0,rowEnd=mat.length-1,colStart=0,colEnd=mat[0].length-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(colStart<=colEnd){
            for(int i=colStart;i<=colEnd;i++) list.add(mat[rowStart][i]);
            rowStart++;
            if(rowStart>rowEnd) break;
            for(int i=rowStart;i<=rowEnd;i++) list.add(mat[i][colEnd]);
            colEnd--;
            if(colStart>colEnd) break;
            for(int i=colEnd;i>=colStart;i--) list.add(mat[rowEnd][i]);
            rowEnd--;
            if(rowStart>rowEnd) break;
            for(int i=rowEnd;i>=rowStart;i--) list.add(mat[i][colStart]);
            colStart++;
        }
        return list;
    }
}
