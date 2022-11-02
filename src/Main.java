import java.util.ArrayList;

public class Main {

    // for-each (enhanced for loop) = traversing technique to iterate through elements in an array/collection
    //            less steps, more readable
    //            less flexible

    public static void main(String[] args) {

        //String[] cars = {"Dodge Challenger", "Chevrolet Camaro", "Ford Mustang"};
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Dodge Challenger");
        cars.add("Chevrolet Camaro");
        cars.add("Ford Mustang");

        for(String i : cars) {
            System.out.println(i);
        }
    }





}
