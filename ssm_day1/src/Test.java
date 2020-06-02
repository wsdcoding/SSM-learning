/**
 * Created by MeekWei 2018/11/22 15:11
 */
public class Test {

    static String prior = "done";
    static String last = f() ? g () : prior;
    public static boolean f(){
        return true;
    }    public static String g(){
        return "hello world";
        }
        static  {
            System.out.println(last);
            g();
        }

    public static void main(String[] args) {

    }
 }
