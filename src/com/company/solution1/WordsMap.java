package com.company.solution1;
import java.util.*;

public class WordsMap {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

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

        String separatorsString = String.join("|\\", listOfSeparators);

        Map<String, Integer> countMap = new HashMap<String, Integer>();
        String line;
        Integer i =3;
        while(i-- >0){
            line = in.nextLine();
            String[] words = line.split(separatorsString);
            for(String word: words){
                if("".equals(word)){
                    continue;
                }

                Integer existing = countMap.get(word);
                if(existing == null){
                    countMap.put(word, 0);
                }
                countMap.replace(word, countMap.get(word)+1);
            }
        }

        in.close();
        TreeMap<String,Integer> sorted = new TreeMap<String,Integer>();

        sorted.putAll(countMap);
        for(Object iteration: sorted.keySet()){
            System.out.println(iteration + ": " + sorted.get(iteration));
        }
    }
}
