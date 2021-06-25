class Solution{
    static List<Integer> get(int a,int b)
    {
        /* a=a+b;
        b=b-a;
        a=a-b; */
        ArrayList<Integer> swap=new ArrayList<>();
        swap.add(b);
        swap.add(a);
        return swap;
    }
}
