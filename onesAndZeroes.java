class Solution {
    ArrayList<ArrayList<String>> res;
    public int findMaxForm(String[] strs, int m, int n) {
        int count=0;
         res=new ArrayList<>();
        //subsets
        subsets(strs,0,new ArrayList<>());
        for(ArrayList<String> a2:res)
        {
            int zero=0;
            int one=0;
            int size=a2.size();
            for(String i:a2)
            { 
                for(int j=0;j<i.length();j++)
                {
                    if(i.charAt(j)=='0')
                      zero++;
                    else
                        one++;
                }
            }
            if(zero<=m && one<=n && count<size)
            {
                count=size;
            }

            }
        return count;
        
    }
    public void subsets(String strs[],int i,ArrayList<String> a)
    {
        if(i==strs.length)
        { res.add(a);
         return ;}
        if(i>strs.length)
            return;
            ArrayList<String> a1=new ArrayList<>(a);
        a1.add(strs[i]);
        subsets(strs,i+1,new ArrayList<>(a1));
        subsets(strs,i+1,new ArrayList<>(a));
    }
    
}
///////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    int max=0;
    public int findMaxForm(String[] strs, int m, int n) {
        max=0;
        HashMap<String,Integer> h=new HashMap<>();
       return dfs(strs,0,m,n,h);
      
    }
    public int dfs(String strs[],int i,int m,int n,HashMap<String,Integer> h)
    {
     if(i>=strs.length || m+n==0)
     {
         
         return 0;
     }
        String x=i+"leet"+m+"code"+n;
        if(h.containsKey(x))
            return h.get(x);
        String s=strs[i];
        int c1=0;
        int c2=0;
        int countzero=countZ(s);
        int countone=s.length()-countzero;
        if(m-countzero>=0 && n-countone>=0)
            c1=1+dfs(strs,i+1,m-countzero,n-countone,h);
       
        c2=dfs(strs,i+1,m,n,h);
        int d= Math.max(c1,c2);
        h.put(x,d);
        return d;
    
    
    
    
    
    
    }
    public int countZ(String s)
    {
        int count1=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
                count1++;
            
            
        }
        return count1;
    }
    
}