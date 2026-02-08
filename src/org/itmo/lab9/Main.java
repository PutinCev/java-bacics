package org.itmo.lab9;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Лаб 9. Задание 2.
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
        testRandomAccess(arrayList, linkedList, 100000);

        //Лаб 9. Задание 4.
        //Так как по условию мы будем использовать класс Пользователь,
        //то при создании объекта пользователь буду создавать новое соответствие имени(строки) и пользователя
        Map<User, Integer> scores = new HashMap<>();
        Map<String, User> users = new HashMap<>();

        User anton = new User("Антон");
        User victor = new User("Виктор");
        User maria = new User("Мария");
        User ivan = new User("Иван");
        User olga = new User("Ольга");

        users.put("Виктор",victor);

        scores.put(anton, 2700);
        users.put("Антон",anton);

        scores.put(maria, 1350);
        users.put("Мария",maria);

        scores.put(ivan, 2000);
        users.put("Иван",ivan);

        scores.put(olga, 200);
        users.put("Ольга",olga);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя пользователя: ");
        String userName = scanner.nextLine();

        //найдем пользователя по имени в мапе users
        User searchUser;
        if (users.containsKey(userName)) {
            System.out.println("Пользователь с именем " + userName + " найден");
            searchUser = users.get(userName);
            // Ищем очки этого пользователя
            if (scores.containsKey(searchUser)) {
                System.out.println("У пользователя " + userName + " " +
                        scores.get(searchUser) + " очков");
            } else {
                System.out.println("У пользователя "+userName+" очки не найдены");
            }
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
