package org.example;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class QueueArray {
    //Массив для хранения очереди
    private static String[] arr;
    //Резерв N ячееек массива
    private int N;
    public QueueArray() {

    }

    //Создать массив -  True если создан
    public void createArr() {
        arr = new String[N];
        setArr(arr);
    }


    //Установть количество элементов очереди
    public int setN(int n) {
        N = n;
        return n;
    }

    //Получить массив
    public String[] getArr() {
        return arr;
    }

    //Устанавливаем массив
    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public boolean isFull() {
        for (String s : arr) {
            if (s == null) return false;
        }
        return true;
    }

    /*Добавляем в конец ояереди строку и возвращаем true, если  места
    ,иначе не добавляем,а возвращаем false  */

    public boolean put (String s) {
        if (!isFull()){
            for (int i=0; i < arr.length; i++){
              if (arr[i] == null){
                  arr[i] = s;
                  return true;
              }
            }
        }
        return false;
    }
    //Получаем первый элемент массива
    @Contract(pure = true)
    public static @Nullable String getFirst(){
        String t = arr[0];
        if(t != null) return t;
        return null;
    }
    //Вытягиваем из массива первый элемент, остальные сдвигаем на его место
    public static String pullFirst(){
        String f = arr[0];
        int l = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[ i+ 1];
        }
        arr[l]=null;
        return f;
    }


}


