package Trycatch;

class Try {

    public static void main(String[] args) {

        try {
            int a =4;
            System.out.println(a);


        }catch (Exception e1){
            e1.printStackTrace();
            System.out.println("this exception:" + e1);

        }
        System.out.println("this didn't get printed");

    }
}
