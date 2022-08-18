package com.itranswap.sample;

public class hi {
    public static void main(String[] args) {
        Outer outer = new Outer("Neee");
        Outer.Inner inner = outer.new Inner();
    }
}

class Outer {
    private String name;

    Outer(String name) {
        this.name = name;
    }

    void asyncHello() {
        Runnable r = new Runnable() {
            @Override   // 接口不能被实例化（接口仅仅有抽象的方法） 这里对接口进行实现
            public void run() {

            }
        };
    }

    class 类名 implements 接口名() {
        重写接口的方法；
    }// 可以用这个接口或者类了
    接口 名 = new 接口（）；
    类   名 = new 类  （）；
}
