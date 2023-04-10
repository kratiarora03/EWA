package org.ncu.comparators_basics;

import java.util.Collections;
import java.util.Comparator;

public class Player {
	
	    String name;
	    int score;

	    public Player(String name,int score){
	        this.name=name;
	        this.score=score;
	    }

	    public String getName(){
	        return name;
	    }

	    public void setName(String name){
	        this.name=name;
	    }

	    public int getScore(){
	        return score;
	    }

	    public void setScore(int score){
	        this.score=score;
	    }

	    public String toString(){
	        return "Player name : ["+name+" Score : "+score+"]";
	    }

	    // public int compareTo(Player p){
	    //     if(this.getScore()>p.getScore())
	    //     return -1;
	    //     else if(this.getScore()<p.getScore()){
	    //         return 1;
	    //     }
	    //     else{
	    //         return 0;
	    //     }

	    
	}

	

