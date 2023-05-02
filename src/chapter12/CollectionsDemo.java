package chapter12;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args){
        //setDemo();
        //listDemo();
        //queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        /*System.out.println(fruit.size()); //4
        System.out.println(fruit); //[banana, orange, apple, lemon]

        var i = fruit.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        for(String item : fruit){
            System.out.println(item);
        }
        fruit.forEach(System.out::println);*/
    }

    public static void mapDemo(){

        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        for(var entry : fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach((k, v) -> System.out.println("Fruit: " + k + ", Calories: " + v));
    }


}

