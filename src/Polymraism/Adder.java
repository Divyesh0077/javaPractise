package Polymraism;

class Adder {

    static int add(int x, int y)
    {return x+y;}
    static double add(double i, double h)
    {return i+h;}
}
class TestOverloading2{
    public static void main(String[] args){
        System.out.println(Adder.add(12,10));

        System.out.println(Adder.add(4.3,2.6));
    }
}

