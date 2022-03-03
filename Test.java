package com.yechao.javabean;

public class Test {
    public static void main(String[] args) {
        User u = new User();
        u.setName("蔡德文");
        u.setAge(23);
        u.setSalary(5000);
        u.setRelationship("儿子");
        System.out.print("姓名：" + u.getName() + "\t");
        System.out.print("年龄：" + u.getAge() + "\t");
        System.out.print("工资：" + u.getSalary() + "\t");
        System.out.println("人物关系：" + u.getRelationship());

        User u1 = new User("叶超", 23, 10000, "爸爸");
        System.out.print("姓名：" + u1.getName() + "\t");
        System.out.print("年龄：" + u1.getAge() + "\t");
        System.out.print("工资：" + u1.getSalary() + "\t");
        System.out.print("人物关系：" + u1.getRelationship());

    }
}
