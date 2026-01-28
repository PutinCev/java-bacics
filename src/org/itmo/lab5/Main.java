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

    public static void viewResultOfTask1() {
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
    }

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

    public static void viewResultOfTask2() {
        System.out.println("Введите слово для проверки, является ли оно палиндромом:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        Boolean isPalindrom = wordIsPalindrom(word);
        System.out.println("Слово " + word + ((isPalindrom == true) ? " " : " НЕ ") + "является палиндромом");
    }

    public static void viewResultOfTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для проверки");
        String badText = scanner.nextLine();
        System.out.println("Введите запрещеные цензурой слова");
        String badWords = scanner.nextLine();
        String goodText = replacebadText(badText, badWords);
        System.out.println(goodText);
    }

    public static String replacebadText(String text, String badWords) {
        if (text == null) {
            return null;
        }
        return text.replaceAll(badWords, "[вырезано цензурой]");
    }


    public static int countNumberOfOccurrences(String text1, String text2) {
        text1 = "Начало" + text1 + "Конец";
        String[] partWithoutSubString = text1.split(text2);
        int numberOfOccurrences = partWithoutSubString.length - 1;
        return numberOfOccurrences;
    }

    public static void viewResultOfTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, в которой нужно найти подстроку");
        String text1 = scanner.nextLine();
        System.out.println("Введите подстроку, которую будем искать");
        String text2 = scanner.nextLine();
        int numberOfOccurrences = countNumberOfOccurrences(text1,text2);
        System.out.println("Количество вхождений строки " + text2 + " в строку " + text1 + " равняется " + numberOfOccurrences);
    }
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
    public static void viewResultOfTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, буквы слов в которой нужно инвертировать");
        String text = scanner.nextLine();
        String newText = invertWordsInString(text);
        System.out.println(newText);
    }
}
