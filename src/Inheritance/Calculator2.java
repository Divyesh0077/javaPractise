package Inheritance;

public class Calculator2 {

    int a;

    public void addition(int b,int c) {
         a = b + c;
        System.out.println(" The given sum number "+a);
    }
}

      class Calculation extends Calculator2 {
    public void multiplication(int b , int c){
        a = b*c;
        System.out.println(" the product given "+a);
    }

          public static void main(String[] args) {
              int b = 10,c = 50;

              Calculation s1= new Calculation();
              s1.addition(b,c);
              s1.multiplication(b,c);
          }
}