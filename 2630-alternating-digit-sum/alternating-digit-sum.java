class Solution {
    public int alternateDigitSum(int n) {
        
        int temp=n;
        int count=0;
        while(temp!=0)
        {
            count++;
            temp/=10;
        }

        int sum=0;
        temp=n;
        while(temp!=0)
        {
            if(count%2==0)
            {
               sum=sum+(-(temp%10)); 
            }
            else
            {
                sum=sum+(temp%10);
            }
            temp/=10;
            count--;
        }

        return sum;
    }
}