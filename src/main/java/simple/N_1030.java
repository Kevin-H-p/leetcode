package simple;

/**
 * 距离顺序排列矩阵单元格
 * 给出 R 行 C 列的矩阵，其中的单元格的整数坐标为 (r, c)，满足 0 <= r < R 且 0 <= c < C。
 *
 * 另外，我们在该矩阵中给出了一个坐标为(r0, c0) 的单元格。
 *
 * 返回矩阵中的所有单元格的坐标，并按到 (r0, c0) 的距离从最小到最大的顺序排，
 * 其中，两单元格(r1, c1) 和 (r2, c2) 之间的距离是曼哈顿距离，|r1 - r2| + |c1 - c2|。
 * （你可以按任何满足此条件的顺序返回答案。）
 * @author kevin
 * @date 2022-01-06 16:56
 */
public class N_1030 {
    public static void main(String[] args) {
        allCellsDistOrder(1,2,0,0);
    }



    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] re =new int[rows*cols][2];
        re[0][0]=rCenter;
        re[0][1]=cCenter;
        for (int i = 1; i < rows; i++) {

        }
        return re;
    }
}
