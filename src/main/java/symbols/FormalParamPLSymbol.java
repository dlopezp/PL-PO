package symbols;

import java.util.ArrayList;
import java.util.List;

public class FormalParamPLSymbol extends PLSymbol {

    private List<FormalParamItemPLSymbol> params;
    private List<TerminalSymbol> semiColons;

    public FormalParamPLSymbol(FormalParamItemPLSymbol formalParamItem) {
        super(formalParamItem);
        params = new ArrayList<FormalParamItemPLSymbol>();
        semiColons = new ArrayList<TerminalSymbol>();
        addParam(formalParamItem);
    }

    private void addParam(FormalParamItemPLSymbol formalParamItem) {
        params.add(formalParamItem);
    }

    public void addParam(FormalParamItemPLSymbol formal_param_item, TerminalSymbol semiColons) {
        addParam(formal_param_item);
        this.semiColons.add(semiColons);
    }

    public static FormalParamPLSymbol create(
            FormalParamItemPLSymbol formal_param_item
    ) {
        return new FormalParamPLSymbol(formal_param_item);
    }

}
