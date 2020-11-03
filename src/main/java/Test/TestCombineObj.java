package Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author zhangrongchuan
 * @data 2020-10-2020/10/29-15:58
 * @Description
 */
public class TestCombineObj {
    /*
    以第一个实体类为主，如果第一个的实体类某个字段为空，则会吧第二个实体类的值取过来进行赋值，
    如果不为空的则不作改变
     */
    private static Student combineSydwCore(Student sourceBean, Student targetBean) {
        Class sourceBeanClass = sourceBean.getClass();
        Class targetBeanClass = targetBean.getClass();

        Field[] sourceFields = sourceBeanClass.getDeclaredFields();
        Field[] targetFields = targetBeanClass.getDeclaredFields();
        for (int i = 0; i < sourceFields.length; i++) {
            Field sourceField = sourceFields[i];
            if (Modifier.isStatic(sourceField.getModifiers())) {
                continue;
            }
            Field targetField = targetFields[i];
            if (Modifier.isStatic(targetField.getModifiers())) {
                continue;
            }
            sourceField.setAccessible(true);
            targetField.setAccessible(true);
            try {
                if (!(sourceField.get(sourceBean) == null) && !"serialVersionUID".equals(sourceField.getName().toString())) {
                    targetField.set(targetBean, sourceField.get(sourceBean));
                }
            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return targetBean;
    }

    public static void main(String[] args) {

    }
}
