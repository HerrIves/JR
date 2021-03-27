package com.javarush.task.task21.task2107;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/

public class Solution implements Cloneable{
    @Override
    public String toString() {
        return "Solution{" +
                "users=" + users +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        clone = (Solution) solution.clone();
        System.out.println("solution " +solution);
        System.out.println("clone " + clone);

        System.out.println(solution.users);
        System.out.println(clone.users);


        System.out.println(solution.users.get("Hubert").hashCode() +" " +(clone.users.get("Hubert")).hashCode());
        System.out.println(solution.users.get("Hubert").equals(clone.users.get("Hubert")));

    }
    public Object clone () throws CloneNotSupportedException {
    Solution solutionClone = new Solution();
    solutionClone.users = new LinkedHashMap<>();

    for (Map.Entry<String,User> entry: this.users.entrySet()) {
        solutionClone.users.put(entry.getKey(), (User) entry.getValue().clone());
        }

    return solutionClone;
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public int hashCode(){
            int result = 31;

            result = result * age;
            result = result + name.hashCode();

            return result;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            User userClone = new User(this.age, this.name);

            return userClone;
        }
        public boolean equals(Object o){
            if (o == this) return true;
            if( ! (o instanceof User))return false;

            User otherUser = (User) o;

            if (this.age != otherUser.age) return false;
            return (this.name != null ? this.name.equals(otherUser.name) : otherUser.name == null);
        }

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
