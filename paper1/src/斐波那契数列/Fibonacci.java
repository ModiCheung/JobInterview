package 斐波那契数列;

import java.util.Arrays;

/**
 * 打印前n项的斐波那契额数列
 *
 * Created by ModiCheung on 2018/10/11 15:09
 **/
public class Fibonacci {

    public static void main(String[] args) {
        getFibonacci(20);
    }


    /**
     * 打印前n项的斐波那契额数列
     *
     * @param length
     * @return
     */
    public static void getFibonacci(int length) {
        /**
            判断length: <3，无法生成有效的斐波那契数列；>=3，可以生成
         */
        if (length < 3) {
            System.out.println("长度小于3，无法生成有效的斐波那契数列");
            return;
        }
        //创建一个长度为length的数组fibonacci
        int[] fibornacci = new int[length];
        fibornacci[0] = 1;
        fibornacci[1] = 1;
        //当x<=length-1时，获取每一项的值
        for (int x = 2; x < length; x++) {
            fibornacci[x] = fibornacci[x - 1] + fibornacci[x - 2];
        }
        System.out.println(Arrays.toString(fibornacci));

    }
}
