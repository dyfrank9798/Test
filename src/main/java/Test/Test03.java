package Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangrongchuan
 * @data 2020-07-2020/7/22-16:54
 * @Description
 */
public class Test03 {

    public static void main(String[] args) {
        List<String> sbidsQuery = new ArrayList<String>();
        sbidsQuery.add("2020062401000000ZRC1");
        List<String> sbidsInput= new ArrayList<String>();
        sbidsInput.add("2020062401000000ZRC1");
        sbidsInput.add("aaaaaa");
        
        sbidsInput.removeAll(sbidsQuery);
        System.out.println(sbidsInput);


    }
}
