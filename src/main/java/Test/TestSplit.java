package Test;

/**
 * @author zhangrongchuan
 * @data 2020-11-2020/11/6-15:41
 * @Description
 */
public class TestSplit {
    public static void main(String[] args) {
        String info = "戴菊林|310107192308041610|50394|宝钢集团上海第一钢铁有限公司|00000184|退休| | |2020年11月12日|转入| |2020年11月12日| | | |                                                            | | | |徐家汇街道社区事务受理服务中心                              |fwdcs     |20201112/141633/|2002540000002523 ";
        String[] infos = info.split("\\|");
        System.out.println(infos);
        System.out.println(infos.length);
        for(int i =0;i<infos.length;i++){
            System.out.println(infos[i]);
        }
        System.out.println(infos[7]);
        System.out.println(infos[8]);
    }
}
