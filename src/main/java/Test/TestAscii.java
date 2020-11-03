package Test;

/**
 * @author zhangrongchuan
 * @data 2020-10-2020/10/28-11:11
 * @Description
 */
public class TestAscii {
    public static String stringToAscii(String value) {
        StringBuffer sbu = new StringBuffer();
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                sbu.append((int) chars[i]).append(",");
            } else {
                sbu.append((int) chars[i]);
            }
        }
        return sbu.toString();
    }

    public static String asciiToString(String ascii) {
        StringBuffer sbu = new StringBuffer();
//        String[] chars = value.split(",");
        sbu.append((char) Integer.parseInt(ascii));
        return sbu.toString();
    }


    public static void main(String[] args) {

//        String str = "{name:1234,password:4444}";
//        String asciiResult = stringToAscii(str);
//        System.out.println(asciiResult);

        String stringResult = asciiToString("65");
        System.out.println(stringResult);
    }
}
