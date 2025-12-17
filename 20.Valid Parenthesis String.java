import java.util.*;

class Main{
    public boolean parenthesisString(String s){
        int high=0, low=0;
        
        for(char c: s.toCharArray()){
            if(c=='('){
                low++;
                high++;
            }
            else if(c==')'){
                if(low>0) low--;
                high--;
            }
            else{
                if(low>0) low--;
                high++;    
            }
            
            if(high<0) return false;
        }
        
        return low==0;
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Main sol=new Main();
        
        String s=sc.nextLine().trim();
        if(s.startsWith("\"") && s.endsWith("\"")){
            s=s.substring(1, s.length()-1);
        }
        
        System.out.println(sol.parenthesisString(s));
        
        sc.close();
    }
}