import symbols.Localizable;
import symbols.Location;
import symbols.PLSymbolFactory;

/**
 * Created by dlopez on 24/3/16.
 */
public enum SyntaxError {

    MISSING_SEMI_COLONS {
        @Override
        public String comment() {
            return "Missing semi colons";
        }
    },
    MISSING_FINAL_DOT {
        @Override
        public String comment() {
            return "Missing final dot";
        }
    },
    UNEXPECTED_TOKEN {
        @Override
        public String comment() {
            return "Unexpected token";
        }
    },
    FORMAL_PARAM_LIST {
        @Override
        public String comment() {
            return "Param list bad defined";
        }
    },
    SENTENCE {
        @Override
        public String comment() {
            return "Sentence bad defined";
        }
    },
    PROCEDURE_HEADER {
        @Override
        public String comment() {
            return "Procedure header bad defined";
        }
    },
    FUNCTION {
        @Override
        public String comment() {
            return "Function bad defined";
        }
    },
    VARLIST {
        @Override
        public String comment() {
            return "Var list bad defined";
        }
    },
    SENTLIST {
        @Override
        public String comment() {
            return "Sentence list bad defined";
        }
    },
    CTELIST {
        @Override
        public String comment() {
            return "Constants list bad defined";
        }
    },
    BLQ {
        @Override
        public String comment() {
            return "Main block bad defined";
        }
    },
    DCL {
        @Override
        public String comment() {
            return "Declaration bad defined";
        }
    },
    DCL_BLQ {
        @Override
        public String comment() {
            return "Declaration block bad defined";
        }
    },
    DEFTYPE {
        @Override
        public String comment() {
            return "Definition block bad defined";
        }
    },
    ARRAY {
        @Override
        public String comment() {
            return "Array bad declared";
        }
    },
    RECORD {
        @Override
        public String comment() {
            return "Record bad declared";
        }
    },
    EXEBLQ {
        @Override
        public String comment() {
            return "ExeBlq bad defined";
        }
    },
    EXP {
        @Override
        public String comment() {
            return "Expression bad defined";
        }
    },
    OP {
        @Override
        public String comment() {
            return "Operation bad defined";
        }
    },
    BAD_ARRAY_RANGE {
        @Override
        public String comment() {
            return "Bad array range";
        }
    },
    GLOBAL {
        @Override
        public String comment() {
            return "Global error";
        }
    };

    public abstract String comment();

    public Location location(Localizable s)  {
        return s.endLocation();
    }

    public Location location(int line, int column)  {
        return PLSymbolFactory.location(line, column);
    }
}
