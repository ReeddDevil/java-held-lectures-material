import org.w3c.dom.Text;

public class Shortcuts_TippsandTricksIntellij {                              // Stand 22.4.2024

    //    Konstruktor
    public Shortcuts_TippsandTricksIntellij() {
    }

    public static void main(String[] args) {

        Shortcuts_TippsandTricksIntellij s = new Shortcuts_TippsandTricksIntellij();

        // printf einsetzen
        System.out.printf("%07d\n", 97262);       // füllt mit 0er auf. Will 7 Stellen insgesamt. 0097262
        System.out.printf("%.3f%n", 97262.5467);  // %d Ganzzahl, %s String, %.3f Kommazahl mit 3 Kommastellen, %c char, %n Zeilenumbruch. Gibt noch weiter...
        Integer i = 2, sum = 0;
        System.out.println();

        /**
         * JavaDoc "über" Klassen/Methoden schreiben.
         * In Java kannst du mit JavaDoc Dokumentationskommentare für Klassen/Methoden/Attribute usw. schreiben.
         * Diese Kommentare werden dann mit dem Javadoc-Tool in eine HTML-Dokumentation umgewandelt.
         * z. B. was Klasse oder Methode macht
         *
         * Grundprinzip:
         * JavaDoc-Kommentare beginnen mit /** und enden mit
         //       * Innerhalb des Kommentars kannst du spezielle Tags wie @param, @return oder @throws verwenden.
         */

        /**, enter      wird dann automatisch gesetzt

        // ctrl + shift + enter ausprobieren, um { } zu setzen
        for (; i < 5; i++) {
            sum += 1;
        }
        // oder Semikolon am Ende setzen
        System.out.println(sum);

        // Zum Vergleich muss I Integer sein, kein primitiver Datentyp
        if (i == null) {
        }

        /*
        Most important shortcuts:
         shift + shift                           => Search everywhere to quickly find any file, action, symbol, tool window, or setting, in your project, and in the current Git repository
         ctrl + shift + a                        => Find action: Find a command and execute it, open a tool window, or search for a setting
         alt + enter                             => Show Context Actions: Quick-fixes for highlighted errors and warnings, intention actions for improving and optimizing your code
         F2/shift + F2                           => Navigate to error, warring or suggestion. Jump to the next or previous highlighted error
                                                    Merke: In Kombination mit "alt + enter" verwenden, um zu fixen
         ctrl + e                                => View recent files: Select a recently opened file from the list
         ctrl + shift + enter                    => Complete Current Statement. Insert any necessary trailing symbols and place the caret where you can start typing the next statement.
                                                    Merke: Dort mit Pfeiltasten bewegen, Eintippen Buchstaben um schnell files zu finden die angezeigt werden
                                                    Merke: Z. B. bei for-loop erstellen, erstellt { } ... oder bei if()
                                                    Merke: Kann auch ; setzen am Ende von z. B. System.out.println()
         ctrl + alt + l                          => Reformat Code: Reformat the whole file or the selected fragment according to the current code style settings
         ctrl + shift + alt + t                  => Invoke refactoring: Refactor the element under the caret, e.g., safe delete, copy, move, rename, and so on.
         ctrl + w/ctrl + shift + w               => Extend or shrink selection: Increase or decrease the scope of selection
         ctrl + alt + /                          => Add/remove line or block comment
         ctrl + alt + shift + /                  => Comment out a line or block code
                                                   Merke: //TODO An example for ...
         ctrl + b                                => Go To Declaration: Navigate to the initial declaration of the instantiated class, called method, or field
         ctrl + alt + b                          => Go to an implementation instead:
                                                    Merke: Von Schnittstelle (Interface) oder abstrakten Klasse direkt zur konkreten Implementierung springen
                                                           Ebenso bei Methoden in einem Interface oder einer abstrakten Klasse, springe zu Implementierung
         alt + F7                                => Find Usages: Show all places where a code element is used across your project
         ctrl + f (dann F3/shift F3)             => Suchen in file. F3 next occurence / shift + F3 previous occurence
         ctrl + shift + f                        => Sucht im ganzen Projekt
         alt + 1                                 => Focus the Project tool window
                                                    Merke: Dort mit Pfeiltasten bewegen, Eintippen Buchstaben um schnell files zu finden die angezeigt werden
         esc or (shift + esc)                    => Focus to the editor. Can close any pop-up without changes
         ctrl + ctrl                             => Search for run configurations

         Von mir:
         ctrl + shift + r                        => Code/Text finden/ersetzen => Text markieren, ctrl+shift+r, auf Scope, current file wählen
         ctrl + alt + s                          => Settings öffnen, auf Keymaps ...
         ctrl + space                            => invoke basic code completion on a part of a field, parameter, or variable declaration.
         ctrl + h                                => Hierarchieansicht, sehe z. B. welche Exception von welcher stammt
         ctrl + shift + m                        => zw. {...} im Code hin-/herspringen

        Merke: beim Coden
         Links steht abstrakter Typ (höher in der Hierarchie), rechts der spezifischere (niedriger in der Hierarchie)
         Bsp. List ist Interface                    List<String> ls = new ArrayList<>();
           kein add("D"), remove("A"), null            List<String> ls = List.of("A", "B", "C");
           set(1,"X") ja, kein add("D"), remove("B")   List<String> ls = List.of("A", "B", "C");

         Beste Lösung: alles möglich              List<String> list = new ArrayList<>(List.of("A", "B", "C"));
         add(), remove(), set()                   Erzeugt neue eigenständige ArrayList

        Themes einstellen
         File, Settings, Apperances             => Darcula, Intellij Light...

        Welche Version/Konto bei JetBrains
         Help, About                            => Sehe welche IDE-Version ich habe
         Help, Register                         => so auf mein Konto bei JetBrains zugreifen

        auf RG Code, Generate:
         alt + Einfg                            => Konstruktor, Getter-/Setter-, JUnit-Tests ... erzeugen
         ctrl + alt + t                         => Code markieren, dann ctrl + alt + t     um z. B. try {...} catch {...} zu legen

       Bookmarks setzen:
        ctrl + F11                            => Bookmark an diese Zeile setzen
        shift + F11                           => Bookmarks auswählen
        ctrl + Nr. 1 -9                       => zu Bookmark springen
        F11                                   => Alternativ: rechte Maustaste, um Bookmark zum löschen

        Code schreiben (wichtige shortcuts):
         alt + shift + maus                     => Cursor in mehrere Zeilen setzen
         alt + shift + ctrl + j                 => setze so Cursor in allen Wörtern, die genauso heißen, an die gleiche Stelle
         alt  + j                               => setze so Cursor in allen Wörtern (aktuelle + nachfolgende Zeilen und mehr), die genauso ... mehrmals drücken
         alt + shift + j                        => Auswahl eins wieder rückgängig machen
         alt + shift + u                        => Alle Buchstaben groß/klein

        Code einfalten:
        auf v neben Zeile klicken               => Bei Methoden oder der main() z. B.

        outline:
        alt + 7 oder ctrl + F12                 => Sehe alle Variablen, Methoden, Konstruktoren etc. einer Klasse
        shift + ESC                             => Outline schließen
        ctrl + h                                => zeigt Typhierarchie an, standardmößig die Oberklassen und Unterklassen
                                                => sehe Klassen-Hierarchie nützl. z. B. für Exception, checked oder unchecked...

         main (eingeben) oder psvm, enter       => public static void main(String[] args)
         sout (eingeben), enter                 => System.out.println(...) wird erzeugt
         shift + F6                             => Variablennamen, Methoden... umbenennen

         alt + ctrl + l                         => Code-Zeilen (Leerzeichen) wieder einrücken. Markiere ich Text, werden nur diese eingerückt.
         alt + shift + Pfeiltasten              => Code-Zeilen vertauschen
         ctrl, enter                            => neue Zeile drunter einfügen, ohne Cursor bewegt sich. Nur enter, Cursor springt 1 Zeile runter
         ctrl + d, ctrl + y                     => Zeile kopieren, Zeile löschen
         ctrl + q oder ctrl + p                 => Quickinfo oder Parameterinfo z. B. bei Methoden welche Parameter.
         ctrl + shift + n                       => Schnell eine Klasse, file... finden
         ctrl + shift + einfügen                => Schnell eine Klasse/Package erzeugen

       compile and run, quick fixes:
         alt + 6                                => Ausprobieren, wenn Fehler im Code auftauchen
         ctrl + shift + F10                     => Datei ausführen
         shift + F10                            => Alternativ

       Debugger in Intellij:
        ctrl + F8 oder Zeile-Nr. klicken         => Breakpoint für Debugging setzen
        F8                                       => eine Zeile weiter gehen in Schleife im Debugger
        F9                                       => Breakpoint bei for(int i = 0; i < ..; i++);  setzen. F9 Springe zu nächsten Breakpoint, kann so einen Schleifendurchlauf komplett durchgehen, wenn ich keinen anderen Breakpoint habe.
        shift + F9                               => Debugger starten

       Bedingung im Breakpoint setzen           => (z. B. eins unter for-Schleifenanfang setzen) rechte Maustaste auf Breakpoint i==4, done. roter Punkt mit ?. Im Debugger wird die Schleife jetzt bis i == 4 ausgeführt.
       Endlosschleife abbrechen:                => roter Button klicken

       if, do, while, for Schleifen:
       for(eingeben) ctrl + shift + enter       => Werden schnell die Klammern gesetzt...

      Interface, Vererbung:
        ctrl + o                                => overrides Methods von Oberklassen, Interfaces...
        ctrl + i                                => implementiert Methoden

      Navigieren im editor/zu files:
         alt + Pfeil rechts/links               => schnell zw. geöffneten Tabs switchen
         ctrl + alt + arrow left/right          => go back/forward to the previous caret position
         ctrl + g                               => schnell zu einer Zeile springen
         ctrl + m                               => zu aktueller Postion des Cursor
         ctrl + Pfeil hoch/runter...            => Cursor bleibt an der Stelle, kann so den Code durchgehen
         ctrl + shift + backspace (Rücktaste)   => to navigate to the last edited (editor) location

      Navigieren/Schließen tabs:
        ctrl + F4                               => ein tab schließen
        alt + anklicken tab                     => schließe alle tabs bis auf dieses

       Navigieren zw. Fenstern:
        alt + F1, Project View                  => Sehe so, wo geöffnete file im PJ-Explorer liegt
        alt + 4, esc or (shift + esc)           => in Console, zurück zu editor
        alt + 6, esc or (shift + esc)           => Problems (!) anzeigen
        Anmerkung: shift + esc                  => Minimiert das Fenster/Console1
       Window,store current layout as default   => gegenwärtige Fensteranordnung als Standard speichern
       Doppelklick auf Reiter Fenster           => maximiert und minimiert das Fenster

       Settings aufrufen:
       alt + ctrl + s oder RG File, Settings    => Grundlegende Einstellungen vornehmen:

        EDITOR, GENERAL, "wheel" in Suchfeld or Mouse Control => z. B. ctrl + Mouse zum zoomen
        Merke:                                              => mit Mausrade hoch/runter scrollen im Code

        Build, Execution, Deployment auf compiler or "parallel" im Suchfeld => Um Programme schneller auszuführen
          Build pj automatically                    => anhaken
          compile independent modules in parallel   => anhaken
                                                => Editor, Live Templates ansehen z. B. sout => erzeugt System.out.println(...);
                                                => Editor, General, Mouse-Control, Haken setzen => Schriftgröße über Mausrad verändern
                                                => Editor, Codestyle, Java, Indent => Einrücktiefe festlegen

        Plugins installieren                    => Key Promoter X: Hilft Tastatur shortcuts zu lernen
                                                => Rainbow Brackets: Zeigt wohin welche Klammer gehört farbig
                                                => KIs: CoPilot, Tapnine, Continue, ChatGPT4 ...

     split the window:
        mark the class/package... in project-window, shift + enter    => Open in right split. Kann so zwei Klassen gleichzeitig anzeigen.
                                                                      => Alternativ: Right click on the desired editor-tab, on split right/split down

       Intellij IDEA plugins installieren:
        File, Settings, Plugins, Search, install => z. B. Key Promoter X, zeigt einem Shortcuts für Dinge, die man per Maus gemacht hat

       Emojis einbauen:
        win + .                                 => 👌😊

        */
    }
}


