class Solution 
{
    public int countPrimes(int n) 
    {
        boolean sieve[]=new boolean[n+1];
        Arrays.fill(sieve,true);

        for(int i=2;i*i<=n;i++)
        {   
            if(sieve[i])
            {
                for(int j=i*i;j<=n;j+=i)
                sieve[j]=false;
            }
        }
            int count=0;
        for(int i=2;i<n;i++)
        {
            if(sieve[i]==true)
            
                count++;
        }
        return count;
    }
}
       
