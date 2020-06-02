//描述自定义注解的注解叫做: 元注解. 下面四种中重点学习前面两个

import java.lang.annotation.*;
@Target(ElementType.METHOD)  //ElementType.FIELD将来目标要用于一个类的（作用域）成员变量，没法用于成员方法
@Retention(RetentionPolicy.RUNTIME)    //描述注解什么时候要用,.看里面可以看到三种方法
/*
@Documented                     //要不要生成文档
@Inherited       //将来把注解用在某一个类上了，如果子类继承了此类的方法，那么注解时候需要生效
*/
public @interface Test {
    public String value();
    public String desc() default "这是一个描述";
}
