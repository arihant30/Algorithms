	public static int palinArray(int[] a, int n)
           {

                int flag=0;
                int nums=0;
                int temp;
                for(int i=0;i<n;i++){
                    int sum=0;

                    temp=a[i];
                    while(temp>0){
                        nums=temp%10;
                        sum=sum*10+nums;
                        temp/=10;
                    }
                    if(a[i]!=sum){
                       flag=0;
                       break;
                    } 
                    else flag= 1;
                }
                return flag;
            }
