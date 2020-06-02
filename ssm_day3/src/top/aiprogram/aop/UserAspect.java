package top.aiprogram.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect         //声明切面
public class UserAspect {
    @Pointcut(value = "execution(* top.aiprogram.service.*.*(..))")     //.*.*(..) : 拦截包下面的任意类的任意方法
    public void pointCut(){}

        //advice  通知我要干的事情，什么时候干
        @Before(value = "pointCut()")
        public void doBefore(JoinPoint joinPoint){  //链接点，就是程序具体执行的点，多指的是程序的方法
            String name = joinPoint.getSignature().getName();
            Object[] args = joinPoint.getArgs();    //拿service的参数
            System.out.println(name+"-------------"+args.toString());
        }
        @After(value = "pointCut()")
        public void doAfter(JoinPoint joinPoint){
            String name = joinPoint.getSignature().getName();
            //Object[] args = joinPoint.getArgs();
            System.out.println(name + "        ");
        }



        @AfterReturning(value = "pointCut()",returning = "result")
        public void afterReturn(JoinPoint joinPoint,Object result){
            System.out.println(result);
        }



        @AfterThrowing()
        public void afterThrowing(){

        }
        @Around(value = "pointCut()")   //环绕通知
        public void around(ProceedingJoinPoint proceedingJoinPoint){
            try {
                proceedingJoinPoint.proceed();//如果这里不重新设置.proceed()方法程序将会始终受到拦截
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
}
