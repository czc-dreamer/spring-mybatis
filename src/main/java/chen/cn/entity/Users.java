package chen.cn.entity;

public class Users {


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    private Integer id;
    private String name;
    private String pass;

    public String toString(){
        return "Users:{"+"id:"+id+",name:"+name+",pass:"+pass+"}";
    }
}
