package Array;

import java.util.ArrayList;

public class List {


    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Divyesh");
        nameList.add("Tushar");


        nameList.add("Nirav");
        nameList.add("Rahul");
        nameList.add( 1, "rahul");
        nameList.remove(3);



         for (String name:nameList){
            System.out.println(name);

        }

         // for (int i=0;i<nameList.size();i++);
        //int i = 0;
        //System.out.println(nameList.get(i));

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        for (int num:intList){

            System.out.println(num);
        }
    }
}

