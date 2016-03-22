/**
 * Created by dlopez on 12/3/16.
 */
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
    };

    public abstract String comment();
}
