package com.pratic;

public class LogLevels {

    public static String message(String logLine) {
        String [] splitString = logLine.split(":");
        String message = splitString[1];
        return message.trim();
    }


    public static String logLevel(String logLine) {
        //1 split / 2 colchetes / 3 to lower case
        String [] splitLevel = logLine.split(":");
        String logLevel = splitLevel[0];
        String replaceLog = logLevel.replaceAll("\\[|\\]", "");
        return replaceLog.trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        String [] splitMessage = logLine.split(":");
        String message1 = splitMessage[0].toLowerCase();
        String message2 = splitMessage[1];
        String reformat = message2.concat(message1);
        String replace = reformat.replaceAll("\\[(.*?)\\]", " ($1)").replaceAll("\\s+", " ");
        return replace.trim();
    }
}

