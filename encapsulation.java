//To understand encapsulation

class Area{
    int length;
    int breadth;

    //create constructor which initialize the value
    Area(int length, int breadth){

        //'this' keyword is used for pass the current object as a parameter to another method
        this.length = length;
        this.breadth = breadth;
    }

    //create method to calculate area
    public void findArea(){
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

public class encapsulation{
    public static void main(String[] args){
        Area rect = new Area(2, 8);
        rect.findArea();
    }
}
