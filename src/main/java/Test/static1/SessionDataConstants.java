package Test.static1;

import com.wondersgroup.whs.framework.components.context.UserContext;
import com.wondersgroup.whs.framework.components.context.UserContextUtils;

/**
 * @author chenlin
 * @create 2020-10-13 16:46
 * @description: TODO
 * @version：1.0
 **/
public class SessionDataConstants {
    static UserContext context = UserContextUtils.get();

    public static final String cwxx = "错误信息";
    public static final String czr = "操作人";
    //TODO (已知代办)从全局变量中取的各种字典，登录人的相关信息,先写死，后期需要从权限获取
//    public static final String g_varJglx="0";
    //    public static final String g_varJgdm="YBB000004".trim();
    //    public static final String g_varJgmc="徐汇区医保办".trim();
    //    public static final String g_varYhbs="3442";//操作人标识
//    public static final String g_varQxdm="06";//当前登录账号所在区县
    public static final String g_varYhxm = "医保办测试";//操作人姓名

    /**
     * 机构类型 0表示市或者区医保办，1表示街道
     */
    public static String g_varJglx = context.getExt().get("organType");
    /**
     * 区县代码
     */
    public static String g_varQxdm = context.getExt().get("zone3");
    /**
     * 机构代码
     */
    public static String g_varJgdm = context.getOrganCode();
    /**
     * 机构名称
     */
    public static final String g_varJgmc = context.getOrganName();
    /** 用户ID */
    public static String g_varYhbs = context.getUserid();
    /** 账号*/
    public static String g_varYhDlm = context.getUserid();





    //TODO (已知代办)从全局变量中取的各种字典，登录人的相关信息和各种年度信息,先写死，后期需要从权限获取
    public static final String g_varYbnd = "2020";//医保年度
    public static final String g_varJmnd = "2019";//（可能是）居保年度
    public static final String g_varHzbknd = "2020";//互助帮困年度
    public static final String g_varPreYbnd = "2017";//（可能是）历年或去年医保年度
    public static final String g_varSysDate = "20201103";//（可能是）历年或去年医保年度

    public static final String g_varPreHzbknd = "2019";
    public static final String qxdm = "AA";

    //报表代码
    public static final String g_varBbdm = "000000000000000000000000";
    public static final String g_varSjzs = "0000000";

    //func_comInsertSjczjl from xzy
    public static final Integer g_iFyze = 0;
    public static final Integer g_iZhzfs = 0;
    public static final Integer g_iXjzfs = 0;
    public static final Integer g_iTczfs = 0;
    public static final Integer g_iFjzfs = 0;
    public static final String g_varSysMonth = "1";

}
