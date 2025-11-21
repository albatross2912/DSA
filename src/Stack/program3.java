package Stack;

import java.util.Stack;

public class program3 {

    public static void main(String[] args) {

        String str ="james";
        Stack<String> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i)+"");
        }

        String res = "";
        for(int i=0;i<str.length();i++){
            res = res+stack.peek();
            stack.pop();
        }


            System.out.println(res);





    }

}
