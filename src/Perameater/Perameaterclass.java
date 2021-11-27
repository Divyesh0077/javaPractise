package Perameater;

public class Perameaterclass {

    public static void mult(int a, int b){
        int x = a * b;

        System.out.println(x);

    }

    public static void main(String[] args) {

        mult(30,20);
        add(40,20);
        div(20.3f, (byte) 1);
        substrac(1,20);


    }
    public static void add(int c, int d){

        int y = c + d;
        System.out.println(y);

    }
    public static void div(float e , byte f){
        float  z = e/f;
        System.out.println(z);
    }
    public static void substrac(int g, int h){
        int i = g-h;
        System.out.println(i);
    }
}


