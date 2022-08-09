package exercises.fliter_comments;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
   private final String[] keywords = {":(", "=(", ":|"};

   @Override
    protected String[] getKeywords() {
       return keywords;
   }

   @Override
    protected Label getLabel() {
       return Label.NEGATIVE_TEXT;
   }
}
