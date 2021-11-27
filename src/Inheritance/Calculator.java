package Inheritance;

 class Calculator {

     static int cube (int i){

          return i*i+i;
     }

     public static void main(String[] args) {
         int result = Calculator.cube(6);
         System.out.println(result);
     }
}
