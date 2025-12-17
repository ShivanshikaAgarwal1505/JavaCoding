import java.util.*;

class Main{
    public String parenthesisString(String s){
        char[] arr=s.toCharArray();
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(arr[i]=='(') stack.push(i);
            else if(arr[i]==')'){
                if(stack.isEmpty()) arr[i] = '#';
                else stack.pop();
            }
        }
        
        while(!stack.isEmpty()){
            arr[stack.pop()]='#';
        }
        
        StringBuilder sb= new StringBuilder();
        for(char c:arr){
            if(c!='#') sb.append(c);
        }
        
        return sb.toString();
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