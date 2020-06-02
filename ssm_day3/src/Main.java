import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import top.aiprogram.controller.UserController;
import top.aiprogram.entity.User;
import top.aiprogram.entity.UserFather;
import top.aiprogram.service.UserService;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("./top/aiprogram/resource/application-context.xml");
          UserFather user = context.getBean(UserFather.class);
//          System.out.println(user.getFathNmae());
//        User user = context.getBean(User.class);
//        System.out.println(user.getId());
//        System.out.println(user.getName());
//        UserFather user = context.getBean(UserFather.class);
//        System.out.println(user.getFathNmae());
//        System.out.println(user.getUser());
        //注解方式注入
/**     @Service    //业务层
        @Component  //如果不知道的的bean用在哪里可以放到公共组件
        @Controller //控制用户请求--》主要用于springMVC
        @Autowired
        DI 依赖注入
        面编程AOP aspect orient program，统一组织代码，拦截某些代码前后做一些操作,减少代码量，减少一些认为错误
        两种方式：基于注解、基于xml
 */
        UserController userController = context.getBean(UserController.class);
        UserService service = userController.getUserService(); //如果注入成功，这里能拿到service
        service.say("qiemianxml");
    }
}
