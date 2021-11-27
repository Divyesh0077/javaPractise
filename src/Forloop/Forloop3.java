package Forloop;

public class Forloop3 {

    public static class Pyramid2 {
        public static void main(String[] args) {
            int term=5;


            for(int i=1;i<=term;i++){

                for(int j=term;j>=i;j--){


                    System.out.print(" 2 ");
                }
                System.out.println();
            }
        }
    }
}
