import java.util.Arrays;

public class Main{
    public static void main(String[] args){

        // //data of 5 students
        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];

        Student navneet;
        navneet = new Student(15,"Amit",33.3f);
        // System.out.println(navneet.rno);
        // System.out.println(navneet.name);

        // System.out.println(navneet.marks);
        // System.out.println(Arrays.toString(marks));

        // navneet.changeName("Sumit");
        // navneet.greeting();

        Student random = new Student(navneet);
        System.out.println(random.rno);
        System.out.println(random.name);

        System.out.println(random.marks);

        Student ramdom2 = new Student();
        System.out.println(ramdom2.name);
    }
}

//class creation for every student 
class Student{
    int rno;
    String name;
    float marks;

    Student(){
        //this is how you call a constructor  from another constructor
        // internally : new Student(13,"default person",88.8f)
        this(132,"default person",88.8f);
    }

    // Student object = new Student(12,"navneet",55);
    // here `this` will be replaced by object
    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.name = other.name; // here other will be replaced by navneet and this --> random
        this.rno = other.rno;
        this.marks = other.marks;
    }

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name){ 
        this.name = name;
    }
}