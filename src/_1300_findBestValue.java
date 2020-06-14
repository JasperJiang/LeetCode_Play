import java.util.Arrays;

public class _1300_findBestValue {

    public int findBestValue(int[] arr, int target){
        long min = Long.MAX_VALUE;

        int result = arr[0];
        Arrays.sort(arr);
        for (int value = 0; value <= arr[arr.length - 1]; value++) {
            int sum = 0;
            //二分查找value在array中的位置
            int index = Arrays.binarySearch(arr, value);
            //https://blog.csdn.net/cxhply/article/details/49423501
            //搜索值不是数组元素，且在数组范围内，从1开始计数，得“ - 插入点索引值(后一个数的下标)”；
            if (index < 0) {
                index = -index - 1;
            }

            //sum = a[0] + a[1] + ... + a[n-1] + value*(len - i)
            for (int i = 0; i < index; i++) {
                sum += arr[i];
            }
            sum += value * (arr.length - index);
            if (Math.abs(target - sum) < min){
                min = Math.abs(target - sum);
                result = value;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        _1300_findBestValue findBestValue = new _1300_findBestValue();
        int[] arr = new int[]{4,9,3};
        System.out.println(findBestValue.findBestValue(arr, 10));
    }

}
