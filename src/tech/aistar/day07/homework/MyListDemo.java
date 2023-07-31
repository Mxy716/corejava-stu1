package tech.aistar.day07.homework;

public class MyListDemo {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("ok");
        list.add("python");
        System.out.println(list);
        MyList<Integer> intList = new MyList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println(intList);
    }
}
