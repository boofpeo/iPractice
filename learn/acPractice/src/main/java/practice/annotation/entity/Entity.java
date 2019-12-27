package practice.annotation.entity;

import practice.annotation.define.MyAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Entity {

    private String name;

    @MyAnnotation(value = "myEquals")
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    protected boolean myEquals(String summit, String order) {
        return summit.equals(order);
    }

    public static void main(String[] args) {

        //获取对应的Class字段
        Field[] fields = Entity.class.getDeclaredFields();
        for (Field field : fields) {
            MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
            if (annotation == null) {
                continue;
            }
            String methodName = annotation.value();
            Class<?>[] params = annotation.params();

            //传入参数，获取重载方法 以及私有的方法
            Method method = null;
            try {
                method = Entity.class.getDeclaredMethod(methodName, params);
                method.setAccessible(true);//获取私有权限
                Object result = method.invoke(Entity.class.newInstance(), "1", "1");
                System.out.println(result);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }


    }
}
