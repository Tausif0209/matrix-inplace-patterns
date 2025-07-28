public class BeautifulMatrix {
  public static int balanceSums(int[][] mat) {
       int n=mat.length;
       if(n==1) return 0;
       int max=0,total=0;
       for(int i=0;i<n;i++){
           int rowSum=0,colSum=0;
           for(int j=0;j<n;j++){
               rowSum+=mat[i][j];
               colSum+=mat[j][i];
               total+=mat[i][j];
           } 
           max=Math.max(max,Math.max(rowSum,colSum));
       }
    //   int op=0;
    //   for(int[] a:mat){
    //       op+=max;
    //       for(int i=0;i<a.length;i++) op-=a[i];
    //   }
    //     return op;
    return n*max-total;
    }
}
