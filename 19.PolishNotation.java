import java.util.*;

class Main{
    public int polishNotation(String[] s){
        Stack<Integer> stack = new Stack<>();
        
        for(String c: s){
            if(c.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(c.equals("-")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a-b);
            }
            else if(c.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(c.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Main m=new Main();
        
        String str=sc.nextLine().trim();
        
        str=str.replace("[", "").replace("]", "").replace("\"", "");
        String[] s=str.split("\\s+|,");
        
        System.out.println(m.polishNotation(s));
        
        sc.close();
    }
}