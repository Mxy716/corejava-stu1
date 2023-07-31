package tech.aistar.until;


    public class QuickSort {
        public static void main(String[] args) {
            int[] arr = {10, 7, 8, 9, 1, 5};
            quickSort(arr, 0, arr.length - 1);
            System.out.println("排序结果：");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        /**
         * 快速排序算法
         * @param arr 待排序的数组
         * @param startIndex 起始索引
         * @param endIndex 结束索引
         */
        public static void quickSort(int[] arr, int startIndex, int endIndex) {
            if (startIndex < endIndex) {
                // 分区操作，将数组分为两部分
                int pivotIndex = partition(arr, startIndex, endIndex);
                // 递归排序左子数组
                quickSort(arr, startIndex, pivotIndex - 1);
                // 递归排序右子数组
                quickSort(arr, pivotIndex + 1, endIndex);
            }
        }

        /**
         * 分区操作
         * @param arr 待分区的数组
         * @param startIndex 起始索引
         * @param endIndex 结束索引
         * @return 基准元素的最终位置
         */
        public static int partition(int[] arr, int startIndex, int endIndex) {
            // 以起始索引位置的元素作为基准元素
            int pivot = arr[startIndex];
            // 左右指针分别指向起始索引和结束索引
            int left = startIndex;
            int right = endIndex;

            // 当左右指针不相遇时进行循环
            while (left < right) {
                // 从右往左找到第一个小于基准元素的元素
                while (left < right && arr[right] >= pivot) {
                    right--;
                }
                // 将该元素放到左指针位置，并右移左指针
                if (left < right) {
                    arr[left] = arr[right];
                    left++;
                }
                // 从左往右找到第一个大于等于基准元素的元素
                while (left < right && arr[left] < pivot) {
                    left++;
                }
                // 将该元素放到右指针位置，并左移右指针
                if (left < right) {
                    arr[right] = arr[left];
                    right--;
                }
            }
            // 将基准元素放到最终位置
            arr[left] = pivot;
            return left;
        }
    }