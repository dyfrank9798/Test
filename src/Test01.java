import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        List<String> lsdmjf = new ArrayList<String>();
        lsdmjf.add("dxbz = 1");
        lsdmjf.add("mzbz = 1");
        lsdmjf.add("jsbz = 1");
        lsdmjf.add("fsbz = 1");
        System.out.println(lsdmjf);
        String str = StringUtils.join(lsdmjf," and ");
        System.out.println(str);
//        System.out.println(lsdmjf.toArray());
//        System.out.println(lsdmjf.toArray().toString());
    }
}
