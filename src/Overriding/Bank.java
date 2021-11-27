package Overriding;


    class Bank{
        int getRateOfInterest(){return 0;}
    }
    //Creating child classes
    class Barclays extends Bank{
        int getRateOfInterest(){return 3;}
    }

    class HSBC extends Bank{
        int getRateOfInterest(){return 5;}
    }
    class Lloyds extends Bank{
        int getRateOfInterest(){return 10;}
    }
    //Test class to create objects and call the methods
    class Test2{
        public static void main(String args[]){
            Barclays a=new Barclays();
            HSBC b=new HSBC();
            Lloyds c=new Lloyds();

            System.out.println("Barclays Bank of Interest Rate: "+a.getRateOfInterest());

            System.out.println("HSBC Bank of Interest Rate: "+b.getRateOfInterest());
            System.out.println("Lloyeds Bank of Interest Rate: "+c.getRateOfInterest());
        }
    }

