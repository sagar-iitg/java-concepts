package pkg3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Student{
    int id;
    String name;
    String clgName;
    Student(int id,String name,String clgName){
        this.id=id;
        this.name=name;
        this.clgName=clgName;

    }

}
public class Main {

    public static void main(String[] args) {

        Student s=new Student(1,"sagar","abc");
        Student s1=new Student(2,"mohit","xyz");
        Student s2=new Student(3,"nitin","abcd");



        ArrayList<Student> arr=new ArrayList<>();
        arr.add(s);
        arr.add(s1);
        arr.add(s2);

        List<Student> st=arr.stream().filter(i->i.id>2).collect(Collectors.toList());
        System.out.println(st);
       for(int i=0;i<st.size();i++)
       {
           System.out.println(st.get(i).name);
       }


    }
}

