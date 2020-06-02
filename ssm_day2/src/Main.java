import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Class.forName("Demo");        //拿到Demo类的字节码对象
        Demo demo = (Demo) clazz.newInstance();     //new instance 一个新的实例  要记得强转
        //几个比较重要的方法
        //Field file = clazz.getDeclaredField("name"); //第一个：getDeclaredField ; Field 域。这里不能访问private方法，可以使用setAccessibl方法暴力破解
        //System.out.println(file.getName());
        //clazz.getConstructor();        // 第二个：getConstructor只能访问publicx修饰的
        //clazz.getDeclaredField();      //可以访问私有的
        //clazz.getDeclaredMethod();    //可以访问私有的
        Method method = clazz.getDeclaredMethod("add", int.class, int.class); //只能访问publicx修饰的
/*        Class clax = method.getReturnType();
        int i = (int)method.invoke(demo,3,3);   //invoke 调用方法
        System.out.println(i);*/
        Test test = method.getAnnotation(Test.class);
        System.out.println(test.desc());
        System.out.println(test.value());
    }
}
