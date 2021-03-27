package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/

public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            super.clone();
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            C c = new C(getI(), getJ(), getName());
            return c;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(1,2);

        B b = new B(1,2, "B");
        B bb = (B) b.clone();

        C c = new C(1,2,"C");
        C cc = (C) c.clone();

//        System.out.println(b);
//        System.out.println(bb);
        System.out.println(c);
//        System.out.println(cc);
    }
}
