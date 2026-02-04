package mypack;

public class Student {
    Student(){
        System.out.println("Enter Student name to fetch details: ");
    }
    Student(String name, int uid){
        String n=name;
        int u=uid;
        System.out.println(n + '-' + u);
    }
    public static void main(String[] args){
        Student student= new Student();
        student.Student("Shreyanshi", 01);
        student.Student ("Ronit", 02);
    }
}
