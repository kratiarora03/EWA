package org.ncu.comparators_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class mainclass {
	
	    public static void main(String[] args) {
	        List<Player> p=new ArrayList()<Player>();
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter number of records you want to enter : ");
	        int data=sc.nextInt();
	        for(int i=1;i<=data;i++){
	            System.out.println("Enter Name : ");
	            String n=sc.next();
	            System.out.println("Enter Score : ");
	            int s=sc.nextInt();
	            System.out.println();
	            p.add(new Player(n,s));
	        }

	        p.forEach(System.out::println);
	        System.out.println("List AFTER SORTING");
	        Collections.sort(p,new Comparator<Player>() {

	            public int compare(Player p1,Player p2){
	                if(p1.name.equals(p2.name)){
	                    return p1.score-p2.score;
	                }
	                else{
	                    return p1.name.compareTo(p2.name);
	                }
	            }
	        });
	        
	        p.forEach(System.out::println);

	    }
	}



