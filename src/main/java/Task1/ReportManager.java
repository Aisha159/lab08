package Task1;

import java.util.List;
import java.util.Objects;

public class ReportManager {

    private final ReportFormatter formatter;
    private final Notifier notifier;

    public ReportManager(ReportFormatter formatter, Notifier notifier) {
        this.formatter = Objects.requireNonNull(formatter);
        this.notifier = Objects.requireNonNull(notifier);
    }

    public void generate(List<String> data, boolean sendEmail) {

        String output = String.join(",", data);

        String formattedOutput = formatter.format(output);

        System.out.println(formattedOutput);

        if (sendEmail) {
            notifier.send("admin@company.com", formattedOutput);
        }
    }
}