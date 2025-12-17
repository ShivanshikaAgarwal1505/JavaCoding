import java.util.*;

class MinStack{
    private Stack<Integer> stack;
    private Stack<Integer> minstack;
    
    public MinStack(){
        stack=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int x){
        stack.push(x);
        if(minstack.isEmpty() || minstack.peek()>x) minstack.push(x);
        else minstack.push(minstack.peek());
    }
    
    public void pop(){
        if(!stack.isEmpty()){
            stack.pop();
            minstack.pop();
        }
    }
    
    public int top(){
        return stack.peek();
    }
    
    public int getMin(){
        return minstack.peek();
    }
}
public class Main {
    // Driver (for custom input testing)
    public static void main(String[] args) {
        MinStack obj=null;
        Scanner sc = new Scanner(System.in);

        List<Object> out=new ArrayList<>();
        
        String input = sc.nextLine().trim();
        input=input.substring(1, input.length()-1).replaceAll("\"", "");
        String[] op=input.split(",");
        
        String input2 = sc.nextLine().trim();
        input2=input2.substring(1, input2.length()-1);
        String[] val=input2.split(",");
        
        for(int i=0; i<val.length; i++){
            val[i]=val[i].replaceAll("\\[", "").replaceAll("\\]", "").trim();
        }
        
        for(int i=0; i<val.length; i++){
            String o=op[i];
            
            switch(o){
                case "MinStack":
                    obj=new MinStack();
                    out.add(null);
                    break;
                case "push":
                    obj.push(Integer.parseInt(val[i]));
                    out.add(null);
                    break;
                case "pop":
                    obj.pop();
                    out.add(null);
                    break;
                case "getMin":
                    out.add(obj.getMin());
                    break;
                case "top":
                    out.add(obj.top());
                    break;
            }
        }
        
        System.out.println(out);
        sc.close();
    }
}
