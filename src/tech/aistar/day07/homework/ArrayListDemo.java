package tech.aistar.day07.homework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(10);
        list.add(30);
        System.out.println(list);
        ArrayList<String> strList = new ArrayList<>();
        strList.add("ok");
        strList.add("java");
        System.out.println(strList);
    }
}
