import java.util.*;

class Main{
    public boolean validateStack(int[] pushed, int[] popped){
        Stack<Integer> s= new Stack<>();
        int j=0;
        
        for(int c:pushed){
            s.push(c);
            
            while(!s.isEmpty() && j<popped.length && s.peek()==popped[j]){
                s.pop();
                j++;
            }
            
        }
        
        return s.isEmpty();
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Main sol=new Main();
        
        String s=sc.nextLine().trim();
        String s2=sc.nextLine().trim();
        
        s=s.substring(1, s.length()-1);
        s2=s2.substring(1, s2.length()-1);
        
        if(s.startsWith("\"") && s.endsWith("\"")){
            s=s.substring(1, s.length()-1);
        }
        
        if(s2.startsWith("\"") && s2.endsWith("\"")){
            s2=s2.substring(1, s2.length()-1);
        }
        
        String[] s1=s.split(",");
        String[] s3=s2.split(",");
        
        int[] pushed=new int[s1.length];
        int[] popped=new int[s3.length];
        
        for(int i=0; i<s1.length; i++){
            pushed[i]=Integer.parseInt(s1[i]);
        }
        
        for(int i=0; i<s3.length; i++){
            popped[i]=Integer.parseInt(s3[i]);
        }
        
        System.out.println(sol.validateStack(pushed, popped));
        
        sc.close();
    }
}