package top.aiprogram.service;

import org.springframework.stereotype.Service;

/**
 * @author Shiko
 * @create
 * @desc
 **/
@Service("userServiceImpl") // 打上Service注解表明加载业务处理类的时候也顺便加载一下Java bean，这样就不用在xml声明一个一个bean了
public class UserServiceImpl implements UserService {

    @Override
    public String say(String value) {
        System.out.println(value);
        return "注解方式";
    }
}
