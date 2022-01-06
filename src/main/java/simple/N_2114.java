package simple;

/**
 * 句子中的最多单词数
 * @author kevin
 * @date 2022-01-06 15:36
 */
public class N_2114 {

    public static void main(String[] args) {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(split(sentences));
        System.out.println(replace(sentences));

    }

    /**
     * 通过split切分字符串得到单词arr,来确认字符串单词数
     */
    public static int split(String[] sentences) {
        int c = 0;
        for (String s : sentences) {
            c =Math.max(s.split(" ").length,c);
        }
        return c;
    }

    /**
     * 通过replace剔除空格,原字符串减去新字符串+1为字符串单词数
     */
    public static int replace(String[] sentences) {
        int c = 0;
        for (String s : sentences) {
            c =Math.max(s.length()-s.replace(" ", "").length()+1,c);
        }
        return c;
    }
}
