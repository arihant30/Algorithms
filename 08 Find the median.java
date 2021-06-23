class Solution
{
    public int find_fact(int[] v)
    {
        int size=v.length;
        Arrays.sort(v);
        if(size % 2 == 0){
            return (v[size/2]+(v[(size/2)-1]))/2;
        }
        return v[size/2];
    }
}
