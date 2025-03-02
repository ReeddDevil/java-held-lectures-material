/**
 * Lernziel: Literale                       ein fester konstanter Wert, der im Code vorkommen kann
 * - Literaltypen kennenlernen
 * - Hexadezimalzahlen (Base 16) schreiben 0x2A       2*16^1 + 1*16^0
 * - Binäre (Base 2) Schreibweise          0b11001
 * - Oktal (Base 8) Schreibweise           052        5*8^1 + 2*8^0
 * - Unterstriche in Zahlen
 *
 * @see Types
 */
public class Literals {
  /*
   *  - die Wahrheitswerte `true` und `false`
   *  - integrale Literale für Zahlen, etwa `122`
   *  - Fließkommaliterale, etwa `12.567` oder `9.999E-2`
   *  - Zeichenliterale, etwa `'X'` oder `'\n'`
   *  - String-Literale für Zeichenketten, wie `"Mandalore"`
   *  - `null` steht für einen besonderen Referenztyp
   */
  public static void main( String[] args ) {
    System.out.println(0.1+0.1+0.1);
//    System.out.println(8_723_568_923);   // Integer number too large
    System.out.println(8_723_568_923L);    // Long
    System.out.println(5.5E-10);           // wissenschaftliche Schreibweise 5,5 * 10^(-10)
    System.out.println('\n');
    System.out.println(123);
    System.out.println("'\"");             // escape Character \ Bsp. \\, \", ...
    System.out.println('\'');
    System.out.println(2.55655467678f);
    System.out.println(2.55655467678);     // double ist genauer als float
    System.out.println(0x0); // 0
    System.out.println(0x9); // 9
    System.out.println(0xa); // 10
    System.out.println(0xf); // 15
    System.out.println(0x1000_0000);                   // 16^7
    System.out.println(0b101_01001010_10011001);
    System.out.println(0b0101);
    System.out.println(236_547_823);
    // Multi-Line String Literal Bsp.
    String s = """        
            
            Java rocks!
            Coding is fun!""";
    System.out.println(s);
  }
}
