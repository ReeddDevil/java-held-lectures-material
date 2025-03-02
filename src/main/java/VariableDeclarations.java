/**
 * Lernziel: Variablendeklarationen
 * - Einzelne Variablen deklarieren
 * - Mehrere Variablen kompakt deklarieren
 * - Automatische Initialisierung von lokalen Variablen?
 * - Variablendeklaration mit Wertinitialisierung
 * - Finale Variablen
 * - `char` und `String`
 *
 * @see OverloadedMethods
 */
public class VariableDeclarations {
    public static void main(String[] args) {
        // byte -> 1 Byte
        // short -> 2 Byte
        // int -> 4 Byte
        // long -> 8 Byte          geht großes L (kleines l geht, dennoch nicht empfohlen)
        // Merke: Ganzzahlige Datentypen haben VZ.
        //        Größe fix vorgegeben

        long age = +100000000000000L;
        // Merke:                  Noch größere Zahl als long, dann BigInteger verwenden
        System.out.println(age);

        short s = 12;
        byte b = -128;  // -128 .. +127

        // float -> 4 Byte
        // double -> 8 Byte
        double d = 12.333;
        float f = 23.23f;

        // char -> 2 Byte         nummerischer Datentyp
        char sb = 'C';            // ein Zeichen
        String name = "Chris";    // eine Zeichfolge

        // boolean -> 1 Bit
        boolean snowing = true, test;
        int z = 4;
        test = (z > 3) ? snowing : false;
        System.out.println(test);

        // Merke: lokale Variablen (in einer Methode) werden nicht automatisch initialisiert
        // Mehrere Variablen deklarieren und/sowie initialisieren
        int x, y = 12;            // Nur y hier initialisiert
        //    System.out.println(x);    // Variable x might not have been initialized
        System.out.println(y);
        x = 12;
        x = 11;
        x = 10;
        System.out.println(x);

        // final variable           is a Modifier
        final double PI = 3.1415;
//         PI = 2;                 Cannot assign a value to final variable 'PI'
    }
}
