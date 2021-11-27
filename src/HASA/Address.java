package HASA;

public class Address {

    String city,state,country;

    public Address (String city,String state,String country){

        this.city = city;
        this.country = country;
        this.state = state ;
    }
}
class Emp{
    int id;
    String name;
    Address address;

    public Emp(int id,String name,Address address){

        this.id= id;
        this.name=name;
        this.address=address;
    }

    void display(){

        System.out.println(id+""+name);
        System.out.println(address.city+" "+address.state+" "+address.country);

    }

    public static void main(String[] args) {
        Address address1 =new Address("surat","Gujrat","India");


        Emp a =new Emp(123,  "Divyesh" ,address1);

        a.display();
    }

}