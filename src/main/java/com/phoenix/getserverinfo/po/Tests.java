package com.phoenix.getserverinfo.po;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author tangbojin
 * @Date 2019/9/4 19:24
 */
public class Tests {

    private int id;

    private String name;

    @Override
    public String toString() {
        return "Tests{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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
}
