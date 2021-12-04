package Arraya;

import java.util.ArrayList;

public class array {

    public static void main(String[] args) {

        ArrayList<String> studentName = new ArrayList<>();

        studentName.add("divyesh");
        studentName.add("mansi");
        studentName.add("meet");
        System.out.println(studentName);

        for (String name:studentName){

            System.out.println(name);
            // print individual member
        }
        studentName.remove("meet");
        // remove member

        System.out.println("meet stopped"+studentName);
    }
}
