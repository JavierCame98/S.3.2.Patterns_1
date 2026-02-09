package org.example.Strategy;

import java.util.List;

public class ReportService {

    private ReportStrategy strategy;

    public void setStrategy(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public String generateReport(List<String> data){
        return strategy.generate(data);
    }
}
