
package Task1;

public class CsvFormatter implements ReportFormatter {

    @Override
    public String format(String output) {
        return "Writing CSV: " + output;
    }
}
