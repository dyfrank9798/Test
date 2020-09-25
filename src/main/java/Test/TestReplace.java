package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhangrongchuan
 * @data 2020-08-2020/8/25-10:16
 * @Description
 */
public class TestReplace {
    public static void main(String[] args) {
        String sbids = "2020062401000000ZRC1\n\n2020062401000000ZRC5";
        String result = sbids.replace("\n", "','");
        System.out.println(result);
//        result = result.replaceAll("[\b\r\n\t]*", "");
//        System.out.println(result);
        Pattern p = Pattern.compile("\\s*|\t|\r|\n");
        Matcher m = p.matcher(result);
        result= m.replaceAll("");
        System.out.println(result);
    }
}
