// package codewithnavneet.office;

import codewithnavneet.gym.NavneetGym;

class Using extends NavneetGym{
    void metho2(){
        System.out.println(x);//public
        System.out.println(y);//protected
        // System.out.println(z);//default
        // System.out.println(a);//private
    }
    
}
public class UsingPackage{
    public static void main(String[] args){
        // System.out.println("I am class UsingPackage's Main method!");
        // NavneetGym g = new NavneetGym();
        // g.myMethod();
        // System.out.println(g.x);//public
        // System.out.println(g.y);//protected
        // System.out.println(g.z);//default
        // System.out.println(g.a);//private


        Using c = new Using();
        c.metho2();

    }
}