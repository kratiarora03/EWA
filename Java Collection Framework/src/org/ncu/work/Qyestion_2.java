package org.ncu.arraylist;

import java.util.Stack;
import java.util.regex.Pattern;

public class Qyestion_2 {
	public static void main(String[] args) {
        String str="Mary had a little lamb. Its fleece was white as snow.";
        String[] arrString=str.trim().split(Pattern.quote(" "));
        Stack<> stack =new Stack<>();

        for(String input : arrString) {
            if(input.endsWith(".")){
               stack.push(input.toLowerCase().substring(0, input.length() - 1));
               break;
            }
            else{
               stack.push(input);
            }
        }

        StringBuilder builder=new StringBuilder();
        while(!stack.isEmpty()){
            builder.append(stack.pop()).append(" ");
        }

        String reverse=builder.toString();
        System.out.println(reverse);
        
    }

}
