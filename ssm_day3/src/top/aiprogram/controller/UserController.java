package top.aiprogram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import top.aiprogram.service.UserService;

/**
 * @author WeiShiDe
 * @create
 * @desc
 **/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
}
