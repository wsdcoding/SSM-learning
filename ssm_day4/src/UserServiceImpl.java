/**
 * @author Wei
 * @create 2018-04-20 17:51
 * @desc
 **/
//这是基于JDK，需要实现几口

public class UserServiceImpl implements UserService {//操作，在实现接口的时候拦截一下，或者是先让他代理一下，先干点自己想干的事情，然后再让他实现接口
    @Override
    public void callName(String name) {
        System.out.println(name);
    }
}

//基于cglib，不需要接口
//    public class UserServiceImpl{
//        public void callName(String name) {
//        System.out.println(name);
//        }
//    }