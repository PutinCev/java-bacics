package org.itmo.lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//        //Лаб10. Задание 1
        String path = "files/text.txt";
        List<String> strings = readFileToList(path);
        for(String string: strings){
            System.out.println(string);
        }

//        //Лаб10. Задание 2
        String infoToAdd = strings.get(0);
        addInfoToFile(path,infoToAdd);

        //Лаб10. Задание 3
        String path1 = "files/file1.txt";
        String path2 = "files/file2.txt";
        String path12 = "files/file1Fil2.txt";
        unionTwoFiles(path1, path2, path12);

        //Лаб10. Задание 3
        String path4 = "files/file4";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ для замены");
        String simForChange = scanner.nextLine();
        raplaceInfo(path4, simForChange);
    }

    public static List<String> readFileToList(String path) {
        File file = new File(path);
        List<String> srings = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                srings.add(input);
            }
        } catch (IOException e) {

            System.err.println(e.getMessage());
        }
        return srings;
    }

    public static void addInfoToFile(String path, String infoToAdd) throws IOException {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(path), true));
            bufferedWriter.write(infoToAdd);
            //мне кажется что мы в лекции забыли закрыть райтер с помощью close()
            //а без него он не записывает
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }


    public static void unionTwoFiles(String path1, String path2, String path12) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path1)));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File(path2)));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(path12), false))) {
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                bufferedWriter.write(input + "\n");
            }
            while ((input = bufferedReader2.readLine()) != null) {
                bufferedWriter.write(input + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {

            System.err.println(e.getMessage());
        }
    }
    public static void raplaceInfo(String path4,String simForChange) {
        List<String> srings = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path4)))) {
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                //bufferedWriter.write(input.replace("[^a-zA-Zа-яА-Я0-9]", "$")+"\n");
                //оказывается $ надо экранировать. Минут 15 ковырялся, пришлось гуглить...
                srings.add(input.replaceAll("[^a-zA-Zа-яА-Я0-9]", ("\\"+simForChange)) + "\n");
            };
        } catch (IOException e) {

            System.err.println(e.getMessage());
        };

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(path4), false))) {
            for (String str : srings) {
                bufferedWriter.write(str);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
