package com.mirea.kt.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoaderRunnable implements Runnable {

    private String path;

    public LoaderRunnable(String path) {
        this.path = path;
    }

    public void run() {
        FileInputStream fis;
        if (this.path != null && new File(this.path).exists()) {
            try {
                fis = new FileInputStream(this.path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Message message = (Message) ois.readObject();
                ois.close();
                System.out.println(message.toString());
                System.out.println("Десериализация прошла успешно");
            }catch (Exception ex) {
                System.out.println("Возникла ошибка при десериализации");
                ex.printStackTrace();
            }
        }
    }

}
