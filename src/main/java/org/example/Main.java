package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        QueueArray qa = new QueueArray();
        //Резервируем количество ячеек под очередь
        qa.setN(5);

        //Создаем массив под очередб
        qa.createArr();

        //Добавляем элементы в очередь
        System.out.println("Tom " + qa.put("Tom"));
        System.out.println("Fidel " + qa.put("Fidel"));
        System.out.println("Maryam " + qa.put("Maryam"));
        System.out.println("Linda " + qa.put("Linda"));
        System.out.println("Linda " + qa.put("Linda"));


        System.out.println("Добавляем лишний элемент " + qa.put("Linda"));

        // Вывод очереди
        System.out.println("Вся очередь " + Arrays.toString(qa.getArr()));

        //Забираем первого из очереди
        System.out.println(QueueArray.pullFirst());

        // Вывод очереди
        System.out.println("Вся очередь " + Arrays.toString(qa.getArr()));

        //Забираем первого из очереди
        System.out.println(QueueArray.pullFirst());

        // Вывод очереди
        System.out.println("Вся очередь " + Arrays.toString(qa.getArr()));
    }

}