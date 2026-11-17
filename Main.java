public class Main{
    public static void main(String[] args){

        // here cannot use Animal() instead Dog() & Cat() 
        Animal a = new Dog();
        Animal c = new Cat();

        a.run();
        c.run();

    }

}


// polimorphism --> can use with interface, abstract, inheritance

interface Animal{
    void run();

}

class Dog implements Animal{
    @Override 
    public void run(){
        System.out.println("Dog runs");
    }
}

class Cat implements Animal{
    @Override 
    public void run(){
        System.out.println("Cat runs");
    }
}

