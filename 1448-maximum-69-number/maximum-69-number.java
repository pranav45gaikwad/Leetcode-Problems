class Solution {
    public int maximum69Number (int num) {
            int cut=1000;

            while(cut!=0)
            {
                int dig = (num/cut)%10;
                if(dig==6)
                {
                    num=num+(3*cut);
                    break;
                }
                cut/=10;
            }

            return num; 
    }
}