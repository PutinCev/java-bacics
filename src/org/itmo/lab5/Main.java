package org.itmo.lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Написать метод для поиска самого длинного слова в тексте
        //viewResultOfTask1();
        Scanner scanner = new Scanner(System.in);
//        String text = "Lorem Ipsum — это просто фиктивный текст, используемый в полиграфической и издательской индустрии." +
//                " Lorem Ipsum является стандартным фиктивным текстом в этой отрасли с 1500-х годов, когда неизвестный печатник" +
//                " взял набор шрифтов и перемешал их, чтобы создать образец шрифтов. Он сохранился не только на протяжении" +
//                " пяти веков, но и пережил переход к электронной верстке, оставаясь по сути неизменным. Он стал популярен" +
//                " в 1960-х годах с выпуском листов Letraset, содержащих отрывки Lorem Ipsum, а в последнее время — благодаря" +
//                " программам настольной издательской системы, таким как Aldus PageMaker, включающим версии Lorem Ipsum.";
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        String longestWord = findLongestWord(text);
        System.out.println(text);
        System.out.println("Самое длиное слово текста - " + longestWord);

        //2.	Написать метод, который проверяет является ли слово палиндромом
        //viewResultOfTask2();
        System.out.println("Введите слово для проверки, является ли оно палиндромом:");
        String word = scanner.nextLine();
        Boolean isPalindrom = wordIsPalindrom(word);
        System.out.println("Слово " + word + ((isPalindrom == true) ? " " : " НЕ ") + "является палиндромом");

        //3.	Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»
        //viewResultOfTask3();
        System.out.println("Введите текст для проверки");
        String badText = scanner.nextLine();
        System.out.println("Введите запрещеные цензурой слова");
        String badWords = scanner.nextLine();
        String goodText = replacebadText(badText, badWords);
        System.out.println(goodText);

        //4.	Найти количество вхождений одной (являющейся подстрокой) в другую
        //viewResultOfTask4();
        System.out.println("Введите строку, в которой нужно найти подстроку");
        String text1 = scanner.nextLine();
        System.out.println("Введите подстроку, которую будем искать");
        String text2 = scanner.nextLine();
        int numberOfOccurrences = countNumberOfOccurrences(text1,text2);
        System.out.println("Количество вхождений строки " + text2 + " в строку " + text1 + " равняется " + numberOfOccurrences);

        //5.	Напишите метод, который инвертирует слова в строке.
        //viewResultOfTask5();
        System.out.println("Введите строку, буквы слов в которой нужно инвертировать");
        String text5 = scanner.nextLine();
        String newText = invertWordsInString(text5);
        System.out.println(newText);
    }

    //1. Метод для поиска самого длинного слова в тексте
    public static String findLongestWord(String text) {
        // Удалю все, кроме букв, цифр и пробелов:
        String textOnlyLettersAndNumbers = text.replaceAll("[^\\p{L}\\p{Nd}\\s]", "");
        String longestWord = "";
        String[] words = textOnlyLettersAndNumbers.split(" ");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    //2.	Метод, который проверяет является ли слово палиндромом
    public static Boolean wordIsPalindrom(String word) {
        Boolean isPalindrom = true;
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[letters.length - 1 - i] != letters[i]) {
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }

    //3.	Метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»
    public static String replacebadText(String text, String badWords) {
        if (text == null) {
            return null;
        }
        return text.replaceAll(badWords, "[вырезано цензурой]");
    }

    //4.	Метод поиска количества вхождений одной строки в другую
    public static int countNumberOfOccurrences(String text1, String text2) {
        text1 = "Начало" + text1 + "Конец";
        String[] partWithoutSubString = text1.split(text2);
        int numberOfOccurrences = partWithoutSubString.length - 1;
        return numberOfOccurrences;
    }

    //5.	Метод, который инвертирует слова в строке.
    public static String invertWordsInString(String text) {
        String[] words = text.split(" ");
        String newText = "";
        for (String word : words) {
            String newWord = "";
            char[] letters = word.toCharArray();
            for (char letter : letters) {
                newWord = letter + newWord;
            }
            newText = newText + ((newText != "") ? " " : "") + newWord;
        }
        return newText;
    }
}
