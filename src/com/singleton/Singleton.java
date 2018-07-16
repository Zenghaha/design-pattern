package com.singleton;

public class Singleton {

    private static Singleton ourInstance = new Singleton();

//    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
//    private static Singleton instance = null;

    public static Singleton getInstance() {
        return ourInstance;
    }

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

//    /* 静态工程方法，创建实例  单线程下*/
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

        //synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }


//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (instance) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

//    public void test(){
//        singleEnum.Instance.getInstance();
//    }
}
