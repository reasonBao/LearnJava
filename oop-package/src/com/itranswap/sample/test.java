package com.itranswap.sample;

class test {
    public static void main(String[] args) {
        Inner i = new Inner();
        i.hi();
    }

    static void hello() {
        System.out.println("private hello!");
    }

    static class Inner {
        public void hi() {
            test.hello();
        }
    }
}
