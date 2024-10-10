package com.company;
class C1{
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class Access_modifier{
    public static void main(String[] args){
        C1 c1 = new C1();
        System.out.println(c1.z);
        // System.out.println(c1.a);

    }
}