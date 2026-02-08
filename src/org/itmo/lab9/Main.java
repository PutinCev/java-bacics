package org.itmo.lab9;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        //Лаб 9. Задание 2.
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Collection<String> uniqueStrings = removeDuplicates(strings);
        System.out.println("Без дубликатов: " + uniqueStrings);

        //Лаб 9. Задание 3.
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Заполнение 1,000,000 элементов");
        // Заполнение ArrayList
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long arrayListFillTime = System.currentTimeMillis() - start;

        // Заполнение LinkedList
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        long linkedListFillTime = System.currentTimeMillis() - start;

        System.out.println("ArrayList заполнен за: " + arrayListFillTime + " мс");
        System.out.println("LinkedList заполнен за: " + linkedListFillTime + " мс");

        System.out.println("\n Произвольный доступ");
        System.out.print("Введите количество попыток выбора наугад из заполненного списка: ");
        int attempts = scanner.nextInt();

        testRandomAccess(arrayList, linkedList, attempts);

        //Лаб 9. Задание 4.
        //Так как по условию мы будем использовать класс Пользователь,
        //то при создании объекта пользователь буду создавать новое соответствие имени(строки) и пользователя
        Map<User, Integer> scores = new HashMap<>();

        User anton = new User("Антон");
        User victor = new User("Виктор");
        User maria = new User("Мария");
        User ivan = new User("Иван");
        User olga = new User("Ольга");

        scores.put(anton, 2700);
        scores.put(victor, 0);
        scores.put(maria, 1350);
        scores.put(ivan, 2000);
        scores.put(olga, 200);

        System.out.print("Введите имя пользователя: ");
        String userName = scanner.nextLine();

        // Создаем временного пользователя для поиска
        User searchUser = new User(userName);

        if (scores.containsKey(searchUser)) {
            System.out.println("Пользователь с именем " + userName + " найден");
            System.out.println("У пользователя " + userName + " " +
                    scores.get(searchUser) + " очков");
        } else {
            System.out.println("Пользователь не найден");
        }
        scanner.close();
    }

    private static void testRandomAccess(List<Integer> arrayList, List<Integer> linkedList, int attempts) {
        Random rand = new Random();
        // Тест для ArrayList
        long start = System.nanoTime();
        for (int i = 0; i < attempts; i++) {
            int index = rand.nextInt(arrayList.size());
            arrayList.get(index);
        }
        long arrayListTime = System.nanoTime() - start;
        // Тест для LinkedList
        start = System.nanoTime();
        for (int i = 0; i < attempts; i++) {
            int index = rand.nextInt(linkedList.size());
            linkedList.get(index);
        }
        long linkedListTime = System.nanoTime() - start;

        System.out.println("ArrayList: " + (arrayListTime / 1000000) + " мс");
        System.out.println("LinkedList: " + (linkedListTime / 1000000) + " мс");
        System.out.println("LinkedList медленнее в " + (linkedListTime / (double) arrayListTime) + " раз");
    }
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return new ArrayList<>();
        }
        Set<T> set = new LinkedHashSet<>(collection);
        return new ArrayList<>(set);
    }
}
