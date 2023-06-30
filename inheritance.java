//To check inheritance

//Parent class
class Employee{
    String name = "Rohit";
}

//Child class; it inherited property of parent class
class Architect extends Employee{
    int salary = 45000;
}

public class inheritance{
    public static void main(String[] args){
        Architect obj = new Architect();
        System.out.println("Name: " + obj.name);
        System.out.println("Salary: " + obj.salary);
    }
}
