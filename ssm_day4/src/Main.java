import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
  *@Description aop原理
  *@Param:
  *@return:
*/
public class Main {

    public static void main(String[] args) {


        //基于JDK方法,默认使用的是JDK方法，InvocationHandler调用处理，必须实现接口，优势是利用反射创建对象，创建效率高
        //
//        UserService userService = new UserServiceImpl();
//        InvocationHandler handler = new UserInvocationHandler(userService);
//        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().
//                getClassLoader(), userService.getClass().getInterfaces(),handler);
//        userServiceProxy.callName("shidea");
//        System.out.println("Hello");
        //around


        //基于cglib，asm搞字节码的，基于子类基于继承，没有接口的时候只能用这个了，优势是执行效率高。
        cglibProcy proxy = new cglibProcy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(proxy);
        UserServiceImpl userService = (UserServiceImpl) enhancer.create();
        userService.callName("shidea 2 ");
    }
}
