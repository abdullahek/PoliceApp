package com.example.policeapp;




public class notification_class {
    private String Text;

    public notification_class(String text) {
        this.Text = text;

    }
    public String getText() {

        return Text;
    }

    public void setText(String name) {

        this.Text = name;
    }
}
