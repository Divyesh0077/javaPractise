package Employee;


class Student{
    int id;
    String name;

    void display(){System.out.println(id+" "+name);}

}
class TestStudent2{

   // void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){

        Student s1=new Student();
        // crate object
        s1.id=143;
        s1.name="Savaliya Divyesh";

       // System.out.println(s1.id+" "+s1.name);
       // System.out.println(s1.id);
       // System.out.println(s1.name);
        s1.display();
        //display values of the object

    }
}
