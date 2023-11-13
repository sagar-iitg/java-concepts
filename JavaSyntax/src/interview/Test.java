package interview;

import java.util.Arrays;

class Employee{

    private double salary;


    Employee(){
        this.salary=salary;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + this.salary +
                '}';
    }
}


public class Test {


    public static void main(String[] args) {

           //int[] arr=new int[10];
           Employee[] emp=new Employee[5];


           int n= emp.length;

            for (int i=0;i<n;i++){
                emp[i]=new Employee();
            }


            emp[0].setSalary(10000);
            emp[1].setSalary(20000);
           emp[2].setSalary(30000);
           emp[3].setSalary(40000);
           emp[4].setSalary(50000);
        System.out.println(Arrays.toString(emp));


//
//        for (int i=0;i<n;i++){
//            System.out.println(emp[i].getSalary());
//        }



           for(Employee i:emp)
           {



                    if(i.getSalary()>=30000){
                        i.setSalary(i.getSalary()*1.1);
                    }
                    else{
                        i.setSalary(i.getSalary()*1.2);
                    }

;


        }
//
//        for (int i=0;i<n;i++){
//            System.out.println(emp[i].getSalary());
//        }

        System.out.println(Arrays.toString(emp));
    }
}
