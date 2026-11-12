
package Task1;

public class PdfFormatter implements ReportFormatter {

    @Override
    public String format(String output) {
        return "Writing PDF: " + output;
    }
}
