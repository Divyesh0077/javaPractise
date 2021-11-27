package divyesh;

public class Precticeloop {

    public static void creattabale(int tableno) {

        System.out.println("this is my 11*1 table");
        System.out.println("strat table");

        for (int a = 1; a < 10; a++) {
            System.out.println(tableno + "*" + a + "=" + tableno + a);
        }

        System.out.println("end of table");
    }

    public static void main(String[] args) {
        creattabale(11);
    }
}



