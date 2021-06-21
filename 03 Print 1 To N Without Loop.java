class Solution
{
    
  public void printNos(int N)
    {
        int k=0;
    if(N<1){
        return;
    }
    printNos(N-1);
    System.out.print(N+" ");
    }
}
