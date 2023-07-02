//To understand implementation of abstraction; it is achieved in two ways, second one is here
//through interface class

interface Animal1{
    void walk();
}

class Horse implements Animal1{
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

public class abstraction1{
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
    }
}
