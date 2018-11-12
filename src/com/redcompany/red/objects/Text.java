package com.redcompany.red.objects;

import com.redcompany.red.repository.Repo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Text {

    Repo repo;
    private Symbol symbol;
    private Word word;

    public Text() {
        this.repo = new Repo();
    }

    public void readFile(){
        String fileName = "text.txt";
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName), StandardCharsets.UTF_8))){
            int ch;
            while ((ch = reader.read()) != -1) {
                repo.addSymbolToList( new Symbol((char)ch));
            }
        } catch (IOException e) {
            // log error
        }
    }

    public void showAllText(){
       repo.showSymbolList(repo.getSymbolList());
    }

    public void parseText(){
        parseTextToWord();
    }



    private void parseTextToWord(){
      int i=0;
      String validationString = "аАбБвВгГдДеЕёЁжЖзЗиИйЙкКлЛмМнНоОпПрРсСтТуУфФхХцЦчЧшШщЩъЪыЫьЬэЭюЮяЯ0123456789";
      int arraySize = repo.getSymbolList().size();
       while (repo.getSymbolFromList(i)!= null ) {
           Word word = new Word();
           while (  validationString.indexOf(repo.getSymbolFromList(i).getSymbol())!= -1 ){
               word.constructWord(repo.getSymbolFromList(i));
               i++;
               if (i >= arraySize){
                   break;
               }
             }
                   repo.addWordToList(word);
                   i++;
           if (i >= arraySize){
               break;
           }
           }
           repo.showWordList(repo.getWordlList());
       }



    private void readText(){


    }





}
