package Inheritance;

public class Vhical {


       void Hundai(){System.out.println("non maintence");
}
        void Volvo(){System.out.println("Royal look");
        }

        static class Car extends Inheritance.Vhical {
            void bmw(){ System.out.println("High speed");
            }
            static class Inheritance{
                public static void main(String[] args) {

                    Car d = new Car();
                    d.bmw();
                    d.Volvo();
                    d.Hundai();
                }
            }
        }
}
