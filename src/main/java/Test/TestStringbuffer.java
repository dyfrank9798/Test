package Test;

/**
 * @author zhangrongchuan
 * @data 2020-12-2020/12/17-11:17
 * @Description
 */
public class TestStringbuffer {
    public static void main(String[] args) {
        int iLoop = 8;
        String jfxzbz = "00000000110000000000000020000000000000000000000000000000000";
        StringBuilder sb = new StringBuilder(jfxzbz);
        sb.replace(iLoop, iLoop+1, "2");
        System.out.println(sb.toString());
    }
}
