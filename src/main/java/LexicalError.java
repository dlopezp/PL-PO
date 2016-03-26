import symbols.Location;
import symbols.PLSymbolFactory;

public enum LexicalError {
    UNCLOSED_COMMENT {
        @Override
        public String comment() {
            return "Non closed Comment";
        }
    },
    UNOPEN_COMMENT {
        @Override
        public String comment() {
            return "Unexpected end Comment delimiter";
        }
    },
    UNCLOSED_STRING {
        @Override
        public String comment() {
            return "Non closed String";
        }
    },
    UNOPEN_STRING {
        @Override
        public String comment() {
            return "Unexpected end String delimiter";
        }
    },
    INVALID_IDENTIFIER {
        @Override
        public String comment() {
            return "Invalid identifier";
        }

        @Override
        public Location location(int line, int column) {
            return PLSymbolFactory.location(line, column);
        }
    },
    ILEGAL_CHARACTER {
        @Override
        public String comment() { return "Illegalcharacter"; }
    };

    public abstract String comment();

    public Location location(int line, int column) {
        return PLSymbolFactory.location(line, column);
    }
}
