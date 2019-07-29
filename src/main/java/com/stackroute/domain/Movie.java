package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//public class Movie
//{
////    private Actor actor;
////    @Autowired
////    public void setActor(Actor actor)
////    {
////        this.actor = actor;
////    }
////
////    @Override
////    public String toString() {
////        return "Movie{" +
////                "actor=" + actor +
////                '}';
////    }
//public Actor() {
//
//}
//
//    public Actor(String name, String gender, int age) {
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Actor{" +
//                "name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//}
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware
{
    Actor actor;
    private ApplicationContext applicationContext = null;
    private BeanFactory beanFactory;

    //use setter injection in task1
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }
    public Movie() {
        super();
    }

    //use constructor-injection in task2
    public Movie(Actor actor) {
        this.actor = actor;
    }
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
    public void setBeanName(String s) {
        System.out.println(s);
    }
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", applicationContext=" + applicationContext +
                ", beanFactory=" + beanFactory +
                '}';
    }
}