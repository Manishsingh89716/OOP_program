//To understand implementation of abstraction; it is achieved in two ways, first one is here
//through abstract class

abstract class Animal{
    abstract void walk();
    void breathe(){
        System.out.println("These animal breathes air");
    }
    Animal(){
        System.out.println("You create an Animal");
    }
}

class Cow extends Animal{
    Cow(){
        System.out.println("Wow, You created an Cow!");
    }

    void walk(){
        System.out.println("Cow walks on 4 legs");
    }
}

class Hen extends Animal{
    Hen(){
        System.out.println("Wow, You created an Hen!");
    }

    void walk(){
        System.out.println("Hen walks on 2 legs");
    }
}

public class abstraction{
    public static void main(String[] args){
        Cow cow = new Cow();
        cow.walk();
        cow.breathe();

        Hen hen = new Hen();
        hen.walk();
        hen.breathe();
    }
}
