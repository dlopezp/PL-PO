/* The following code was generated by JFlex 1.6.1 */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>jflex/spec.jflex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT_1 = 2;
  public static final int COMMENT_2 = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\3\0\1\17"+
    "\2\0\1\21\1\11\1\13\1\12\1\70\1\62\1\14\1\20\1\0"+
    "\1\6\11\5\1\61\1\22\1\66\1\65\1\67\2\0\1\55\1\16"+
    "\1\57\1\16\1\52\1\16\1\53\1\60\1\47\2\4\1\56\1\4"+
    "\1\50\3\4\1\54\1\4\1\51\6\4\1\63\1\0\1\64\1\0"+
    "\1\4\1\0\1\23\1\26\1\33\1\37\1\27\1\15\1\30\1\44"+
    "\1\31\2\4\1\40\1\43\1\32\1\35\1\42\1\4\1\24\1\34"+
    "\1\36\1\41\1\45\1\46\1\4\1\25\1\4\1\7\1\0\1\10"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff92\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\3\2\1\3\3\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\3\1\1\1\11\1\1\1\12\21\3"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\0\2\1\1\0\2\1\1\23\2\0\2\1\2\0"+
    "\1\4\1\1\2\3\2\1\1\0\1\24\1\0\2\1"+
    "\1\25\1\26\6\3\1\27\3\3\1\30\1\31\1\3"+
    "\1\32\2\3\1\33\7\3\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\2\42\1\40\3\0\1\43\1\3\1\41"+
    "\1\0\1\25\1\0\1\3\1\44\2\3\1\45\1\3"+
    "\1\46\4\3\1\47\1\3\1\50\1\51\4\3\2\0"+
    "\1\40\1\3\1\23\3\3\1\52\1\53\1\3\1\54"+
    "\1\55\4\3\1\56\2\3\1\57\1\3\1\60\1\61"+
    "\2\3\1\62\3\3\1\63\5\3\1\64\1\3\1\65"+
    "\1\3\1\66\2\3\1\67\1\70";

  private static int [] zzUnpackAction() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\71\0\344\0\u011d\0\u0156"+
    "\0\u018f\0\u01c8\0\162\0\u0201\0\u023a\0\162\0\u0273\0\u02ac"+
    "\0\u02e5\0\u031e\0\u0357\0\162\0\u0390\0\u03c9\0\u0402\0\u043b"+
    "\0\u0474\0\u04ad\0\u04e6\0\u051f\0\u0558\0\u0591\0\u05ca\0\u0603"+
    "\0\u063c\0\u0675\0\u06ae\0\u06e7\0\u0720\0\u0759\0\162\0\162"+
    "\0\162\0\162\0\u0792\0\u07cb\0\u0273\0\344\0\344\0\u0804"+
    "\0\u083d\0\u0876\0\u08af\0\u08e8\0\u0921\0\u095a\0\u0921\0\u0993"+
    "\0\u09cc\0\u0a05\0\344\0\u0a3e\0\u0a77\0\u0ab0\0\u0ae9\0\u0b22"+
    "\0\u0b5b\0\344\0\u0b94\0\u0b94\0\u0bcd\0\u0c06\0\u0b94\0\u0c3f"+
    "\0\u0c78\0\u0cb1\0\u0cea\0\u0d23\0\u0d5c\0\u011d\0\u0d95\0\u0dce"+
    "\0\u0e07\0\u011d\0\u011d\0\u0e40\0\u011d\0\u0e79\0\u0eb2\0\u011d"+
    "\0\u0eeb\0\u0f24\0\u0f5d\0\u0f96\0\u0fcf\0\u1008\0\u1041\0\344"+
    "\0\344\0\344\0\344\0\71\0\u08af\0\344\0\71\0\u095a"+
    "\0\u107a\0\u10b3\0\u10ec\0\u011d\0\u1125\0\u0b22\0\u115e\0\u1197"+
    "\0\u11d0\0\u1209\0\u011d\0\u1242\0\u127b\0\u011d\0\u12b4\0\u011d"+
    "\0\u12ed\0\u1326\0\u135f\0\u1398\0\u011d\0\u13d1\0\u011d\0\u011d"+
    "\0\u140a\0\u1443\0\u147c\0\u14b5\0\u14ee\0\u1527\0\u10b3\0\u1560"+
    "\0\344\0\u1599\0\u15d2\0\u160b\0\u011d\0\u011d\0\u1644\0\u011d"+
    "\0\u011d\0\u167d\0\u16b6\0\u16ef\0\u1728\0\u011d\0\u1761\0\u179a"+
    "\0\u011d\0\u17d3\0\u011d\0\u011d\0\u180c\0\u1845\0\u011d\0\u187e"+
    "\0\u18b7\0\u18f0\0\u011d\0\u1929\0\u1962\0\u199b\0\u19d4\0\u1a0d"+
    "\0\u011d\0\u1a46\0\u011d\0\u1a7f\0\u011d\0\u1ab8\0\u1af1\0\u011d"+
    "\0\u011d";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\7\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\7\1\27\1\30"+
    "\1\7\1\31\1\32\1\33\1\7\1\34\1\35\1\36"+
    "\2\7\1\37\1\40\1\7\1\41\1\42\1\43\4\7"+
    "\1\44\2\7\1\45\1\7\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\71\0\2\56\1\0\1\56"+
    "\1\57\1\60\1\57\6\56\2\57\2\56\1\61\1\56"+
    "\36\57\12\56\1\5\16\56\1\61\51\56\1\0\16\56"+
    "\1\61\51\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\36\7\12\56\1\0\1\56\1\57\1\62"+
    "\1\63\6\56\2\57\1\56\1\64\1\61\1\56\36\57"+
    "\12\56\1\0\1\56\1\57\1\60\1\57\6\56\2\57"+
    "\1\56\1\64\1\61\1\56\36\57\10\56\2\65\1\66"+
    "\1\65\1\67\1\70\1\67\1\65\1\56\4\65\2\67"+
    "\2\65\1\71\1\65\36\67\10\65\2\56\1\0\1\56"+
    "\1\57\1\60\1\57\3\56\1\72\2\56\2\57\2\56"+
    "\1\61\1\56\36\57\12\56\1\0\1\56\1\57\1\60"+
    "\1\57\4\56\1\73\1\56\2\57\2\56\1\61\1\56"+
    "\36\57\12\56\1\0\1\56\1\57\1\62\1\74\6\56"+
    "\2\57\2\56\1\61\1\56\36\57\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\12\7\1\75"+
    "\3\7\1\76\17\7\12\56\1\0\1\56\1\57\1\77"+
    "\1\100\5\56\1\101\2\100\2\56\1\61\1\56\1\100"+
    "\2\57\2\100\3\57\1\100\3\57\1\100\12\57\1\100"+
    "\2\57\1\100\1\57\1\100\1\57\7\56\1\101\2\56"+
    "\1\0\1\56\1\57\1\60\1\57\6\56\2\57\1\56"+
    "\1\102\1\61\1\56\36\57\10\56\2\103\1\0\1\103"+
    "\1\104\1\105\1\104\6\103\2\104\2\103\1\106\1\107"+
    "\36\104\10\103\2\56\1\0\1\56\3\7\6\56\2\7"+
    "\2\56\1\61\1\56\1\7\1\110\5\7\1\111\26\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\4\7\1\112\31\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\4\7\1\113\31\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\7\7\1\114\5\7\1\115\20\7\12\56\1\0"+
    "\1\56\3\7\6\56\1\116\1\7\2\56\1\61\1\56"+
    "\36\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\12\7\1\117\23\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\1\120\11\7"+
    "\1\121\23\7\12\56\1\0\1\56\3\7\6\56\1\122"+
    "\1\7\2\56\1\61\1\56\1\7\1\123\34\7\12\56"+
    "\1\0\1\56\3\7\6\56\2\7\2\56\1\61\1\56"+
    "\2\7\1\124\7\7\1\125\6\7\1\126\14\7\12\56"+
    "\1\0\1\56\3\7\6\56\2\7\2\56\1\61\1\56"+
    "\6\7\1\127\3\7\1\130\23\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\1\7\1\131"+
    "\34\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\12\7\1\132\23\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\1\133\35\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\21\7\1\134\14\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\25\7\1\135\10\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\27\7\1\136\6\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\35\7\1\137\12\56"+
    "\1\0\1\56\1\57\1\60\1\57\6\56\2\57\2\56"+
    "\1\61\1\56\36\57\4\56\1\140\5\56\1\0\1\56"+
    "\1\57\1\60\1\57\6\56\2\57\2\56\1\61\1\56"+
    "\36\57\4\56\1\141\1\56\1\142\3\56\1\0\1\56"+
    "\1\57\1\60\1\57\6\56\2\57\2\56\1\61\1\56"+
    "\36\57\4\56\1\143\5\56\1\0\2\56\1\60\13\56"+
    "\1\61\47\56\21\0\1\56\1\144\46\0\2\56\1\0"+
    "\2\56\1\62\1\145\11\56\1\64\1\61\51\56\1\0"+
    "\2\56\2\145\11\56\1\64\1\61\51\56\1\0\2\56"+
    "\2\64\12\56\1\61\47\56\2\65\1\66\5\65\1\146"+
    "\10\65\1\71\47\65\10\66\1\147\60\66\2\65\1\66"+
    "\2\65\1\70\2\65\1\146\10\65\1\71\47\65\10\66"+
    "\1\147\10\66\1\65\1\150\46\66\2\151\1\152\6\151"+
    "\3\56\5\151\1\153\47\151\2\56\1\0\15\56\1\64"+
    "\1\61\51\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\1\7\1\154\34\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\7\7\1\155"+
    "\26\7\12\56\1\0\2\56\1\77\1\156\6\56\2\156"+
    "\1\56\1\157\1\61\1\56\1\156\2\56\2\156\3\56"+
    "\1\156\3\56\1\156\12\56\1\156\2\56\1\156\1\56"+
    "\1\156\13\56\1\0\2\56\2\156\6\56\2\156\1\56"+
    "\1\157\1\61\1\56\1\156\2\56\2\156\3\56\1\156"+
    "\3\56\1\156\12\56\1\156\2\56\1\156\1\56\1\156"+
    "\13\56\1\0\2\56\2\156\6\56\2\156\2\56\1\61"+
    "\1\56\1\156\2\56\2\156\3\56\1\156\3\56\1\156"+
    "\12\56\1\156\2\56\1\156\1\56\1\156\11\56\2\103"+
    "\1\0\16\103\1\160\1\107\50\103\1\0\2\103\1\105"+
    "\13\103\1\160\1\107\46\103\2\56\1\0\16\56\1\161"+
    "\51\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\1\7\1\162\34\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\14\7\1\163\21\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\10\7\1\164\25\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\5\7\1\165\30\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\14\7\1\166\21\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\11\7\1\167\24\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\13\7\1\170\22\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\11\7\1\171\24\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\7\7\1\172\26\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\17\7\1\173\16\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\4\7\1\174\31\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\22\7\1\175\13\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\12\7\1\176\23\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\14\7\1\177\21\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\1\7\1\200\34\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\6\7\1\201\27\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\26\7\1\202\7\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\32\7\1\203\3\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\32\7\1\204\3\7\10\56\2\151\1\152\6\151"+
    "\1\56\1\205\1\56\5\151\1\153\47\151\11\152\1\0"+
    "\1\206\1\0\66\152\1\0\1\206\1\0\5\152\1\151"+
    "\1\207\46\152\2\56\1\0\1\56\3\7\6\56\2\7"+
    "\2\56\1\61\1\56\10\7\1\210\25\7\12\56\1\0"+
    "\2\56\2\211\6\56\2\211\2\56\1\61\1\56\1\211"+
    "\2\56\2\211\3\56\1\211\3\56\1\211\12\56\1\211"+
    "\2\56\1\211\1\56\1\211\11\56\21\0\1\103\47\0"+
    "\2\103\1\0\16\103\1\106\1\107\46\103\2\56\1\0"+
    "\1\56\3\7\6\56\2\7\2\56\1\61\1\56\1\212"+
    "\35\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\12\7\1\213\23\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\6\7\1\214"+
    "\27\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\4\7\1\215\31\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\4\7\1\216"+
    "\31\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\11\7\1\217\24\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\4\7\1\220"+
    "\31\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\7\7\1\221\26\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\5\7\1\222"+
    "\2\7\1\223\25\7\12\56\1\0\1\56\3\7\6\56"+
    "\2\7\2\56\1\61\1\56\15\7\1\224\20\7\12\56"+
    "\1\0\1\56\3\7\6\56\2\7\2\56\1\61\1\56"+
    "\27\7\1\225\6\7\12\56\1\0\1\56\3\7\6\56"+
    "\2\7\2\56\1\61\1\56\33\7\1\226\2\7\12\56"+
    "\1\0\1\56\3\7\6\56\2\7\2\56\1\61\1\56"+
    "\31\7\1\227\4\7\12\56\1\0\10\56\1\146\5\56"+
    "\1\61\47\56\13\0\1\147\55\0\2\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\13\7\1\230"+
    "\22\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\2\7\1\231\33\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\1\7\1\232"+
    "\34\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\7\7\1\233\26\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\13\7\1\234"+
    "\22\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\1\7\1\235\34\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\4\7\1\236"+
    "\31\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\4\7\1\237\31\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\30\7\1\240"+
    "\5\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\32\7\1\241\3\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\6\7\1\242"+
    "\27\7\12\56\1\0\1\56\3\7\6\56\2\7\2\56"+
    "\1\61\1\56\14\7\1\243\21\7\12\56\1\0\1\56"+
    "\3\7\6\56\2\7\2\56\1\61\1\56\1\244\35\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\14\7\1\245\21\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\27\7\1\246\6\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\34\7\1\247\1\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\12\7\1\250\23\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\20\7\1\251\15\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\16\7\1\252\17\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\31\7\1\253\4\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\26\7\1\254\7\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\7\7\1\255\26\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\1\7\1\256\34\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\27\7\1\257\6\7\12\56\1\0\1\56\3\7"+
    "\6\56\2\7\2\56\1\61\1\56\4\7\1\260\31\7"+
    "\12\56\1\0\1\56\3\7\6\56\2\7\2\56\1\61"+
    "\1\56\31\7\1\261\4\7\10\56";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6954];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\10\2\1\1\11\50\1\1\0\2\1\1\0"+
    "\3\1\2\0\2\1\2\0\6\1\1\0\1\1\1\0"+
    "\40\1\1\11\2\1\1\11\1\1\3\0\3\1\1\0"+
    "\1\1\1\0\23\1\2\0\53\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    private Symbol symbol(int type) {
        //print(String.valueOf(type) + " " + yytext());
        return new Symbol(type, yyline+1, yycolumn+1);
    }

    private Symbol symbol(int type, Object value) {
        //print(String.valueOf(type) + " " + yytext());
        return new Symbol(type, yyline+1, yycolumn+1, value);
    }

    private void error (LexicalError error) {
        System.err.println("LEXICAL ERROR");
        System.err.println("Line " + (yyline + 1) + ", Column " + (yycolumn + 1));
        System.err.println(error.comment());
        System.exit(0);
    }

    private String parseString (String s) {
        return s.replaceAll("''", "'");
    }

    private void print (String s) {
        System.out.println(s);
    }

    private void print () {
        System.out.println(yytext());
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 194) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { print(); error(LexicalError.INVALID_IDENTIFIER);
            }
          case 57: break;
          case 2: 
            { 
            }
          case 58: break;
          case 3: 
            { return symbol(sym.IDENTIFIER, yytext());
            }
          case 59: break;
          case 4: 
            { print();
        error(LexicalError.UNOPEN_COMMENT);
            }
          case 60: break;
          case 5: 
            { return symbol(sym.LEFT_PARENTHESIS);
            }
          case 61: break;
          case 6: 
            { return symbol(sym.MUL);
            }
          case 62: break;
          case 7: 
            { return symbol(sym.RIGHT_PARENTHESIS);
            }
          case 63: break;
          case 8: 
            { return symbol(sym.SUB);
            }
          case 64: break;
          case 9: 
            { return symbol(sym.DOT);
            }
          case 65: break;
          case 10: 
            { return symbol(sym.SEMI_COLONS);
            }
          case 66: break;
          case 11: 
            { return symbol(sym.COLONS);
            }
          case 67: break;
          case 12: 
            { return symbol(sym.COMMA);
            }
          case 68: break;
          case 13: 
            { return symbol(sym.LEFT_BRACKET);
            }
          case 69: break;
          case 14: 
            { return symbol(sym.RIGHT_BRACKET);
            }
          case 70: break;
          case 15: 
            { return symbol(sym.EQ);
            }
          case 71: break;
          case 16: 
            { return symbol(sym.LT);
            }
          case 72: break;
          case 17: 
            { return symbol(sym.GT);
            }
          case 73: break;
          case 18: 
            { return symbol(sym.ADD);
            }
          case 74: break;
          case 19: 
            { return symbol(sym.NUMERIC_REAL_CONST, yytext());
            }
          case 75: break;
          case 20: 
            { return symbol(sym.DOUBLE_DOT);
            }
          case 76: break;
          case 21: 
            { print("String: "+yytext()); return symbol(sym.STRING_CONST, parseString(yytext()));
            }
          case 77: break;
          case 22: 
            { error(LexicalError.UNCLOSED_STRING);
            }
          case 78: break;
          case 23: 
            { return symbol(sym.IF);
            }
          case 79: break;
          case 24: 
            { return symbol(sym.OF);
            }
          case 80: break;
          case 25: 
            { return symbol(sym.OR);
            }
          case 81: break;
          case 26: 
            { return symbol(sym.TO);
            }
          case 82: break;
          case 27: 
            { return symbol(sym.DO);
            }
          case 83: break;
          case 28: 
            { return symbol(sym.ASSIGN);
            }
          case 84: break;
          case 29: 
            { return symbol(sym.LEQ);
            }
          case 85: break;
          case 30: 
            { return symbol(sym.NEQ);
            }
          case 86: break;
          case 31: 
            { return symbol(sym.GEQ);
            }
          case 87: break;
          case 32: 
            { error(LexicalError.UNOPEN_STRING);
            }
          case 88: break;
          case 33: 
            { return symbol(sym.NUMERIC_INTEGER_CONST, yytext());
            }
          case 89: break;
          case 34: 
            { print("Comment: "+yytext());
            }
          case 90: break;
          case 35: 
            { return symbol(sym.FOR);
            }
          case 91: break;
          case 36: 
            { return symbol(sym.AND);
            }
          case 92: break;
          case 37: 
            { return symbol(sym.END);
            }
          case 93: break;
          case 38: 
            { return symbol(sym.NOT);
            }
          case 94: break;
          case 39: 
            { return symbol(sym.DIV);
            }
          case 95: break;
          case 40: 
            { return symbol(sym.MOD);
            }
          case 96: break;
          case 41: 
            { return symbol(sym.VAR);
            }
          case 97: break;
          case 42: 
            { return symbol(sym.ELSE);
            }
          case 98: break;
          case 43: 
            { return symbol(sym.CASE);
            }
          case 99: break;
          case 44: 
            { return symbol(sym.TYPE);
            }
          case 100: break;
          case 45: 
            { return symbol(sym.THEN);
            }
          case 101: break;
          case 46: 
            { return symbol(sym.REAL);
            }
          case 102: break;
          case 47: 
            { return symbol(sym.ARRAY);
            }
          case 103: break;
          case 48: 
            { return symbol(sym.BEGIN);
            }
          case 104: break;
          case 49: 
            { return symbol(sym.CONST);
            }
          case 105: break;
          case 50: 
            { return symbol(sym.WHILE);
            }
          case 106: break;
          case 51: 
            { return symbol(sym.RECORD);
            }
          case 107: break;
          case 52: 
            { return symbol(sym.PROGRAM);
            }
          case 108: break;
          case 53: 
            { return symbol(sym.INTEGER);
            }
          case 109: break;
          case 54: 
            { return symbol(sym.FUNCTION);
            }
          case 110: break;
          case 55: 
            { return symbol(sym.PROCEDURE);
            }
          case 111: break;
          case 56: 
            { return symbol(sym.CHARACTER);
            }
          case 112: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
