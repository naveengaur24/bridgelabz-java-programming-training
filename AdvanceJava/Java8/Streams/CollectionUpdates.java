package AdvanceJava.Java8.Streams;

// forEach()
//  removeIf()
//  stream()
//  parallelStream()
//  spliterator()
//  replaceAll()
//  sort()
//  sort(Comparator.reverseOrder())


import java.util.*;
public class CollectionUpdates {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        // =================================================
        // 1 forEach()
        // =================================================

        /*
        list.forEach(n -> System.out.println(n));   using lambda expression
        */


        /*
        list.forEach(System.out::println);
        */

        // =================================================
        // 2 removeIf()
        // =================================================

        /*
        list.removeIf(n -> n%2==0);
        System.out.println(list);
        */



        // =================================================
        // Stream()
        // =================================================

        /*
        list.stream().filter(n->n>20).forEach(System.out::println);
        */



        // =================================================
        // replaceAll()
        // Double every element
        // =================================================

        /*
        list.replaceAll(n->n*2);
        System.out.println(list);
        */



        // =================================================
        //  sort()
        // Ascending sort
        // =================================================

        /*
        List<Integer> nums = new ArrayList<>(Arrays.asList(5,2,8,1));
        nums.sort(null);
        System.out.println(nums);
        */


        // =================================================
        // 8 sort() descending
        // =================================================

        /*
        List<Integer> nums= new ArrayList<>(Arrays.asList(5,2,8,1));

        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);
        */

        // =================================================
        // Using forEach()
        // =================================================

        list.forEach(System.out::println);
    }
}
