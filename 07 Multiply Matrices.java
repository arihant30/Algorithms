class GfG
{
      public static void multiply(int A[][], int B[][], int C[][], int N)
        {
            int row1=N;
            int col2=N;
            int row2=N;
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        C[i][j]+=A[i][k]*B[k][j];
                    }
                }
            }
            
        }
}
