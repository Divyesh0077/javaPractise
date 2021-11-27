package Forloop;


public class Pyramid1 {

    public static void main(String[] args) {

        for (int a = 1; a < 10; a++)

        {
            for (int b = 1; b < 10 - a; b++)

        {
            System.out.print(" ");
        }
            for (int c = 1; c <= a; c++)
            {
                System.out.print(c + " "); }

                System.out.println();
        }
    }

    }
