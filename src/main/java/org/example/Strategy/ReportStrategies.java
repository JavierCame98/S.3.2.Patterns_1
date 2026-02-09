package org.example.Strategy;

public class ReportStrategies {

    public static ReportStrategy pdf(){
        return data -> "Generating PDF report" + String.join(", ", data);
    }

    public static ReportStrategy csv() {
        return data -> String.join(";", data);
    }

    public static ReportStrategy json() {
        return data -> "{reportData: " + data.toString() + " }";
    }

    public static ReportStrategy html() {
        return data -> "<html><body>" + data.toString() + "</body></html>";
    }

    public static ReportStrategy xml() {
        return data -> "<report><data>" + data.toString() + "</data></report>";
    }

    public static ReportStrategy excel() {
        return data -> "Excel format: " + String.join("\t", data);
    }

    public static ReportStrategy word()  {
        return data -> "Word format: \n" + String.join("\n", data);
    }




}