package com.templateMethod;

public abstract class AbstractCalculator {

//    模板方法的意图：定义一个算法流程，将一些特定步骤的具体实现、延迟到子类。
//    使得可以在不改变算法流程的情况下，通过不同的子类、来实现“定制”流程中的特定的步骤。
//
//    策略模式的意图：使不同的算法可以被相互替换，而不影响客户端的使用。
//
//    在意图上看，模板方法更加强调：
//
//    1）定义一条线（算法流程），线上的多个点是可以变化的（具体实现在子类中完成），
//       线上的多个点一定是会被执行的，并且一定是按照特定流程被执行的。
//
//    2）算法流程只有唯一的入口，对于点的访问是受限的【通常用受保护的虚函数来定义可变点】。
//
//    策略模式更注重于： 一个“策略”是一个整体的(完整的)算法，算法是可以被整体替换的。
//                    而模板方法只能被替换其中的特定点，算法流程是固定不可变的。

    /*主方法，实现对本类其它方法的调用*/
    public final int calculate(String exp,String opt){
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }

    /*被子类重写的方法*/
    abstract public int calculate(int num1,int num2);

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }

}
