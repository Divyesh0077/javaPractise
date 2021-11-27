package ATM;

    class Atm1{
        int account_no;
        String name;
        float amount;
        //Method to initialize object
        void insert(int a,String n,float atm){
            account_no=a;
            name=n;
            amount=atm;
            //Creating an Account class deposit() and withdraw() methods
        }
        //deposit method
        void deposit(float atm){
            amount= +atm;
            System.out.println(" deposited " +atm);
        }
        //withdraw method
        void withdraw(float atm){
            if(amount<atm){
                System.out.println("Not Enough Balance");
            }else{
                amount=amount-atm;
                System.out.println("after withdrawn " +atm);

            }
        }
        //method to check the balance of  account
        void checkBalance(){System.out.println(" Balance is: "+amount);}
        //method to display the values of an object
        void display(){System.out.println(account_no+" "+name+" "+amount);}
    }
    //Creating
    //
    // test class to deposit and withdraw amount
    class TestAccount {
        public static void main(String[] args) {
            Atm1 a1 = new Atm1();

            a1.insert(832345, "Mansi", 2500);
            a1.display();
            a1.checkBalance();
            a1.deposit(4050);
            a1.checkBalance();
            a1.withdraw(700);
            a1.checkBalance();

        }
    }
