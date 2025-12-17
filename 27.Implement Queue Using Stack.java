import java.util.*;

class MyQueue{
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    
    public MyQueue(){
        s1= new Stack<>();
        s2= new Stack<>();
    }
    
    public void push(int x){
        s1.push(x);
    }
    
    public int pop(){
        peek();
        
        return s2.pop();
    }
    
    public int peek(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        
        return s2.peek();
    }
    
    public boolean empty(){
        return (s1.isEmpty() && s2.isEmpty());
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Object> out=new ArrayList<>();
        MyQueue q=null;
        
        String op1= sc.nextLine().trim();
        String val1= sc.nextLine().trim();
        
        op1=op1.substring(1, op1.length()-1).replace(" ", "").replace("\"", "");
        val1=val1.substring(1, val1.length()-1).replace(" ", "");
        
        String[] op=op1.split(",");
        String[] val=val1.split("],");
        for(int i=0; i<val.length;i++){
            val[i]=val[i].replace("[", "").replace("]", "");
        }
        
        for(int j=0; j<op.length; j++){
            String o=op[j];
            String v=val[j];
            
            switch(o){
                case "MyQueue":
                    q=new MyQueue();
                    out.add(null);
                    break;
                case "push":
                    q.push(Integer.parseInt(v));
                    out.add(null);
                    break;
                case "pop":
                    out.add(q.pop());
                    break;
                case "peek":
                    out.add(q.peek());
                    break;
                case "empty":
                    out.add(q.empty());
                    break;
            }
        }
        
        System.out.println(out);
           
    }
}