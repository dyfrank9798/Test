package Test;


import org.springframework.util.StringUtils;

/**
 * @author zhangrongchuan
 * @data 2020-11-2020/11/18-15:08
 * @Description
 */
public class TestSub3 {

    public static void main(String[] args) {
//        String reportinfo = "37B08D0120000800179443004YBB00000420201118                                                  2002550000027851|戴菊林|310107192308041610|宝钢集团上海第一钢铁有限公司|50394|上海市联航路1518号|99999999926     |急性乳腺炎|上海孟超肿瘤医院|门急诊|外科|2021年0月1日";
        String reportinfo = "37B06D082358855904YBB00000420201124                                                  魏建华                          |B00898172 |城保|QX0119101600010|20201124030015zF|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0000000.00|0018514.28|0000000.00|0000195.19|0000195.19|0005309.66|-0005577.45|0005577.45|0.00|0.00|0.00|0005577.45|徐汇区医保办|ybbcs     |2|QX0119101600010-04|抱歉，输入数字不符合要求！";

        System.out.println("37B06D082358855904YBB00000420201124".length());
        System.out.println("37B08D0120000800179443004YBB00000420201118".length());
        String str = "37B06D08+23588559+04+YBB000004";

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
