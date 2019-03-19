package textAnalyser;

public class TooLongTextAnalyser implements TextAnalyzer {

    private int maxLength;

    TooLongTextAnalyser(int maxLength) {

        this.maxLength = maxLength;

    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength)
            return Label.TOO_LONG;
        else
            return Label.OK;
    }
}

