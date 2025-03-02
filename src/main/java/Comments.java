/**
 * Lernziel: Kommentartypen
 * - Zeilenkommentar   //   einzeilige, kann man schachteln
 * - Blockkommentar    /*   sind mehrzeilige Kommentare
 * - Javadoc
 *
 * @see Literals           // Schreibe normal was die Klasse als Gesamtheit bzw. als Typ macht
 */
public class Comments {
//    Zeilenkommentar // geschachtelt

  /**                 JavaDoc Bsp. In JavaDoc schreibt man: Was Methode tut, Was Klasse macht, oder wofür Variable (eher seltener) da ist.
   *                  JavaDoc immer "über" Methode oder Klasse setzen
   * This is the starting point of my Java program
   * Kann hier html einbauen z. B. <ul></ul>
   * @param args     Program argument  ist ein JavaDoc tag
   */
  public static void main( String[] args ) {

  }

/*   Erledigt Oli 27.02.25
     Blockkommentar nicht schachtelbar
     Unötig Kommentare zu setzen bei Quellcode der offensichtlich ist

     Auf die Klasse/Methode gehen, die mit JavaDoc gekennzeichnet wurde, dann sieht man die JavaDoc-Kommentare dort
 */
  // Seit Java 23
  /// -Item 1
  /// -Item 2

}
