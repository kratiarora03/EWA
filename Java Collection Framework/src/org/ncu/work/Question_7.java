package org.ncu.arraylist;

import java.util.HashMap;
import java.util.Scanner;

public class Question_7 {
    public Boolean func(){
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> work=new HashMap<String,String>();
        System.out.println(" ENTER - 1.ADD 2.REMOVE 3.MODIFY GRADES 4.PRINT_ALLGRADES");
        int I=sc.nextInt();
        switch(I){
            case 1:
            System.out.print(" NAME : ");
            String name=sc.next();
            System.out.print(" GRADE : ");
            String Grade=sc.next();
            work.put(name,Grade);
            System.out.println(work.entrySet());
            break;

            case 2:
            System.out.println("type the name you want ot remove");
            String j=sc.next();
            work.remove(j);
            System.out.println(work.entrySet());
        }
        System.out.print("do you want to keep continuing  : ");
        int op=sc.nextInt();
        if(op==1){
            return false;
        }
        else return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Question_7 p7=new Question_7();
        boolean f=p7.func();
        if(f==true){
            p7.func();
        }

        
    }

}



