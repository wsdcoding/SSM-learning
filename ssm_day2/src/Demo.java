/**
 * @author MeekWei
 * @create 2018-04-17 12:19
 * @desc
 **/
public class Demo {
    public Demo() { }
    private String name;
    public Demo(String name) { }

    @Test(value = "demo")
    public int add (int a, int b){
        return a + b;
    }
    private String getName() { return name; }
    public String getPuName() { return name; }
}
