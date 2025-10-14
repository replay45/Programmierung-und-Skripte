# [Java](https://de.wikipedia.org/wiki/Java_(Programmiersprache)) - Programmiersprache

`Diese Anleitung wurde am 18.12.2024 verfasst.`


--------------------------------------------------------------------------------------------------------------


# Was ist [Java](https://de.wikipedia.org/wiki/Java_(Programmiersprache)) ?
- Java ist eine Programmiersprache, die erstmals im Januar 1996 veröffentlicht wurde.
- Die Besonderheit von Java ist, dass der Code nicht wie bei anderen Programmiersprachen in Maschinencode umgewandelt wird, sondern in sogenannten [Bytecode](https://de.wikipedia.org/wiki/Bytecode).
- Das hat den Vorteil, dass der Bytecode in der `Java Virtual Machine` (JVM) ausgeführt wird.
    - Das verhindert, dass das Betriebssystem bei Fehlern abstürzt, da nur die virtuelle Maschine abstürzt.
    - Außerdem kann der Code auf allen gängigen Betriebssystemen ausgeführt werden.
- In Java ist die Programmierung `objektorientiert`, was leider den Nachteil mitbringt, dass der Einstieg für Anfänger in Java nicht so leicht ist wie in anderen Programmiersprachen. 


# [Entwicklungsumgebung](https://de.wikipedia.org/wiki/Entwicklungsumgebung)
- Zum Programmieren ist ganz grundsätzlich ein einfacher Text-Editor (z.B. im Terminal) ausreichend, jedoch empfiehlt es sich, eine geeignete Entwicklungsumgebung zu verwenden, die den Programmierer unterstützt und nützliche Optionen bietet, die beim Programmieren helfen.
- Dabei können die meisten gängigen Entwicklungsumgebungen verwendet werden, z.B. [VS-Code](https://code.visualstudio.com/) oder [IntelliJ IDEA](https://www.jetbrains.com/idea/).
- Für Anfänger in Java eigent sich auch die [Open Source](https://de.wikipedia.org/wiki/Open_Source)-Entwicklungsumgebung [Eclipse](https://www.eclipse.org/).
- Für die [Installation von Eclipse unter Linux](https://github.com/replay45/Linux-RaspberryPI-NextCloud/tree/main/linux/linux-Software-%26-Pakete) gibt es im Linux Repository auch eine Anleitung.


# Aufbau
- `class`
    - Man verwendet Klassen, um Objekte zu definieren und zu ordnen. Dabei sammelt man den Code, der zu den Objekten gehört, in der entsprechen Klasse.
    - Beispiel: Klasse "Tier" und Klasse "Pflanzen", hier werden alle Funktionalitäten in der jeweiligen Klasse gespeichert.
    - Also `fressen()` zur Klasse Tier und `wirdGefressenVon()` in die Klasse Pflanzen.
    - Jede Klasse speichert die eigenen Funktionalitäten.


- `visibility-Modifier`
    - Mit dem visibility-Modifier regelt man, ob andere Klassen, den Inhalt der Klasse sehen können.
    - Das bedeutet, dass bei `public` andere Klassen, auf die Funktionalitäten der Klasse zugreifen können.
    - Um das zu verhindern, kann `private` eingesetzt werden. Dabei kann nur die Klasse selbst auf die Funktionalitäten zugreifen.


- `Static`
    - Static bedeutet, dass eine Methode oder Variable statisch ist.
    - Wenn eine Methode oder Variable also statisch sind, gehören sie zur Klasse und zu Objekten. 


- `void`
    - void wird als Rückgabetyp verwendet, sodass eine Methode keinen Wert zurückgibt.
    - Die Methode tut also nur das, was sie ausführen soll, ohne einen Wert auszugeben.


# Kommentare - Text der nicht ausgeführt wird
- Mit Kommentaren kann man in Code Text einfügen, der beim Ausführen des Programms ignoriert wird.
- Das ist nützlich, um seinen Code simpel zu dokumentieren, was besonders bei größeren Programmen sehr hilfreich ist.

- `//` - Einzeilige Kommentare
    - Jeglicher Text in `einer Zeile` der nach `//` folgt, wird ignoriert.

- `/* ... */` - Mehrzeilige Kommentare
    - Mit `*/` signalisiert man, ab hier soll der Text ignoriert werden und mit `/*` schließt man den Kommentar
    - Somit kann man auch Kommentare über mehrere Zeilen verfassen.


--------------------------------------------------------------------------------------------------------------
