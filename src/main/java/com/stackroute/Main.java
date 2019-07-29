package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        Movie movie=context.getBean(Movie.class);
//        System.out.println(movie);
//        System.out.println( "Hello World!" );

        context.registerShutdownHook();

    }
}
