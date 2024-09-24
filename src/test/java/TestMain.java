import org.example.QueueArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestMain {
    @Test
    public static void main(String[] args) {
        //Создаем очередь из 3 человек
        QueueArray qa = new QueueArray();
        qa.setN(3);
        qa.createArr();

        //Первый в очереди
        Assertions.assertTrue(qa.put("Lola"));
        Assertions.assertEquals(Arrays.toString(qa.getArr()),
               Arrays.toString(new String[]{"Lola", null, null}));

        //Второй в очереди
        Assertions.assertTrue(qa.put("Pit"));
        Assertions.assertEquals(Arrays.toString(qa.getArr()),
                Arrays.toString(new String[]{"Lola", "Pit", null}));

        //Третий в очереди
        Assertions.assertTrue(qa.put("Tom"));
        Assertions.assertEquals(Arrays.toString(qa.getArr()),
                Arrays.toString(new String[]{"Lola", "Pit", "Tom"}));

        //Лишний элемент
        Assertions.assertFalse(qa.put("Lola"));

        //Первый вышел
        Assertions.assertEquals(qa.pullFirst(), "Lola");

        //Второй вышел
        Assertions.assertEquals(qa.pullFirst(), "Pit");

        //Последний ушёл
        Assertions.assertEquals(qa.pullFirst(), "Tom");

        //Пустая очередь
        System.out.println("Вывести очередь " +  Arrays.toString(qa.getArr()));



    }
    }
