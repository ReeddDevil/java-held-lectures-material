package de.tutego;
/**
 * - Refactoring: Geht darum den Quellcode zu verbessern, nicht darum sein Verhalten zu ändern
 *                z.B. Variablennamen sollen "sprechend" sein
 * - In SW-Entwicklung gibt funktionale Anforderungen: Was ein System tun soll
 *                          Nichtfkt. Anforderungen: Wie ein System funktionieren soll
 * - Variablennamen sollen sprechend sein: Nicht nur i, in for-Schleifen i ok.      age, sum, Umsatz...
 * - Umbenennen Variablenname:
 *                     shift + F6
 * - Code smell:       schlechtes Design, Wartbarkeitsprobleme oder potenzielle Bugs hindeuten,
 *                     aber nicht unbedingt sofort Fehler verursachen. Beheben durch Refactoring
 *
 *                     alt + enter      sehr nützlich
 *
 */

public class RefactorRename {
    public static void main(String[] args) {

        int height = 12;                  // Bezeichner hier RefactorRename, main, args
        System.out.println(height);       // i als Variablenname umbeannt zu height

        // Alt + enter
        int age;                          // join declaration and assignment
        age = 10;                         // wird int age = 10;    draus
        System.out.println(age);
    }
}
