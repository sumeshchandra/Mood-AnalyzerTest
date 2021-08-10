package com.bridgeLabz;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }

}
