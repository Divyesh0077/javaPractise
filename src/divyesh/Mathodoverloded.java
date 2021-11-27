package divyesh;

public class Mathodoverloded {

    public static class Main {
         static int add(int x, int y) {
            return x + y;
        }

         static double add(double x, double y) {
            return x + y;
        }

        public static void main(String[] args) {

            int myname1 = add(8, 5);

            double divyesh = add(41, 62);

            System.out.println("int: " + myname1);
            System.out.println("double: " + divyesh);
        }
    }

}
