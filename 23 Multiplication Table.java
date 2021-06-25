class Solution{
    static ArrayList<Integer> getTable(int N){
        ArrayList<Integer> multable= new ArrayList<>();
        for(int i=1;i<=10;i++){
            multable.add(N*i);
        }
        return multable;
    }
}
