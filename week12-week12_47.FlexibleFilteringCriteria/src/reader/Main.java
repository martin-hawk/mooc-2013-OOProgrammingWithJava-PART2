package reader;

import reader.criteria.AllLines;
import reader.criteria.AtLeastOne;
import reader.criteria.Both;
import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.EndsWithQuestionOrExclamationMark;
import reader.criteria.LengthAtLeast;
import reader.criteria.Not;

public class Main {

    public static void main(String[] args) {
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt"; // Old address "http://www.gutenberg.myebook.bg/2/5/5/2554/2554-8.txt";
        GutenbergReader book = new GutenbergReader(address);

//        Criterion criterion = new ContainsWord("beer");
//        Criterion criterion = new AllLines();
//        Criterion criterion = new EndsWithQuestionOrExclamationMark();
//        Criterion criterion = new LengthAtLeast(40);
//        Criterion criterion = new Both(
//                new EndsWithQuestionOrExclamationMark(),
//                new ContainsWord("beer")
//        );
//        Criterion criterion = new Not(new LengthAtLeast(10));
//        Criterion criterion = new AtLeastOne(
//                new ContainsWord("beer"),
//                new ContainsWord("milk"),
//                new ContainsWord("oil")
//        );
        Criterion words = new AtLeastOne(
                new ContainsWord("beer"),
                new ContainsWord("milk"),
                new ContainsWord("oil")
        );

        Criterion rightLength = new Both(
                new LengthAtLeast(20),
                new Not(new LengthAtLeast(31))
        );

        Criterion criterion = new Both(words, rightLength);

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
    }
}
