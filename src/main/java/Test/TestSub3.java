package Test;


import org.springframework.util.StringUtils;

/**
 * @author zhangrongchuan
 * @data 2020-11-2020/11/18-15:08
 * @Description
 */
public class TestSub3 {

    public static void main(String[] args) {
        String reportinfo = "37B08D0120000800179443004YBB00000420201118                                                  2002550000027851|戴菊林|310107192308041610|宝钢集团上海第一钢铁有限公司|50394|上海市联航路1518号|99999999926     |急性乳腺炎|上海孟超肿瘤医院|门急诊|外科|2021年0月1日";

        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append(reportinfo);
        resultBuffer.append(reportinfo);
        resultBuffer.append(reportinfo);
        resultBuffer.append(reportinfo);
        resultBuffer.append(reportinfo);
        reportinfo = resultBuffer.toString();


        int count = 0;
        String infoStr = "";
        StringBuffer kgBuffer = new StringBuffer();
        for (int i = 0; i < 50; i++) {
            kgBuffer.append(" ");
        }
        String kg = kgBuffer.toString();

        int thousand   = reportinfo.length() / 1000;
        int index = 0;
        if(thousand>0){
            for(int i =0;i<thousand;i++){
                if(thousand == 0){
                    infoStr = reportinfo.substring(index*1000,reportinfo.length() );
                    System.out.println(infoStr);
                }else{
                    infoStr = reportinfo.substring((i+92),(i+1)*1000);
                    System.out.println(infoStr);
                }
                thousand --;
                index ++;
            }
        }else{
            infoStr = reportinfo.substring(92);
            System.out.println(infoStr);
        }
//            if (StringUtils.isEmpty(infoStr)) {
//                break;
//            }
    }
}
