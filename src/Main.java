import java.util.*;

/**
 * 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
 * 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
 * 3. Вставить элемент в список в первой позиции.
 * 4. Извлечь элемент (по указанному индексу) из заданного списка.
 * 5. Обновить определенный элемент списка по заданному индексу.
 * 6. Удалить третий элемент из списка.
 * 7. Поиска элемента в списке по строке.
 * 8. Создать новый список и добавить в него несколько елементов первого списка.
 * 9. Удалить из первого списка все элементы отсутствующие во втором списке.
 * 10. *Сортировка списка.
 * 11. *Сравнить время работы пункта 3 для ArrayList и LinkedList.
 */
public class Main {
    public static void main(String[] args) {
//  1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Audi");
        list1.add("Lada");
        list1.add("Toyota");
        list1.add("Volvo");
        list1.add("Harley Davidson");
        System.out.println("-------1-------");
        list1.forEach(i -> System.out.println(i));

//  2. Итерация всех элементов списка и добавления к каждому символа '!'.
        System.out.println("-------2------");
        for (String i:
             list1) {
            System.out.println(i + "!");
        }

//  3. Вставить элемент в список в первой позиции.
        list1.add(0, "GMC");
        System.out.println("-------3------");
        list1.forEach(i -> System.out.println(i));

//  4. Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("-------4-------");
        System.out.println(list1.get(3));

//  5. Обновить определенный элемент списка по заданному индексу.
        list1.set(2, "BMW");
        System.out.println("-------5------");
        list1.forEach(i -> System.out.println(i));

//  6. Удалить третий элемент из списка.
        list1.remove(2);
        System.out.println("--------6-------");
        list1.forEach(i -> System.out.println(i));

//  7. Поиска элемента в списке по строке.
        System.out.println("-------7------");
        for (String i: list1) {
            if(i.equals("Harley Davidson")) {
                System.out.println("forever");
            }
        }

//  8. Создать новый список и добавить в него несколько элементов первого списка.
        ArrayList<String> list2 = new ArrayList<String>();
        for (int i = 0; i <4; i++) {
            list2.add(list1.get(i));
        }
        System.out.println("-------8-------");
        list2.forEach(j -> System.out.println(j));

//  9. Удалить из первого списка все элементы отсутствующие во втором списке.
        list1.retainAll(list2);
        System.out.println("-------9------");
        list1.forEach(i -> System.out.println(i));

//  10. *Сортировка списка.
        System.out.println("-------10------");
        Collections.sort(list2);
        System.out.println(list2);

//  11. *Сравнить время работы пункта 3 для ArrayList и LinkedList.
        System.out.println("-------11------");
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i = 0; i < 10_000_000; i++) {
            list3.add(i, 3);
        }
        LinkedList<Integer> list4 = new LinkedList<Integer>();
        for (int i = 0; i < 10_000_000; i++){
            list4.add(i, 5);
        }
        long start = System.currentTimeMillis();
        list3.add(0, 10);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        list4.add(0, 10);
        System.out.println(System.currentTimeMillis() - start);
    }
}