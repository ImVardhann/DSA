package OOP;
//  Classes
//  How to create an object of class in java, set its member variables, and access those variables(using separator "."):

// creating an object
class Student
{
    int rollNumber;
    String name;
    float marks;
}

public class code_1
{
    public static void main(String[] args)
    {
        //  instantiation of an object:
        Student student1 = new Student();
        //  it is necessary to initiate an object using constructor (new()), before using it. If not used, it gives
        //  an error like below

//        Student student2;
//        System.out.println(student2.name);
//        error: java: variable student2 might not have been initialized

        student1.name = "Vardhan";
        student1.rollNumber = 32;
        student1.marks = 35.36f;

        System.out.println("Name: "+student1.name);
        System.out.println("Roll number: "+student1.rollNumber);
        System.out.println("Marks obtained: "+student1.marks);


        Student student2 = student1;
        /*
            1.  student1 and student2 are both references to objects of the Student class. They
            are not actual objects but rather references or pointers to objects.

            2.  When you write Student student2 = student1;, you are not creating a new object.
            Instead, you are creating a new reference (student2) and making it point to the
            same object that student1 is pointing to.

            3.  This means that both student1 and student2 will refer to the same object in memory.
            Any changes made to the object through one reference will be reflected when accessed
            through the other reference because they both point to the same object.
         */
        System.out.println(student2.name);

        Student student3 = new Student();
        System.out.println(student3.name);
        System.out.println(student3.rollNumber);
        System.out.println(student3.marks);
    }
}


