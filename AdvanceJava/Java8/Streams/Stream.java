package AdvanceJava.Java8.Streams;
import java.util.*;
// public class Stream {
//     public static void main(String[] args) {
//         List<Integer> list=new ArrayList<>();
//         list.add(5);
//         list.add(10);
//         list.add(15);
//         list.add(20);

//         List<Integer> evenList=new ArrayList<>();

//         for(Integer num:list){
//             if(num%2==0){
//                 evenList.add(num);
//             }
//         }
//         System.out.println(list);
//         System.out.println(evenList);

//     }
// }



//                                               Using Stream API------>>>>>>



import java.util.stream.Collectors;
public class Stream {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        List<Integer> evenList=list.stream().filter(n->n%2==0).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(evenList);

    }
}