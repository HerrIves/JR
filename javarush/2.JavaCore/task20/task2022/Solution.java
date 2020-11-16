package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    String fileName = "123";

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
//        out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        stream = null;
        stream =  new FileOutputStream(fileName, true);
        in.defaultReadObject();
//        in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        String fileName = "c:/temp/temp0.txt";
//        Solution solutionWrite = new Solution(fileName);
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/temp/temp.txt"));
//        oos.writeObject(solutionWrite);
//        oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/temp/temp.txt"));
//        Solution solutionRead = (Solution) ois.readObject();
//        ois.close();
//
//        System.out.println(solutionRead.equals(solutionWrite));



    }
}
