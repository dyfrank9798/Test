package Test;

/**
 * @author zhangrongchuan
 * @data 2020-12-2020/12/17-14:01
 * @Description
 */
public class T2123 {
    public static void main(String[] args) {
        String jfxzbzOld="0000000011000000000000001000000000000000000000000000000000000000000000000000000000000000000000000000";
        String lcdm = "21";
        for (int iLoop = 0; iLoop < 100; iLoop++) {
            if (('0' != jfxzbzOld.charAt(iLoop)) && ('1' != jfxzbzOld.charAt(iLoop)) && (' ' != jfxzbzOld.charAt(iLoop))) {
                lcdm = "23";
                break;
            }
        }
        System.out.println(lcdm);
    }
}
