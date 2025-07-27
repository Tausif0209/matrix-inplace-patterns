public class SetMatrixZeros {
  public void setMatrixZeroes(int[][] mat) {
       boolean firstRow=false,firstCol=false;
       for(int el: mat[0]) firstRow= firstRow || el==0;
       for(int i=0;i<mat.length;i++) firstCol=firstCol || mat[i][0]==0;
       for(int i=1;i<mat.length;i++){
           for(int j=1;j<mat[0].length;j++){
               if(mat[i][j]==0) {
                   mat[i][0]=0;
                   mat[0][j]=0;
               }
           }
       }
       for(int i=1;i<mat[0].length;i++){
           if(mat[0][i]!=0) continue;
           for(int j=1;j<mat.length;j++) mat[j][i]=0;
       }
       for(int i=1;i<mat.length;i++){
           if(mat[i][0]!=0) continue;
           for(int j=1;j<mat[0].length;j++) mat[i][j]=0;
       }
       if(firstRow) {
           for(int i=0;i<mat[0].length;i++) mat[0][i]=0;
       }
       if(firstCol){
           for(int i=0;i<mat.length;i++) mat[i][0]=0;
       }
        
    }
}
