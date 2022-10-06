package arraylisttypeddemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTypedDemo {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Ankara");
        cities.add("Bartın");
        cities.add("Zonguldak");
        cities.add("Samsun");

        //With this function, we can sort our arraylist.
        Collections.sort(cities);

        cities.remove("Zonguldak");

        for (String city : cities) {
            System.out.println(city);
        }
    }

}
