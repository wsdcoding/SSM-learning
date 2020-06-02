/*
package top.aiprogram.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

*/
/**
 * @author Shiko
 * @create 2018-04-21 17:35
 * @desc 这是springMVC拦截器类，需要实现一些接口,还要xml声明拦截器
 **//*

public class SpringMvcInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;//请求发往controller就拦截，返回true才会执行controller
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("请求执行了");//controller处理之后执行
    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

        System.out.println("over");
    }
}
*/
