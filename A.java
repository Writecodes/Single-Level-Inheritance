//...............................Inheritance....................................

//i) It is inheriting the properties of parent into child class.
//ii) Inheritance is the procedure by which one object acquires all  the properties and behaviors of a parent class.
//iii) Inheritance represents the IS-A relationship of the parent class with the child class.
//eg. Dog IS-A Animal.

//Advantages:
//i)Code Re-usability.
//ii) It promotes runtime polymorphism by allowing method overriding.

//Disadvantages:
//i) Using inheritance the two classes (parent and child class) gets tightly coupled.

/*Important points about inheritance:
-Inheritance is achieved using "extends" keyword.
-Every class has a super or say parent class i.e. Object class (but object class does not have any parent class.)

Below does not take part in inheritance:
-> Constructors: A subclass inherits all the members (fields, methods and nested classes) from its superclass.
                 Constructors are not members, so they are not inherited by subclasses,but the constructor of the
                 superclass can be invoked from the subclass.

-> Private members: A subclass does not inherit the private members of its parent class.However, if the superclass has
                    public or protected methods(like getters and setters) for accessing its private fields, these can
                    also be used by the subclass.

-> There can be only one super clases,not more than that because java does not suport multiple inheritance.
 */
//..................................Types of Inheritance................................
//1. Single Level
//2. Multi Level
//3. Heirarichal Level
//
//Multiple and Hybrid are not allowed in Java.

/*.......................Single level..................................
public class A {
    void Amethod() {
        System.out.println("Class A method");
    }
}
    class B extends A{
        public static void main(String[] args){
            A objA=new A();
            B objB=new B();
            objA.Amethod();
            objB.Amethod();
            objB.Bmethod();
        }
        void Bmethod(){
            System.out.println("Class B method");
        }
}*/

/*...............................Multilevel Inheritance.....................................

public class A{
    void Amethod(){
        System.out.println("class A method");
    }
    public static void main(String[] args){
        A objA=new A();
        B objB=new B();
        C objC=new C();
        objA.Amethod();
        objB.Bmethod();
        objB.Amethod();
        objC.Cmethod();
        objC.Bmethod();
        objC.Amethod();
    }
}
class B extends A{
    void Bmethod(){
        System.out.println("class B method");
    }
}
class C extends B{
    void Cmethod(){
        System.out.println("class C method");
    }
}*/

//.................................Hierarchical Inheritance................................

//public class A{
//    void methodA(){
//        System.out.println("class A method");
//    }
//    public static void main(String[] args){
//        A objA=new A();
//        B objB=new B();
//        C objC=new C();
//        objA.methodA();
//        objB.methodB();
//        objB.methodA();
//        objC.methodC();
//        objC.methodA();
//    }
//}
//class B extends A{
//    void methodB(){
//        System.out.println("class B method");
//    }
//}
//class C extends A{
//    void methodC(){
//        System.out.println("class C method");
//    }
//}

/*Relationship between classes:-
1. Inheritance
2. Association:- It shows HAS-A relationship.
                 Uses new keyword.
                 has a non blood relationship.
                 not tightly coupled as in inheritance.
                 It can be one-to-one, one-to-many, many-to-one, many-to-many.

     i) Aggregation:-> Without existing container object if there is a chance of existing contained objects, then
                       container and contained objects are weakly associated and this weak association is known
                       as association.
                    -> For example:College consists of several professors, without existing college, there may be the
                       chance of existing professor objects,hence college and professor objects are weakly associated.
                    -> It has a strong bonding between the classes

     ii)Composition:-> It has a weak bonding between the classes.
                    -> without existing container object if there is no chance of existing contained objects, then
                       container and contained objects are strongly associated and this strong association is known
                       as composition.
                    -> for example: college consists of several branches, without existing college, there is no chance
                       of existing branches, hence college and branches are strongly associated.
*/



