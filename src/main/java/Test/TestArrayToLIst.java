package Test;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangrongchuan
 * @data 2020-09-2020/9/11-11:27
 * @Description
 */
public class TestArrayToLIst {
    public static void main(String[] args) {
        String[] allZds = new String[]{"pzwh","ypcpm","ypspm","ypywm","bsjx","cfgg","bznhsl","bzdwmc","bzcz","bzfs","ggbz","bwm","jkybz","scqymc","WTQYmc","JKFBQYMC"};
        //String[] to ArrayList
        List<String> list1 = new ArrayList<>(Arrays.asList(allZds));
        String[] bgzds = new String[]{"pzwh","ypcpm"};
        List<String> list2 = new ArrayList<>(Arrays.asList(bgzds));
        list1.removeAll(list2);

        //ArrayList to String[]
        String[] result= new String[list1.size()];
        list1.toArray(result);


//        for(int i =0;i<result.length;i++){
//            System.out.println(result[i]);
//        }

        String str = StringUtils.join(list2,",");
        str = str.replace("1111","批准文号");
        System.out.println(str);

    }
}
