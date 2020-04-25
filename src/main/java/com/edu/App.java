package com.edu;

import com.edu.config.SpringConfig;
import com.edu.service.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestBean bean = context.getBean(TestBean.class);
        String name = bean.toString();
        //System.out.println(name);
    }
}
