package org.ncu.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Question_8 {
	class play implements Comparator<play>{
	    int id;
	    String name;
	    double strike;
	    int runs;
	    
	    play(){
	        
	    }
	    
	    play(int id,String name,double strike, int runs){
	        this.id=id;
	        this.name=name;
	        this.strike=strike;
	        this.runs=runs;
	    }
	    
	    public int compare(play p,play r) {
	        if (p.strike<r.strike) {
	            return 1;
	        }else if(p.strike==r.strike) {
	            if (p.runs<r.runs) {
	                return 1;
	            }else if(p.runs==r.runs) {
	                if (p.id>r.id) {
	                    return 1;
	                }
	            }
	        }
	        return -1;
	    }
	}

	public class Players {

	    public static void main(String[] args) {
	        ArrayList<play> al=new ArrayList<>();
	        Scanner sc=new Scanner(System.in);
	        for (int i = 0; i <6; i++) {
	            int id=sc.nextInt();
	            String name=sc.next();
	            double strike=sc.nextDouble();
	            int runs=sc.nextInt();
	            play p1=new play(id,name,strike,runs);
	            al.add(p1);
	        }
	        
	        Collections.sort(al, new play());
	        
	        for(play p1:al) {
	            System.out.println(p1.name);
	        }

	    }

	}


}
