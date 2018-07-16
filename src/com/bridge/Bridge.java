package com.bridge;

public class Bridge {

    //定义一个桥，持有Sourceable的一个实例
    //桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
    //例子：JDBC桥DriverManager
    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

}
