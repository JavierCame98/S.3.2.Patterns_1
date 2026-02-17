package Strategy;

import org.example.Strategy.ReportService;
import org.example.Strategy.ReportStrategies;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StrategyTest {
    private ReportService reportService;
    private List<String> testData;

    @BeforeEach
    void setUp() {
        reportService = new ReportService();
        testData = List.of("Dato1", "Dato2", "Dato3");
    }

    @Test
    void testPdfStrategy() {
        reportService.setStrategy(ReportStrategies.pdf());
        String result = reportService.generateReport(testData);

        assertEquals("Generating PDF reportDato1, Dato2, Dato3", result);
    }

    @Test
    void testCsvStrategy() {
        reportService.setStrategy(ReportStrategies.csv());
        String result = reportService.generateReport(testData);

        assertEquals("Dato1;Dato2;Dato3", result);
    }

    @Test
    void testJsonStrategy() {
        reportService.setStrategy(ReportStrategies.json());
        String result = reportService.generateReport(testData);

        assertTrue(result.contains("{reportData:"));
        assertTrue(result.contains("Dato1, Dato2, Dato3"));
    }

    @Test
    void testSwitchStrategy() {
        reportService.setStrategy(ReportStrategies.html());
        assertTrue(reportService.generateReport(testData).startsWith("<html>"));

        reportService.setStrategy(ReportStrategies.xml());
        assertTrue(reportService.generateReport(testData).startsWith("<report>"));
    }

    @Test
    void testExcelStrategy() {
        reportService.setStrategy(ReportStrategies.excel());
        String result = reportService.generateReport(testData);

        assertEquals("Excel format: Dato1\tDato2\tDato3", result);
    }

    @Test
    void testNoStrategySelected() {
        assertThrows(NullPointerException.class, () -> {
            reportService.generateReport(testData);
        });
    }
}
