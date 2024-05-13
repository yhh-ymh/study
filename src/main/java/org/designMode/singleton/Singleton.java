package org.designMode.singleton;

/**
 * @description 设计模式 - 单例模式
 * @author: yhh
 * @Date: 2024/5/13/05
 **/
//懒汉模式
public class Singleton {
    private Singleton(){}

    private Singleton singleton = null;

    //线程不安全
    public Singleton getSingleton(){
        if (singleton == null){
            return new Singleton();
        }
        return singleton;
    }


    //考虑线程安全的做法

    //同步方法上加锁
    public synchronized Singleton getSingleton1(){
        if (singleton == null){
            return new Singleton();
        }
        return singleton;
    }

    //双重检查
    public Singleton getSingleton2(){
        if (singleton == null){
            synchronized(Singleton.class){
                if (singleton == null){
                    return new Singleton();
                }
            }
        }
        return singleton;
    }

    //静态内部类

}

//饿汉式在类创建的同时就已经创建好一个---静态---的对象供系统使用，以后不再改变，所以天生是线程安全的。
class SingletonHungry{
    private static final SingletonHungry singleton = new SingletonHungry();
    public SingletonHungry getSingleton(){
        return singleton;
    }
}

