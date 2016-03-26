package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class PLSymbolFactory {

    public static InitialPLSymbol initial(PrgPLSymbol prg, int errors) {
        return InitialPLSymbol.create(prg, errors);
    }

    public static PrgPLSymbol prg(
            TerminalSymbol program,
            TerminalSymbol identifier,
            TerminalSymbol semiColons,
            BlqPLSymbol blq,
            TerminalSymbol dot
    ) {
        return PrgPLSymbol.create(program, identifier, semiColons, blq, dot);
    }

    public static BlqPLSymbol blq(
            DclListPLSymbol dcllist,
            TerminalSymbol begin,
            SentListPLSymbol sentlist,
            TerminalSymbol end) {
        return BlqPLSymbol.create(dcllist, begin, sentlist, end);
    }

    public static DclListPLSymbol dcllist() {
        return DclListPLSymbol.create();
    }

    public static SentListPLSymbol sentlist(SentPLSymbol sent) {
        return SentListPLSymbol.create(sent);
    }

    public static DclPLSymbol dcl(DefFunPLSymbol deffun) {
        return DclPLSymbol.create(deffun);
    }

    public static DclPLSymbol dcl(DefTypePLSymbol deftype) {
        return DclPLSymbol.create(deftype);
    }

    public static DclPLSymbol dcl(DefProcPLSymbol defproc) {
        return DclPLSymbol.create(defproc);
    }

    public static DclPLSymbol dcl(DefCtePLSymbol defcte) {
        return DclPLSymbol.create(defcte);
    }

    public static DclPLSymbol dcl(DefVarPLSymbol defvar) {
        return DclPLSymbol.create(defvar);
    }

    public static DefCtePLSymbol defcte(
            TerminalSymbol const_,
            CteListPLSymbol ctelist
    ) {
        return DefCtePLSymbol.create(const_, ctelist);
    }

    public static CteListPLSymbol ctelist(
            CtePLSymbol cte
    ) {
        return CteListPLSymbol.create(cte);
    }

    public static CtePLSymbol cte(
            TerminalSymbol identifier,
            TerminalSymbol eq,
            SimpValuePLSymbol simpvalue,
            TerminalSymbol semiColons
    ) {
        return CtePLSymbol.create(identifier, eq, simpvalue, semiColons);
    }

    public static SimpValuePLSymbol simpvalue(TerminalSymbol value) {
        return SimpValuePLSymbol.create(value);
    }

    public static DefVarPLSymbol defvar(
            TerminalSymbol var,
            DefVarListPLSymbol defvarlist,
            TerminalSymbol semiColons
    ) {
        return DefVarPLSymbol.create(var, defvarlist, semiColons);
    }

    public static DefVarListPLSymbol defvarlist(
            DefVarItemPLSymbol defvaritem
    ) {
        return DefVarListPLSymbol.create(defvaritem);
    }

    public static DefVarItemPLSymbol defvaritem(
            VarListPLSymbol varlist,
            TerminalSymbol colons,
            AllTypesPLSymbol alltypes
    ) {
        return DefVarItemPLSymbol.create(varlist, colons, alltypes);
    }

    public static VarListPLSymbol varlist(TerminalSymbol identifier) {
        return VarListPLSymbol.create(identifier);
    }

    public static DefProcPLSymbol defproc(
            TerminalSymbol procedure,
            TerminalSymbol identifier,
            FormalParamListPLSymbol formal_paramlist,
            TerminalSymbol semiColonsA,
            BlqPLSymbol blq,
            TerminalSymbol semiColonsB
    ) {
        return DefProcPLSymbol.create(procedure, identifier, formal_paramlist, semiColonsA, blq, semiColonsB);
    }

    public static DefFunPLSymbol deffun(
            TerminalSymbol function,
            TerminalSymbol identifier,
            FormalParamListPLSymbol formal_paramlist,
            TerminalSymbol colons,
            AllTypesPLSymbol alltypes,
            TerminalSymbol semiColonsA,
            BlqPLSymbol blq,
            TerminalSymbol semiColonsB
    ) {
        return DefFunPLSymbol.create(
                function,
                identifier,
                formal_paramlist,
                colons,
                alltypes,
                semiColonsA,
                blq,
                semiColonsB
        );
    }

    public static FormalParamListPLSymbol formal_paramlist(
            TerminalSymbol leftParenthesis,
            FormalParamPLSymbol formal_param,
            TerminalSymbol rightParenthesis
    ) {
        return FormalParamListPLSymbol.create(leftParenthesis, formal_param, rightParenthesis);
    }

    public static FormalParamPLSymbol formal_param(
            FormalParamItemPLSymbol formal_param_item
    ) {
        return FormalParamPLSymbol.create(formal_param_item);
    }

    public static FormalParamItemPLSymbol formal_param_item(
            VarListPLSymbol varlist,
            TerminalSymbol colons,
            AllTypesPLSymbol alltypes
    ) {
        return FormalParamItemPLSymbol.create(varlist, colons, alltypes);
    }

    public static TbasPLSymbol tbas(TerminalSymbol value) {
        return TbasPLSymbol.create(value);
    }

    public static SentPLSymbol sent(AsigPLSymbol asig, TerminalSymbol semiColons) {
        return SentPLSymbol.create(asig, semiColons);
    }

    public static SentPLSymbol sent(ProgCallPLSymbol progCall, TerminalSymbol semiColons) {
        return SentPLSymbol.create(progCall, semiColons);
    }

    public static SentPLSymbol sent(ExeBlqPLSymbol exeblq) {
        return SentPLSymbol.create(exeblq);
    }

    public static SentPLSymbol sent(CondPLSymbol cond) {
        return SentPLSymbol.create(cond);
    }

    public static SentPLSymbol sent(WLoopPLSymbol wloop) {
        return SentPLSymbol.create(wloop);
    }

    public static SentPLSymbol sent(FLoopPLSymbol floop) {
        return SentPLSymbol.create(floop);
    }

    public static SentPLSymbol sent(CasePLSymbol case_) {
        return SentPLSymbol.create(case_);
    }

    public static AsigPLSymbol asig(IdPLSymbol id, TerminalSymbol assign, ExpPLSymbol exp) {
        return AsigPLSymbol.create(id, assign, exp);
    }

    public static IdPLSymbol id(TerminalSymbol identifier) {
        return IdPLSymbol.create(identifier);
    }

    public static IdPLSymbol id(
            TerminalSymbol identifier,
            TerminalSymbol leftBracket,
            ExpPLSymbol exp,
            TerminalSymbol rightBracket) {
        return IdPLSymbol.create(identifier, leftBracket, exp, rightBracket);
    }

    public static IdPLSymbol id(TerminalSymbol identifierA, TerminalSymbol dot, TerminalSymbol identifierB) {
        return IdPLSymbol.create(identifierA, dot, identifierB);
    }

    public static ExpPLSymbol exp(ExpPLSymbol expA, OpPLSymbol op, ExpPLSymbol expB) {
        return ExpPLSymbol.create(expA, op, expB);
    }

    public static ExpPLSymbol exp(FactorPLSymbol factor) {
        return ExpPLSymbol.create(factor);
    }

    public static OpPLSymbol op(OpCompPLSymbol opcomp) {
        return OpPLSymbol.create(opcomp);
    }

    public static OpPLSymbol op(OpLogPLSymbol oplog) {
        return OpPLSymbol.create(oplog);
    }

    public static OpPLSymbol op(OpAritPLSymbol oparit) {
        return OpPLSymbol.create(oparit);
    }

    public static OpCompPLSymbol opcomp(TerminalSymbol compOp) {
        return OpCompPLSymbol.create(compOp);
    }

    public static OpAritPLSymbol oparit(TerminalSymbol aritOp) {
        return OpAritPLSymbol.create(aritOp);
    }

    public static OpLogPLSymbol oplog(TerminalSymbol logOp) {
        return OpLogPLSymbol.create(logOp);
    }

    public static FactorPLSymbol factor(SimpValuePLSymbol simpvalue) {
        return FactorPLSymbol.create(simpvalue);
    }

    public static FactorPLSymbol factor(
            TerminalSymbol not,
            FactorPLSymbol factor
    ) {
        return FactorPLSymbol.create(not, factor);
    }

    public static FactorPLSymbol factor(
            TerminalSymbol leftParenthesis,
            ExpPLSymbol exp,
            TerminalSymbol rightParenthesis
    ) {
        return FactorPLSymbol.create(leftParenthesis, exp, rightParenthesis);
    }

    public static FactorPLSymbol factor(
            TerminalSymbol identifier,
            SubParamListPLSymbol subparamlist
    ) {
        return FactorPLSymbol.create(identifier, subparamlist);
    }

    public static FactorPLSymbol factor(
            TerminalSymbol identifier,
            TerminalSymbol leftBracket,
            ExpPLSymbol exp,
            TerminalSymbol rightBracket
    ) {
        return FactorPLSymbol.create(identifier, leftBracket, exp, rightBracket);
    }

    public static FactorPLSymbol factor(
            TerminalSymbol identifierA,
            TerminalSymbol dot,
            TerminalSymbol identifierB
    ) {
        return FactorPLSymbol.create(identifierA, dot, identifierB);
    }

    public static SubParamListPLSymbol subparamlist(
            TerminalSymbol leftParenthesis,
            ExpListPLSymbol explist,
            TerminalSymbol rightParenthesis
    ) {
        return SubParamListPLSymbol.create(leftParenthesis, explist, rightParenthesis);
    }

    public static ExpListPLSymbol explist(ExpPLSymbol exp) {
        return ExpListPLSymbol.create(exp);
    }

    public static ProgCallPLSymbol prog_call(
            TerminalSymbol identifier,
            SubParamListPLSymbol subparamlist
    ) {
        return ProgCallPLSymbol.create(identifier, subparamlist);
    }

    public static ExeBlqPLSymbol exeblq(
            DclListBlqPLSymbol dcllist_blq,
            TerminalSymbol begin,
            SentListPLSymbol sentlist,
            TerminalSymbol end
    ) {
        return ExeBlqPLSymbol.create(dcllist_blq, begin, sentlist, end);
    }

    public static DclListBlqPLSymbol dcllist_blq() {
        return DclListBlqPLSymbol.create();
    }

    public static DclBlqPLSymbol dcl_blq(DefCtePLSymbol defcte) {
        return DclBlqPLSymbol.create(defcte);
    }

    public static DclBlqPLSymbol dcl_blq(DefTypePLSymbol deftype) {
        return DclBlqPLSymbol.create(deftype);
    }

    public static DclBlqPLSymbol dcl_blq(DefVarPLSymbol defvar) {
        return DclBlqPLSymbol.create(defvar);
    }

    public static DefTypePLSymbol deftype(
            TerminalSymbol type,
            TypeListPLSymbol typelist
    ) {
        return DefTypePLSymbol.create(type, typelist);
    }

    public static TypeListPLSymbol typelist(
            TypePLSymbol type
    ) {
        return TypeListPLSymbol.create(type);
    }

    public static TypePLSymbol type(
            TerminalSymbol identifier,
            TerminalSymbol eq,
            UdTypePLSymbol udtype,
            TerminalSymbol semiColons
    ) {
        return TypePLSymbol.create(identifier, eq, udtype, semiColons);
    }

    public static UdTypePLSymbol udtype(
            TerminalSymbol array_,
            TerminalSymbol leftBracket,
            SimpValuePLSymbol simpvalueA,
            TerminalSymbol doubleDot,
            SimpValuePLSymbol simpvalueB,
            TerminalSymbol rightBracket,
            TerminalSymbol of,
            AllTypesPLSymbol alltypes
    ) {
        return UdTypePLSymbol.create(array_, leftBracket, simpvalueA, doubleDot, simpvalueB, rightBracket, of, alltypes);
    }

    public static UdTypePLSymbol udtype(
            TerminalSymbol record,
            DefVarListPLSymbol defvarlist,
            TerminalSymbol end
    ) {
        return UdTypePLSymbol.create(record, defvarlist, end);
    }

    public static AllTypesPLSymbol alltypes(TbasPLSymbol tbas) {
        return AllTypesPLSymbol.build(tbas);
    }

    public static AllTypesPLSymbol alltypes(TerminalSymbol identifier) {
        return AllTypesPLSymbol.build(identifier);
    }

    public static CondPLSymbol cond(
            TerminalSymbol if_,
            ExpPLSymbol exp,
            TerminalSymbol then,
            SentPLSymbol sent,
            ElseCondPLSymbol elsecond
    ) {
        return CondPLSymbol.create(if_, exp, then, sent, elsecond);
    }

    public static ElseCondPLSymbol elsecond(
            TerminalSymbol else_,
            SentPLSymbol sent
    ) {
        return ElseCondPLSymbol.create(else_, sent);
    }

    public static WLoopPLSymbol wloop(
            TerminalSymbol while_,
            ExpPLSymbol exp,
            TerminalSymbol do_,
            SentPLSymbol sent
    ) {
        return WLoopPLSymbol.create(while_, exp, do_, sent);
    }

    public static FLoopPLSymbol floop(
            TerminalSymbol for_,
            TerminalSymbol identifier,
            TerminalSymbol assign,
            ExpPLSymbol expA,
            TerminalSymbol to,
            ExpPLSymbol expB,
            TerminalSymbol do_,
            SentPLSymbol sent
    ) {
        return FLoopPLSymbol.create(for_, identifier, assign, expA, to, expB, do_, sent);
    }

    public static CasePLSymbol caseBlq(
            TerminalSymbol case_,
            ExpPLSymbol exp,
            TerminalSymbol of,
            CaseListPLSymbol caselist,
            TerminalSymbol end
    ) {
        return CasePLSymbol.create(case_, exp, of, caselist, end);
    }

    public static CaseListPLSymbol caselist(
            CaseSimplePLSymbol casesimple
    ) {
        return CaseListPLSymbol.create(casesimple);
    }

    public static CaseSimplePLSymbol casesimple(
            ExpPLSymbol exp,
            TerminalSymbol colons,
            SentPLSymbol sent
    ) {
        return CaseSimplePLSymbol.create(exp, colons, sent);
    }

    public static Location location(int line, int column) {
        return new Location(line, column);
    }

    public static TerminalSymbol terminal(String value, int line, int column) {
        return new TerminalSymbol(value, location(line, column));
    }

    public static TerminalSymbol terminal(String value, Location location) {
        return new TerminalSymbol(value, location);
    }

    public static TerminalSymbol fakeSemiColons(PLSymbol precedence) {
        return terminal(";", precedence.endLocation());
    }

}
