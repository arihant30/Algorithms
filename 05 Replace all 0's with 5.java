public static void convertFive(int n){
        Integer[] a=new Integer[100];
        int x=0;
        int sum=0;
        while(n>0){
            int val=n%10;
            if(val==0) a[x] =5;
                
            else   a[x]=val;

                n=n/10;
                x++;

        }
        for(int i=x-1;i>=0;i--){
            sum=sum*10+a[i];
        }
        System.out.println(sum);
}
