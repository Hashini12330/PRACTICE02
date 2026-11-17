public class Main{
    public static void main(String[] args){

        Deer d = new Deer();    // created obj for child class

        // Upcasting
        Animal a = d;   
        a.eat();
        d.run();    // cannot use "a" for run()
       
        System.out.println("--------------------------------------");


        // Downcasting  --> Usually, we first perform upcasting and then downcasting.
        Deer d2 = (Deer) a;
        d2.eat();
        d2.run();

    }

}


// Casting

// Upcasting

class Animal{

    public void eat(){
        System.out.println("Animal is eating");
    }
}


class Deer extends Animal{
    public void run(){
        System.out.println("Deer is running");
    }

}


