package Overriding;

 class Marketprice {

  int getbrandprising(){return 0;}


}
class Tessco extends Marketprice{
        int getbrandprising(){return 5;}
}
class Assda extends Marketprice{
  int getbrandprising(){return 7;}

}
class Aldi extends Marketprice{
  int getbrandprising(){return 3;}

}
class Test1{

 public static void main(String[] args) {
        Tessco x = new Tessco();
        Assda y = new Assda();
        Aldi z = new Aldi();

  System.out.println("Assda in Tometo price: "+x.getbrandprising());
  System.out.println("Tessco in Tometo price: "+y.getbrandprising());
  System.out.println("Aldi in Tometo price: "+z.getbrandprising());
 }
}