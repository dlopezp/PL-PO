all:
    MySymbol.class MyScanner.class MyParser.class MyMain.class

MyParser.java MySymbol.java:
    MyParser.cup
    java java_cup.Main -parser MyParser -symbols MySymbol < MyParser.cup

MyScanner.java:
    MyScanner.lex
    jflex MyScanner.lex

clean:
    rm -f *.class MyScanner.java MySymbol.java MyParser.java *~
