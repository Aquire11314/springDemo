package com.yang;

import com.yang.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //1.创建spring的ioc容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        //2.从ioc容器中获取bean实例
        User user = ctx.getBean("user",User.class);
        System.out.println(user);
    }
}
