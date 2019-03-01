package ac.za.cput;

import java.util.*;

public class collection_class implements collection_Interface {



    //<<<--------------------------- LISTS ----------------------------------------->>>
    @Override
    public void lists(){

        //Create arrayList
        String[] animals = {"Dog", "Cat", "Giraffe", "Monkey"};
        List<String> list1 = new ArrayList<String>();


        //Add array items to list
        for (String a : animals)
            list1.add(a);

        //Display list
        System.out.println("----------- LISTS -------------");
        System.out.println("Contents of animal list: " + list1);
        System.out.println("Size of animal list: " + list1.size());
        System.out.println("\n");

    }


    //<<<--------------------------- MAP ----------------------------------------->>>

        public void maps(){

        Map<String, Integer> name = new LinkedHashMap<String, Integer>();
        name.put("Matthew", 8);
        name.put("Mo", 31);
        name.put("Chad", 12);
        name.put("Winston", 14);


        System.out.println("----------- MAP ---------------");
        System.out.println(" Map Elements:");
        System.out.print(name);
        System.out.println("\n" + "\n");


    }


    //<<<--------------------------- SETS ----------------------------------------->>>


        public void sets(){

            System.out.println("----------- SETS ---------------");


            //Creating HashSet and adding elements
            HashSet<String> set=new HashSet<>();
            set.add("One");
            set.add("Two");
            set.add("Three");
            set.add("Four");
            set.add("Five");

            // Displaying the HashSet
            System.out.println(set);
            System.out.println("\n");



            System.out.println("Iterate over values:");

            Iterator<String> itr = set.iterator();

            while(itr.hasNext())
            {
                String value = itr.next();
                System.out.println("Value: " + value);
            }

        }

}
