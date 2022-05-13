package com.kodilla.patterns.singleton;

/*public class */ enum Logger {
INSTANCE;

    private String lastLog = "Example logs text";
// private String lastLog = "";

   // public Logger(String lastLog) {
  //      this.lastLog = lastLog;
   // }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}