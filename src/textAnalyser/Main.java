package textAnalyser;

public class Main {

    public static void main(String[] args) {

    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label result;

            if ((result = analyzer.processText(text)) != Label.OK) {
                return result;
            }
        }

        return Label.OK;
    }
}
