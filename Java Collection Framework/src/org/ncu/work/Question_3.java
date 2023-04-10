package org.ncu.arraylist;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class Question_3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter the sentence you want to reverse-  ");
        String addstringvalue = scanner.nextLine();
           //create an if else statement to check the validity of the sentence
        if (addstringvalue == null || addstringvalue.length() == 0)
        {
            System.out.println("enter a valid sentence!!!!");
            return;
        }
        //now while the sentence valid we used the further method to reverse it as an output . 
        String reverse = WORDS_reverse_stack(addstringvalue);
        System.out.printf("reversed output is -  %s", reverse);
    }
    
    public static <E> String WORDS_reverse_stack(String inputString)
    {
        String[] arrString = inputString.trim().split(Pattern.quote(" "));
        Stack<E> stack1 = new Stack();
        for(String input : arrString)
        {
            stack1.push((E) input);
        }
        StringBuilder build = new StringBuilder();
        while( !stack1.isEmpty())
        {
            build.append(stack1.pop()).append(" ");
        }
        return build.toString();
    }
}



