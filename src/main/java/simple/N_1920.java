package simple;

/**
 * 基于排列构建数组
 *
 * @author kevin
 * @date 2022-01-06 15:45
 */
public class N_1920 {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 1, 5, 3, 4};
        renew(arr);
        old(arr);
    }

    /**
     *
     */
    public static int[] renew(int[] arr) {
        int[] re = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            re[i] = arr[arr[i]];
        }
        return re;
    }

    /**
     * 不开辟新的空间,在原有数组中操作。
     * 时间换空间 对数组长度有限制
     */
    public static int[] old(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=1000*(arr[arr[i]]%1000);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]/=1000;
        }
        return arr;
    }
}
