package codingninjas.oops.vehicle;

class Examples {
    String colour;
    private int number;
    void print()
    {
        System.out.println("vehicle");
    }
}

class Car1 extends Examples{
    void print()
    {
        super.print();
        System.out.println("car");
    }
}
class Honda extends Car1{
    void print()
    {
        System.out.println("Honda");
    }
}
class buy_car{
    public static void main (String[] args) {
        Car1 c=new Car1();
        c.print();
    }
}