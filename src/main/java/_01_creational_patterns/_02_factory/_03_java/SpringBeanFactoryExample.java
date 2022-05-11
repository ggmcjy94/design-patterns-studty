package _01_creational_patterns._02_factory._03_java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryExample {



    public static void main(String[] args) {
        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello = xmlFactory.getBean("hello", String.class);
        System.out.println(hello);

        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
        String hi = javaFactory.getBean("hello", String.class);
        System.out.println(hi);
    }

    // 단순한 팩토리 패턴
    // 매개변수의 값에 따라 또는 메소드에 따라 각기 다른 인스턴스를 리턴하는 단순한 버저의 팩토리 패턴
    // java.lang.Calendar 또는 java.lang.NumberFormat 에서 사용한다,
    // 스프링 BeanFactory
    // Object 티입의 Product를 만드는 BeanFactory라는 Creator;
}
