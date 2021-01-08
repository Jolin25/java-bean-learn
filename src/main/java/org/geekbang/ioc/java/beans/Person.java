package org.geekbang.ioc.java.beans;

/**
 * @Author:jrl
 * @Date:Create in 11:04 2021-1-8
 * @Description:  【为了讲解JavaBean】
 * 描述人的 POJO 类
 */
public class Person {
    /**
     * knowledge point:
     *  1.贫血模型
     *      是指领域对象里只有get和set方法（POJO），所有的业务逻辑都不包含在内而是放在Business Logic层。
 *      2.JavaBean
     *      贫血模型 --> JavaBean
     *          setter --> writable
     *          getter --> readable
     *          field --> properties
     */

    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
