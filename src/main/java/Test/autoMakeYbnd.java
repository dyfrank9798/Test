package Test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author zhangrongchuan
 * @data 2020-11-2020/11/21-11:24
 * @Description 自动生成医保年度的String
 */
public class autoMakeYbnd {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String date = sdf.format(new Date());
        //从2004年开始，一直到今年
        int now = Integer.parseInt(date)-2;
        int mid = now - 2004+1;
        List<String> yearList = new ArrayList<>();
        Map<String,String> yearMap = new HashMap<>();
        for( int i =0;i<mid ;i++){
                        System.out.println(now-i);
            yearList.add(String.valueOf(now-i));
//            System.out.println("cd_"+String.valueOf(now-i));
            yearMap.put(String.valueOf(now-i),"cd_"+String.valueOf(now-i));
        }
        String varYbnd = "2019";
        String result ="";
        for(String str : yearList){
            if(str.equals(varYbnd)){
                result = yearMap.get(varYbnd);
            }
        }
        System.out.println(result);
    }

}
