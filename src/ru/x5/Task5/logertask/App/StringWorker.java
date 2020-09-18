package ru.x5.Task5.logertask.App;

public class StringWorker {

    public String[] splitString(String s) {
        s = s.replaceAll("\\s+", "");
        return s.split(getAction(s));
    }

    public String getAction(String s) {
        if (s.indexOf('-') > 0) {
            return "-";
        }
        if (s.indexOf('+') > 0) {
            return "\\+";
        }
        if (s.indexOf('*') > 0) {
            return "\\*";
        }
        if (s.indexOf('/') > 0) {
            return "/";
        }
        return null;
    }
}
