package com.redcompany.red.objects;

public class Word {


    private String word = "";


    public void constructWord(Symbol symbol) {
        word =word.concat(word.valueOf(symbol.getSymbol()));
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


}
