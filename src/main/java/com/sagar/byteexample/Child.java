////id
////
//
//employee
//
//id,
//name,
//salary
//deptId
//
//
//        phys, p1,p2,p5,p7 - p1
//        math, p3, p4,p10,p11 - p3
//
//
//select name from employee group by  deptId ,
//
//
//
//
//
//
//import java.util.HashMap;
//import java.util.Objects;
//
//
//
//class A {
//
//    //th1
//    //th2
//    public static void synchronized m1()
//    {
//        Thread.sleep(5000);
//    }
//
//
//    public static void helper(){
//        A a=new A();
//        A b=new A();
//        Thread t1=new Thread(a);
//        Thread t2=new Thread(b);
//        t1.start();
//        t2.start();
//
//    }
//
//    public  void main(String[] args) {
//       helper();
//
//
//    }
//}
//class Employee{
//
//    final private int id;
//    final private String name;
//
//    Employee(int id,String name){
//        this.id=id;
//        this.name=name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && Objects.equals(name, employee.name);
//    }
//
//
////    heap memory
////            obj1 -1 ,sagar
////            obj2- 1 sagar
////
//    // 1st situation
////    hascode obj1 obj2
////    are equals and values
////
////            //
////    hascode are same
////    //but theu are two objects
//
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//
//
//    public static void main(String[] args) {
//        Employee emp=new Employee(1,"sagar");
//        Employee emp1=new Employee(1,"sagar");
//        HashMap<Employee, Integer> map=new HashMap<>();
//        map.put(emp,1000);
//        map.put(emp1,2000);
//        System.out.println(map);
//
//
//    }
//}