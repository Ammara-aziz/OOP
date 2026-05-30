class Student{
    // Instance variable
    String name ; // instance field(variable)
    int x ;   //can be access by  object.variable

    static String university = "UCP";  // Static variable  -> ClassName.variable

    void fun1(){
        System.out.println("Fun1");
    }
    void fun2(){
        System.out.println("Fun2");
    }
}

class Classes {
    public static void main(String[] args) {

        // Creating object of Student class
        Student s1 = new Student();  /*no variable refers to Object 1 anymore.*/


        s1 = new Student();
        /* 2 objects are created, but only the second object is reachable through s1. The first object becomes eligible for garbage collection.*/

        /*non-static variable "name" cannot be referenced from a static context -> because main() is static.*/

        // Access variable
        System.out.println(s1.name);
        System.out.println(s1.x);

// Because static members belong to the class itself
        System.out.println(Student.university);

        // Calling methods
        s1.fun1();
        s1.fun2();
    }
}

