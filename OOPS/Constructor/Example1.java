public class Example1{
    public static void main(String[] args){
        final A navneet = new A("ram jane");
        // System.out.println(navneet.num);

        navneet.name = "other name";
        // System.out.println(navneet.name);

        //when a non-primitive is final , you can't re-assign it. but you can change the value like above example
        navneet = new A("new object");
        


    }
}


class A{
    String name;
    public A(String name){
        this.name = name ;
    }
}