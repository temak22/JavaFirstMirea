package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] songsInfo = {"Хоп-механика", "Агент", "Красота и уродство"};

        AlbumInfo albumInfo = new AlbumInfo(songsInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\temak\\source\\IdeaProjects\\other\\save.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем данные в файл
        objectOutputStream.writeObject(albumInfo);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\temak\\source\\IdeaProjects\\other\\save.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        AlbumInfo albumInfo1 = (AlbumInfo) objectInputStream.readObject();

        System.out.println(albumInfo1);
    }
}