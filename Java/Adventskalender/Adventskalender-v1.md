# Projekt Adventskalender - in [Java](https://www.java.com/)

`Projekt erstellt im Dezember 2024`

----------------------------------------------------------------------------------------------------

# Den Adventskalender ausführen
- Damit der Adventskalender ausgeführt werden kann, muss [Java](https://www.java.com/) auf dem System installiert sein.
- Es folgen Anleitungen zu Linux & Windows.
- Danach kann `über das entsprechende Skript` für Linux oder Windows die bereits kompilierte `Adventskalender.jar`-Datei im Terminal ausgeführt werden.
- Das Skript kann man optional auch in den Autostart hinzufügen, sodass das Programm einem beim Systemstart begrüßt.

----------------------------------------------------------------------------------------------------

# [Java](https://www.java.com/) unter Linux installieren
```
$ sudo apt update
$ sudo apt install default-jdk
$ java -version
```

# [Java](https://www.java.com/) unter Windows installieren
- [Java herunterladen: JDK 23](https://www.oracle.com/java/technologies/downloads/?er=221886#jdk23-windows) 
- den x64 Installer auswählen
- `exe-Datei` ausführen

----------------------------------------------------------------------------------------------------

# Programm ausführen (Linux)

### Möglichkeit 1 (über das Skript)
- Skript ausführbar machen:
```
$ chmod +x Adventskalender-Linux.sh
```

- Skript ausführen:
```
$ ./Adventskalender-Linux.sh
```

### Möglichkeit 2
- jar-Datei direkt ausführen
```
$ java -jar Adventskalender.jar
```
    
# Programm ausführen (Windows)
- Batch-Skript ausführen
- Dafür Doppelklick auf `Adventskalender-Windows.bat`

----------------------------------------------------------------------------------------------------
