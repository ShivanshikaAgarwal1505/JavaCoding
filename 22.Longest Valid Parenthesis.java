import java.util.*;

class Main{
    public int longestParenthesis(String s){
        int l=0, r=0, mlen=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') l++;
            else r++;
            
            if(l==r) mlen=Math.max(mlen, 2*l);
            else if(l<r) l=r=0;
        }
        r=l=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='(') l++;
            else r++;
            
            if(l==r) mlen=Math.max(mlen, 2*l);
            else if(l>r) l=r=0;
        }
        
        return mlen;
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Main sol=new Main();
        
        String s=sc.nextLine().trim();
        if(s.startsWith("\"") && s.endsWith("\"")){
            s=s.substring(1, s.length()-1);
        }
        
        System.out.println(sol.longestParenthesis(s));
        
        sc.close();
    }
}