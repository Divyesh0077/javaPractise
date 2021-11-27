package Employee;

class Employee{
    int id;
    String name;
    float salary;

    void insert(int a, String b, float c) {
        id= a;
        name= b;
        salary=c;

    }
    void display(){System.out.println(id+" "+name+" "+salary);} //constructor
}
class TestEmployee {

    public static void main(String[] args) {
        Employee e1=new Employee();// crate object1

        Employee e2=new Employee();//object2

        Employee e3=new Employee();//object3


        e1.insert(1,"Divyesh",91000);
        //value of a b c

        e2.insert(2,"Mansi",45000);

        e3.insert(3,"Meet",5000);




        e1.display();
        e2.display();
        e3.display();
    }
}
