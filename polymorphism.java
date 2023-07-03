//To apply the concept of polymorphism
//Compile time polymorphism or method overloading

class Solution{

    //method with 2 parameters
    static int Subtract(int a, int b){
        return a - b;
    }

    //method with same name but different parameters
    static double Subtract(double a, double b){
        return a - b;
    }
}

public class polymorphism{
    public static void main(String[] args){
        System.out.println(Solution.Subtract(12, 7));
        System.out.println(Solution.Subtract(8.7, 3.9));
    }
}
