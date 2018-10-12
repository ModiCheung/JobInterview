package 二分算法;

/**
 * Created by ModiCheung on 2018/10/8 15:19
 **/
public class BinarySearch {

    public static void binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length-1;
        int mid = (end+start)/2;
        while (key!=mid){
            //判断key值是否非法
            if (key<start || key>end){
                System.out.println("key值非法");
            }else{
                System.out.println("key值可用");
                //判断key值范围
                if (key <= mid) {
                    end = mid;
                    mid = (end+start) / 2;
                } else {
                    start = mid;
                    mid = (end+start) / 2;
                }
            }
        }
        System.out.println(mid);


    }
}
