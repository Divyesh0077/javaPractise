package Inheritance;

public class Animal {

    void eat(){System.out.println("eating....");
    }

    static class Dog extends Animal{
        void brak(){
            System.out.println("breking_-_-_-_-");
        }
         static class Inheritance{
            public static void main(String[] args) {

                Dog d = new Dog();
                d.brak();
                d.eat();
            }
        }
    }
}
