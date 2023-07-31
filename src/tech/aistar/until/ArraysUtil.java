package tech.aistar.until;


import java.util.Arrays;

@SuppressWarnings("all")//抑制该类中所有的警告
public class ArraysUtil {
    public static void main(String[] args) {
        //测试新增元素
        int[] arr = {3, 4, 1, 5, 6, 7};

        //在原数组arr的下标pos出新增一个数据target
        //System.out.println(Arrays.toString(addElement(arr, 2, 10)));

        //找出数组中最大的值
       // System.out.println(getMaxElement(arr));

        //在原数组arr的下标pos处新增多条数据
        //System.out.println(Arrays.toString(addManyElement(arr,2,10,14,15)));

        //根据下标删除arr对应位置的元素 - 根据下标进行删除
        System.out.println(Arrays.toString(delByIndex(arr,2)));
    }

    /**
     * 找出数组中的最大值
     *
     * @param arr
     * @return
     */
    public static int getMaxElement(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num<arr[i]){
                num=arr[i];
            }
        }
     return num;
    }


    /**
     * 在原数组arr的下标pos处新增一个数据target
     *
     * @param arr    原数组
     * @param pos    插入数据的下标位置
     * @param target 插入的新的数据
     * @return
     */
    public static int[] addElement(int[] arr, int pos, int target) {
//         int[] arr = {3, 4, 1, 5, 6, 7};
//                           10
        if (null==arr||arr.length==0||pos<0||pos>arr.length-1)
            return arr;
        int[] temp = new int[arr.length+1];
        for (int i = 0; i < pos; i++) {
            temp[i]=arr[i];
        }
        temp[pos]=target;
        for (int i = pos; i <arr.length ; i++) {
            temp[i+1]=arr[i];
        }
        return temp;
    }


    /**向数组中添加多条数据.*/
    public static int[] addManyElement(int[] arr, int pos, int... target) {
        if (null == arr || arr.length == 0 || pos < 0 || pos > arr.length - 1)
            return arr;
        int[] temp = new int[arr.length + target.length];

        for (int i = 0; i < pos; i++) {
            temp[i]=arr[i];

        }
        int index =0;
        for (int i = pos; i < pos+target.length ; i++) {

            temp[i]=target[index++];
        }
        for (int i = pos; i < arr.length; i++) {
            temp[i+target.length]=arr[i];
        }
        return temp;
    }


    /**
     * 找出目标数据target在原数组中所有的下标位置,并且将所有的下标放入到一个数组中,返回出去
     *
     * @param arr    原数组
     * @param target 需要查找的元素
     * @return 该元素在arr中所有的下标
     */
    public static int[] findIndexByTarget(int[] arr, int target) {

        if(null==arr || arr.length==0)
            return arr;
        //确定一个新的数组,来存放所有的target对应的下标
        //必须要先到arr中去统计target出现的次数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                count++;
        }
        //数据的校验
        if(count==0)
            return new int[]{-1};//错误的标识
        //return null;

        //说明target在arr中是存在的.
        int[] indexs = new int[count];
        //定义一个下标计数器
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                indexs[pos++] = i;
        }

        return indexs;

    }


    /**
     * 根据下标删除arr中对应位置的元素 - 根据下标进行删除
     *
     * @param arr   原数组
     * @param index 下标
     * @return
     */
    public static int[] delByIndex(int[] arr, int index) {
//         int[] arr = {3, 4, 1, 5, 6, 7};
        int[]temp=new int[arr.length-1];
        for (int i = 0; i < index; i++) {
            temp[i]=arr[i];
        }
        for (int i = index+1; i <arr.length ; i++) {
            temp[i-1]=arr[i];
        }

        return temp;
    }


    /**
     * 根据元素进行删除 - 删除数组arr中所有的目标数据target
     *
     * @param arr    原数组
     * @param target 需要删除的数据
     * @return
     */
    public static int[] delByTarget(int[] arr, int target) {
        return null;
    }


    /**
     * 面试概率及其高
     * 数组去重/排重操作
     * 将数组中重复的数据去除,只保留一个
     * 比如原数组数据是[1,1,2,3,2,5,4,3,5] => 去重之后的数组是[1,2,3,5,4];
     *
     * @param arr
     * @return
     */
    public static int[] delRepeatElement(int[] arr) {
        return null;
    }

}
