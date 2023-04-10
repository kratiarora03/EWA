package org.ncu.arraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Question_1 {
	public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String>words=new ArrayList<>();
        File file=new File("C:\\Users\\91978\\OneDrive\\Desktop");
        Scanner sc=new Scanner(file);

        while(sc.hasNext()){
            String str=sc.next();
            words.add(str);
        }

        System.out.println("-----ALL THE DATA IN THE FILE------");
        System.out.println(words);

        System.out.println("LIST SIZE : "+words.size());

        System.out.println("------REVERSE ORDER OF LIST IS : ----------");
        ListIterator<String>itr=words.listIterator(words.size());
        while(itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
        System.out.println();

        System.out.println("----LIST OF WORDS IN PLURAL--------");
        while(itr.hasNext()){
            String plural_words=itr.next();
            if(plural_words.endsWith("s")){
                System.out.println(plural_words);
            }
        }

        System.out.println("-----LISTS AFTER REMOVING-------");
        while(itr.hasPrevious()){
            String plural_chng=itr.previous();
            if(plural_chng.endsWith("s")){
                itr.remove();
            }
        }
        sc.close();
           
    }
}
