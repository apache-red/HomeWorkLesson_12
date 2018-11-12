package com.redcompany.red.repository;

import com.redcompany.red.objects.Symbol;
import com.redcompany.red.objects.Word;

import java.util.ArrayList;
import java.util.List;

public class Repo {


    ArrayList<Symbol> symbolList = new ArrayList<Symbol>();
    ArrayList<Word> wordlList = new ArrayList<Word>();



    public ArrayList<Symbol> addSymbolToList(Symbol symbol){
        symbolList.add(symbol);
        return symbolList;
    }

    public Symbol getSymbolFromList(int index){
        Symbol symbol  = symbolList.get(index);
        return symbol;
    }
    public void  showSymbolList(ArrayList<Symbol> symbolList){
        for (Symbol symbol:symbolList) {
            System.out.print(symbol.getSymbol());
        }
    }
    public ArrayList<Word> addWordToList(Word word){
        wordlList.add(word);
        return wordlList;
    }
    public void  showWordList(ArrayList<Word> wordlList){
        for (Word word:wordlList) {
            System.out.print(word.getWord()+" ");
        }
    }


    public ArrayList<Symbol> getSymbolList() {
        return symbolList;
    }

    public void setSymbolList(ArrayList<Symbol> symbolList) {
        this.symbolList = symbolList;
    }
    public ArrayList<Word> getWordlList() {
        return wordlList;
    }

    public void setWordlList(ArrayList<Word> wordlList) {
        this.wordlList = wordlList;
    }
}
