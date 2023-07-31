package tech.aistar.day07.homework;

public class MyList <T> {
    private Object[] elements = new Object[10];
    private int size;//下标计数器,表示数组中的有效数据

    public void add(T t) {
        //...扩容按照1.5倍
        elements[size++] = t;

    }

    @Override
    public String toString() {

        //...

        String str = "[";
        for (int i = 0; i < size; i++) {
            str+=(i!=size-1)?(elements[i]+","):elements[i];
        }
        str+="]";
        return  str;
    }
}