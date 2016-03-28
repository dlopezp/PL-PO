package symbols;

import java.util.ArrayList;
import java.util.List;

public class SentListPLSymbol extends PLSymbol {

    private List<SentPLSymbol> sents;

    public SentListPLSymbol(SentPLSymbol sent) {
        super(sent);
        sents = new ArrayList<SentPLSymbol>();
        addSent(sent);
    }

    public SentListPLSymbol() {
        super(null);
        sents = new ArrayList<SentPLSymbol>();
    }

    public void addSent(SentPLSymbol sent) {
        sents.add(sent);
    }

    public static SentListPLSymbol create() {
        return new SentListPLSymbol();
    }

    public static SentListPLSymbol create(SentPLSymbol sent) {
        return new SentListPLSymbol(sent);
    }
}
