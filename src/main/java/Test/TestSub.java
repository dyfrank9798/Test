package Test;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author zhangrongchuan
 * @data 2020-08-2020/8/18-10:11
 * @Description
 */
public class TestSub {
    public static void main(String[] args) {
        TestSub testSub = new TestSub() ;
        TestVo vo = new TestVo();
        vo.setId("001");
        vo.setName("Frank");
        vo.setTime(new Date());
        String[] bgzds = testSub.getBgzds();
        testSub.invokeBgzd(bgzds,vo);
        System.out.println(vo.toString());
    }
    private TestVo invokeBgzd(String[] bgzds,TestVo vo ){
        for(int i =0;i<bgzds.length;i++){
            //获取Class
            Class<?> clazz = vo.getClass();
            try {
                //手字母大写
                String captureName = captureName(bgzds[i]);
                //获取反射方法
                Method method = clazz.getMethod("set"+captureName+"sfbg",String.class);
                //vo反射
                method.invoke(vo,"是");

            } catch (Exception e) {
               System.out.println("无方法");
            }
        }

        return vo;
    }


    private  String[] getBgzds(){
        String ptxgnr ="{\"ggbz\":\"1.500%×2000ml/袋,双联双袋变更g*1/袋,双联双袋;\",\"mlbm\":\"X-B05DA-F612-B020变更X-B05DA-F612-C0987;\",\"bgzd\":\"pzwh,bsjx,bznhsl,bzcz,\"}";
        int bgzdIndexF = ptxgnr.indexOf("\"bgzd\"");
        int bgzdIndexE = ptxgnr.indexOf(",\"",bgzdIndexF);
        String result = ptxgnr.substring(bgzdIndexF+8,bgzdIndexE);
        String[] bgzds = result.split(",");
        System.out.println(result);
        System.out.println(bgzds.toString());
        return bgzds;
    }


    //首字母大写
    public String captureName(String name) {
        //     name = name.substring(0, 1).toUpperCase() + name.substring(1);
//        return  name;
        name.toLowerCase();
        char[] cs=name.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);

    }
}
