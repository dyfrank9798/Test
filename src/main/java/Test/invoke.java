package Test;

import com.wondersgroup.whs.framework.exception.BusinessException;

import java.lang.reflect.Method;

/**
 * @author zhangrongchuan
 * @data 2020-11-2020/11/24-11:39
 * @Description
 */
public class invoke {
    public static void main(String[] args) {
        String reportdetail = "                      |B00898172 |城保|QX0119101600010|20201124112017zF|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0018514.28|0000000.00|0000195.19|0000195.19|0005309.66|-0005577.45|0005577.45|0.00|0.00|0.00|0005577.45|徐汇区医保办|ybbcs     |2|QX0119101600010-04|抱歉，输入数字不符合要求！";
        String[] infos = reportdetail.split("\\|");
        DyA01VO resultVO = new DyA01VO();
        for(int i =0;i<infos.length;i++){
            try {
                Class<?> clazzset = resultVO.getClass();
                String methodNameset = "set"+"A"+i;
                Method method = clazzset.getMethod(methodNameset,String.class);
                method.invoke(resultVO,infos[i]);
            } catch ( Exception e) {
//                NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e
                //找不到方法错误
                //实例化错误
                //数据非法错误
                e.printStackTrace();
            }

        }

//        for(int i =0;i<infos.length;i++) {
//            Class<?> clazzget = resultVO.getClass();
//            String methodNameget = "get" + "A" + i;
//            Method methodget = clazzget.getMethod(methodNameget, String.class);
//            Object a = methodget.invoke(resultVO, infos[i]);
//            System.out.println((String) a);
//        }


    }



}
