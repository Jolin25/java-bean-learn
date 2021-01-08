package org.geekbang.ioc.java.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.stream.Stream;

/**
 * @Author:jrl
 * @Date:Create in 11:20 2021-1-8
 * @Description: 了解BeanInfo的Api的基本使用
 */
public class BeanInfoDemo {
    public static void main(String[] args) throws IntrospectionException {
        // 通过javabean的自省的方式来获得BeanInfo
        //  因为Object中有这个方法：public final native Class<?> getClass();所以会被误认为有class这个字段
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class,Object.class);
        //PropertyDescriptor在spring里面常用
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        Stream<PropertyDescriptor> propertyDescriptorStream = Stream.of(propertyDescriptors);
        propertyDescriptorStream.forEach(propertyDescriptor -> {
            System.out.println(propertyDescriptor.toString());
        });
    }
}
