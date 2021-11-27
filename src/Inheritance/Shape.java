package Inheritance;


    class Shape{
        int square(int n){
            return n*n;
        }
    }

    class Circle{
        Shape op;//aggregation
        double pi=1.4;

        double area(int black){
            op=new Shape();
            int rsquare=op.square(black);//code reusability (i.e. delegates the method call).
            return pi*rsquare;
        }



        public static void main(String args[]){
            Circle c=new Circle();

            double result=c.area(3);
            System.out.println(result);

        }
    }

