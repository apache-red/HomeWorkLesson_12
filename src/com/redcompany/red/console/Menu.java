package com.redcompany.red.console;

import com.redcompany.red.objects.Text;




public class Menu {

    private Text text;

    public void start(){
    text.readFile();
    //text.showAllText();
    text.parseText();
    }

    public Menu() {
        this.text = new Text();
    }
}
