package weekend.aistar.day03.homework;
/**
 * 本来用来演示: 排列组合
 *
 * 打印所有这样的组合,这个组合是三位数.  数字是由1,2,3,4当中的三个组成.
 *  但是不能出现重复的数据. 比如合法的1,2,3 总共:24个
 *
 * 增加难度:没打印6个换一行!
 */
public class PermutationsDemo {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.print(i * 100 + j * 10 + k + "\t");
                        //System.out.println(x+""+y+z+"\t");
                        count++;
                        if (count == 6) {
                            System.out.println();
                            count=0;
                        }
                    }

                }
            }

        }
    }

}