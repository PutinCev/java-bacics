package org.itmo.lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        viewResultOfTask1();
        viewResultOfTask2();
        viewResultOfTask3();
        viewResultOfTask4();
        viewResultOfTask5();
    }

    public static void viewResultOfTask1() {
        String text = "Lorem Ipsum — это просто фиктивный текст, используемый в полиграфической и издательской индустрии." +
                " Lorem Ipsum является стандартным фиктивным текстом в этой отрасли с 1500-х годов, когда неизвестный печатник" +
                " взял набор шрифтов и перемешал их, чтобы создать образец шрифтов. Он сохранился не только на протяжении" +
                " пяти веков, но и пережил переход к электронной верстке, оставаясь по сути неизменным. Он стал популярен" +
                " в 1960-х годах с выпуском листов Letraset, содержащих отрывки Lorem Ipsum, а в последнее время — благодаря" +
                " программам настольной издательской системы, таким как Aldus PageMaker, включающим версии Lorem Ipsum.";
        // Удалbv всего, кроме букв, цифр и пробелов:
        String textOnlyLettersAndNumbers = text.replaceAll("[^\\p{L}\\p{Nd}\\s]", "");

        String longestWord = "";
        String[] words = textOnlyLettersAndNumbers.split(" ");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(text);
        System.out.println("Самое длиное слово текста - " + longestWord);
    }

    public static void viewResultOfTask2() {
        Boolean IsPalindrom = true;
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[letters.length - 1 - i] != letters[i]) {
                IsPalindrom = false;
                break;
            }
        }
        System.out.println("Слово " + word + ((IsPalindrom == true) ? " " : " НЕ ") + "является палиндромом");
    }

    public static void viewResultOfTask3() {
        Scanner scanner = new Scanner(System.in);
        String badText = scanner.nextLine();
        String goodText = replaceByaka(badText);
        System.out.println(goodText);
    }

    public static String replaceByaka(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("(?i)бяка", "[вырезано цензурой]");
    }

    public static void viewResultOfTask4() {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        text1 = "Начало" + text1 + "Конец";
        String text2 = scanner.nextLine();
        String[] partWithoutSubString = text1.split(text2);
        System.out.println("Количество вхождений строки " + text2 + " в строку " + text2 + " равняется " + (partWithoutSubString.length - 1));
    }

    public static void viewResultOfTask5() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
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
        System.out.println(newText);
    }
}