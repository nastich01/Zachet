package com.example.fiztestsapp;

public class Result {
    private String value;
    private String textValue;
    private int valueResource;

    public Result(String value, String textValue, int valueResource) {
        this.value = value;
        this.textValue = textValue;
        this.valueResource = valueResource;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public int getValueResource() {
        return valueResource;
    }

    public void setValueResource(int valueResource) {
        this.valueResource = valueResource;
    }
}
