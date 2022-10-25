package com.example.demo.traning;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class collection_in_java {
    public static void main(String[] args) {

        System.out.println("hi");
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(15);
        integerList.add(14);
        integerList.add(13);
        integerList.add(12);
        System.out.println(integerList);
        var sortedList = integerList.stream().sorted().toList();
        System.out.println(sortedList);

        System.out.println("___________________\n");

        ArrayList<String> StringList = new ArrayList<>();
        StringList.add("ad");
        StringList.add("ab");
        StringList.add("aa");
        StringList.add("ac");

        System.out.println(StringList);
        var newSortedList = StringList.stream().sorted().toList();
        System.out.println(newSortedList + "\n");


        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Sultan", 1234);
        empIds.put("ss", 1234321);
        empIds.put("Seham", 1234567);
        System.out.println(empIds);
        var ishere = empIds.containsKey("sa");
        System.out.println(ishere);

        var isValuehere = empIds.containsValue(1234);

        System.out.println(isValuehere);

        ArrayList list1 = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList list2 = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.retainAll(list1);
        System.out.println("this is what matched \n" +list2);
        System.out.println("00000000000000000000");




        
        /*
        this is how the growing of an arrayList happens -> if The array size is 10 element and I wanna add a new element
        the new size of the array will be ->( original capacity / 2) + original capacity -> old = 10 -> 10/2 = 5 new = 15
        I can use the exact size of an array by using trimToSize() function that delete the rest of unused elements in the array
        -> I need only 11 elements of an array that contains 15 ele -> arr.trimToSize()


                                ARRAY LIST
           ArrayList<T> arrList = new ArrayList<>()
           ADV
           1- no size limit
           2- Automatically adjust its capacity when add/remove ele
           3- random access witch means that I need same time to get list.get(1) or list.get(999)

           DES_ADV
           1- takes time when adding or removing items because of the process of shifting


                                LINKED LIST

           LinkedList <T> linkedList = new LinkedList<>();
           ADV
           1- works better than ArrayList when it comes to adding/removing ele from the list

           DES_ADV
           1- bad when getting a specific element from the list because it works like chain(kedja)
        */

    }


}
