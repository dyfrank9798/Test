package Test;

import java.util.Date;

/**
 * @author zhangrongchuan
 * @data 2020-08-2020/8/18-10:28
 * @Description
 */
public class TestVo {
    private String name;
    private String id;
    private Date time;

    private String bsjxsfbg;
    private String pzwhsfbg;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    public String getBsjxsfbg() {
        return bsjxsfbg;
    }

    public void setBsjxsfbg(String bsjxsfbg) {
        this.bsjxsfbg = bsjxsfbg;
    }

    @Override
    public String toString() {
        return "TestVo{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", time=" + time +
                ", bsjxsfbg='" + bsjxsfbg + '\'' +
                ", pzwhsfbg='" + pzwhsfbg + '\'' +
                '}';
    }

    public String getPzwhsfbg() {
        return pzwhsfbg;
    }

    public void setPzwhsfbg(String pzwhsfbg) {
        this.pzwhsfbg = pzwhsfbg;
    }
}
