/*package com.company.solution2;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> listOfSeparators = new ArrayList<String>();
        listOfSeparators.add(" ");
        listOfSeparators.add(",");
        listOfSeparators.add(".");
        listOfSeparators.add("!");
        listOfSeparators.add("?");
        listOfSeparators.add("(");
        listOfSeparators.add(")");
        listOfSeparators.add("[");
        listOfSeparators.add("]");
        listOfSeparators.add("-");
        listOfSeparators.add(";");
        listOfSeparators.add(":");
        listOfSeparators.add("\n");
        listOfSeparators.add("\r");
        listOfSeparators.add("\t");
        //System.out.println(getPage());

//        String pagetext = getPage().text();
        String separatorsString = String.join("|\\", listOfSeparators);
        Map<String, Word> countMap = new HashMap<String, Word>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(pagetext.getBytes(StandardCharsets.UTF_8))));
        String line;
        while ((line = reader.readLine()) != null) {
            //получили строку, распарсили ее по словам
            String[] words = line.split(separatorsString);
            //идем по слову поочередно в массиве слов, который получили только что
            for (String word : words) {
                if ("".equals(word)) { //пропускаем пустоту
                    continue;
                }

                Word wordObj = countMap.get(word); //проверяем наличие внутри словаря нашего слова
                if (wordObj == null) { // если его нет, то добавляем
                    wordObj = new Word();
                    wordObj.word = word;
                    wordObj.count = 0;
                    countMap.put(word, wordObj);
                }
                wordObj.count++; //увеличиваем счетчик слов для этого слова
            }
        }

        reader.close();

        SortedSet<Word> sortedWords = new TreeSet<Word>(countMap.values());

        for (Word word : sortedWords) {
            System.out.println(word.count + "\t" + word.word);
        }
    }
    public static class Word implements Comparable<Word> {
        //Заводим отдельный класс вместо того, чтобы просто юзать map
        //потому что так мы сможем просто сортировать и добавлять
        String word;
        int count;

        @Override
        public int hashCode() { return word.hashCode(); }

        @Override
        public boolean equals(Object obj) { return word.equals(((Word)obj).word); }

        @Override
        public int compareTo(Word b) { return b.count - count; }
    }
}
*/