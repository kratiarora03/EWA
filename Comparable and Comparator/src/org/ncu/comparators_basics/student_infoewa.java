package org.ncu.comparators_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student{
    public int id;
    public String name;
    public int CGPA;
    Student( int id, String name, int CGPA){
        this.id= id;
        this.name= name;
        this.CGPA= CGPA;
    }
}
class byCGPA implements Comparator<Student>{
    public int compare(Student a, Student b){
        if(a.CGPA==b.CGPA){
            if(a.name==b.name){
                if(a.id>b.id){
                    return -1;
                }
                if(a.id<b.id){
                    return +1;
                }
            }
            int  c =a.name.compareToIgnoreCase(b.name);
            return  c;
        }
        if(a.CGPA>b.CGPA){
            return -1;
        }
        if(a.CGPA<b.CGPA){
            return +1;
        }
        
        return 0;
    }
}

public class student_infoewa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Student> studentlist= new ArrayList<>(); 
        
        int inputs= sc.nextInt();
        
        int id, gpa;
        String name;
        for(int i=1;i<=inputs;i++){
            System.out.println("Enter id: ");
            id=sc.nextInt();
            System.out.println("Enter name: ");
            name=sc.next();
            System.out.println("Enter cgpa: ");
            cgpa=sc.nextInt();
            studentlist.add(new Student(id,name,cgpa));
        }
        Collections.sort(studentlist,new byCGPA());
        System.out.println("CGPA Sorted List is: ");
        for(int i=0;i<studentlist.size();i++){
            System.out.println("ID: "+studentlist.get(i).id+" Name: "+studentlist.get(i).name+" CGPA: "+studentlist.get(i).CGPA);
        }
    }
}
