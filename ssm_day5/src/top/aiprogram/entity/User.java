package top.aiprogram.entity;

/**
 * @author WeiShiDe
 * @create 2018-04-20 19:41
 * @desc
 **/
public class User {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}