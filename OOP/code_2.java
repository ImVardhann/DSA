package OOP;
//  constructors:


class Studentt
{
    int rollNumber;
    String name;
    float marks;
    int numberOfLegs = 2;

    void greeting()
    {
        System.out.println("Hello "+this.name);
    }
    Studentt(String nameeee)// parameterized constructor:
    {
        this.name = nameeee;
        // this == instance variable name of the object of the respective class.
    }
    Studentt()//Default constructor:
    {
        this.name = "unknown";
    }
    //  You can create any number of constructors
    //  creating multiple constructors is called constructor overloading:
    //  Constructor is a special kind of function:
}

public class code_2
{
    public static void main(String[] args)
    {
        Studentt student1 = new Studentt("Vardhan");
        System.out.println(student1.name);
        System.out.println(student1.numberOfLegs);

        Studentt student2 = new Studentt();
        System.out.println(student2.name);

        student1.greeting();

    }
}
