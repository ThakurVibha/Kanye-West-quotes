package com.example.quotegenerator;

public class Model {

    private String Quote;

    public Model(String quote) {
        Quote = quote;
    }

    public String getQuote() {
        return Quote;
    }

    public void setQuote(String quote) {
        Quote = quote;
    }
}
