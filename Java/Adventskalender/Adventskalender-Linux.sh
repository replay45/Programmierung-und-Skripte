#!/bin/bash

# Lokale Deaktivierung von _JAVA_OPTIONS
unset _JAVA_OPTIONS

# Name der JAR-Datei
JAR_FILE="Adventskalender.jar"

if ! command -v java &> /dev/null; then
    echo "Java ist nicht installiert. Bitte installieren Sie Java."
    exit 1
fi

if [ -f "$JAR_FILE" ]; then
    echo "Starte Adventskalender..."
    java -jar "$JAR_FILE"
else
    echo "Fehler: $JAR_FILE nicht gefunden!"
    exit 1
fi
