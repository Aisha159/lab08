package Task1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> data = Arrays.asList(
                "Student Report",
                "Ali",
                "85 Marks"
        );

        // Generate PDF report
        ReportManager pdfManager = new ReportManager(
                new PdfFormatter(),
                new EmailNotifier()
        );

        pdfManager.generate(data, true);

        System.out.println("----------------");

        // Generate CSV report
        ReportManager csvManager = new ReportManager(
                new CsvFormatter(),
                new EmailNotifier()
        );

        csvManager.generate(data, false);
    }
}