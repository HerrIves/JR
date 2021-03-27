package com.javarush.task.task32.task3205;

import java.lang.reflect.Proxy;

/* 
Создание прокси-объекта
https://leodev.ru/blog/java/java-dynamic-proxy
https://javarush.ru/groups/posts/2281-dinamicheskie-proksi
*/

public class Solution {
    public static void main(String[] args) {
        SomeInterfaceWithMethods obj = getProxy();
        obj.stringMethodWithoutArgs();
        obj.voidMethodWithIntArg(1);

        /* expected output
        stringMethodWithoutArgs in
        inside stringMethodWithoutArgs
        stringMethodWithoutArgs out
        voidMethodWithIntArg in
        inside voidMethodWithIntArg
        inside voidMethodWithoutArgs
        voidMethodWithIntArg out
        */
    }

    public static SomeInterfaceWithMethods getProxy() {
        SomeInterfaceWithMethodsImpl siwm = new SomeInterfaceWithMethodsImpl();

        SomeInterfaceWithMethods siwmProxy = (SomeInterfaceWithMethods) Proxy.newProxyInstance
                (
                siwm.getClass().getClassLoader(),
                siwm.getClass().getInterfaces(),
                new CustomInvocationHandler(siwm)
                );

        return siwmProxy;
    }
}
