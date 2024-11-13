# HTML Grundstruktur und wichtige Elemente


## Inhaltsverzeichnis
1. HTML Grundgerüst
2. Textelemente und Überschriften
3. Listen
4. Tabellen
5. Links
6. Bilder
7. Formulare
8. Audio und Video
9. Sonstige Elemente
10. Textformatierung
11. Escape-Zeichen (Sonderzeichen)


-----------------------------------------------------------------------------------------------

## 1. HTML Grundgerüst

```
html
<!doctype html>
<html>
  <head>
    <title>Seiten-Titel</title>
  </head>
  <body>
    <!-- Inhalt hier -->
  </body>
</html>
```

- **doctype**: Definiert das Dokument als HTML5.
- **html**: Grundstruktur der Webseite.
- **head**: Kopfbereich der Webseite (Metadaten, Titel, CSS-Links etc.).
- **body**: Der sichtbare Inhalt der Webseite.

-----------------------------------------------------------------------------------------------

# 2. Textelemente und Überschriften

## Überschriften

HTML bietet verschiedene Überschriftsebenen:

```
html
<h1> Überschrift 1 </h1>
<h2> Überschrift 2 </h2>
<h3> Überschrift 3 </h3>
```

- **h1**: Größte Überschrift.
- **h2, h3**: Unterüberschriften für bessere Strukturierung.

## Absätze und Zeilenabstand

- **Absatz**: Verwende `<p>` für Absätze.
- **Zeilenumbruch**: Verwende `<br>` für einen Zeilenumbruch.

```
html
<p>Dies ist ein Absatz.</p>
<br>
```

-----------------------------------------------------------------------------------------------

# 3. Listen

## Ungeordnete Liste (unordered list)

```
html
<ul>
  <li>Erster Punkt</li>
  <li>Zweiter Punkt</li>
</ul>
```

- **ul**: Erzeugt eine Liste mit Punkten.
- **li**: Listenelement.

## Geordnete Liste (ordered list)

```
html
<ol>
  <li>Erstes Element</li>
  <li>Zweites Element</li>
</ol>
```

- **ol**: Erzeugt eine nummerierte Liste.

-----------------------------------------------------------------------------------------------

# 4. Tabellen

Tabellen werden mit dem `<table>`-Tag erstellt.

## Grundstruktur einer Tabelle

```
html
<table>
  <tr>
    <th>Überschrift 1</th>
    <th>Überschrift 2</th>
  </tr>
  <tr>
    <td>Inhalt Zelle 1</td>
    <td>Inhalt Zelle 2</td>
  </tr>
</table>
```

- **tr**: Tabellenzeile.
- **th**: Tabellenüberschrift.
- **td**: Tabellenzelle.

-----------------------------------------------------------------------------------------------

# 5. Links

## Externe Links

```
html
<p> Besuchen Sie unsere <a href="https://example.com">Website</a>. </p>
```

- **a href**: Erstellt einen Link zu einer externen Webseite.

## Interne Links

```
html
<ul>
  <li><a href="#section1">Abschnitt 1</a></li>
  <li><a href="#section2">Abschnitt 2</a></li>
</ul>

<p><a name="section1">Inhalt von Abschnitt 1</a></p>
<p><a name="section2">Inhalt von Abschnitt 2</a></p>
```

- **a name**: Verlinkt zu einem Anker auf derselben Seite.

-----------------------------------------------------------------------------------------------

# 6. Bilder

Bilder können wie folgt eingefügt werden:

```
html
<img src="bild.jpg" alt="Beschreibung" width="200" height="200">
```

- **src**: Pfad zum Bild.
- **alt**: Alternativtext, wenn das Bild nicht geladen wird.
- **width, height**: Bestimmen die Bildgröße in Pixeln.

-----------------------------------------------------------------------------------------------

# 7. Formulare

## Textfeld (Einzeilig)

```
html
<form action="" method="">
  <label for="firstname">Vorname:</label>
  <input type="text" id="firstname" name="firstname" size="100">
</form>
```

- **input type="text"**: Einzeiliges Texteingabefeld.
- **label**: Bezeichnung für das Eingabefeld.

## Textfeld (Mehrzeilig)

```
html
<form action="" method="">
  <textarea rows="5" cols="30"></textarea>
</form>
```

- **textarea**: Mehrzeiliges Texteingabefeld.

## Radio-Button (Einzelauswahl)

```
html
<form action="" method="">
  Ja: <input type="radio" name="auswahl" value="ja">
  Nein: <input type="radio" name="auswahl" value="nein">
</form>
```

- **radio**: Einzelauswahl (eine Option aus mehreren).

## Checkbox (Mehrfachauswahl)

```
html
<form action="" method="">
  <input type="checkbox" name="sport" value="fussball"> Fußball<br>
  <input type="checkbox" name="sport" value="basketball"> Basketball<br>
</form>
```

- **checkbox**: Mehrfachauswahl.

-----------------------------------------------------------------------------------------------

# 8. Audio und Video

## Audio

```html
<audio controls>
  <source src="audio.mp3" type="audio/mp3">
</audio>
```

- **controls**: Zeigt die Audiosteuerung an.
- **autoplay**: Startet die Wiedergabe automatisch.

## Video

```html
<video controls width="640" height="360">
  <source src="video.mp4" type="video/mp4">
</video>
```

- **video**: Video einbetten.
- **controls**: Zeigt die Steuerung an.

-----------------------------------------------------------------------------------------------

# 9. Sonstige Elemente

## Iframe (Externe Inhalte einbetten)

```html
<iframe src="seite.html" width="600" height="400"></iframe>
```

- **iframe**: Ermöglicht das Einbetten einer anderen Webseite.

## Meta-Elemente

Meta-Tags geben wichtige Informationen über die Webseite, wie z.B. Keywords oder die Sprache:

```html
<meta name="description" content="Dies ist eine Webseite über Fische.">
<meta name="keywords" content="Fische, Ozean, Aquarium">
<meta http-equiv="author" content="Milli">
<meta http-equiv="content-language" content="deu-deu">
```

- **meta**: Nicht sichtbare Informationen über die Webseite.

-----------------------------------------------------------------------------------------------

# 10. Textformatierung

## Fettschrift

```html
<b>Dies ist fettgedruckter Text.</b>
<strong>Dies ist semantisch bedeutender fettgedruckter Text.</strong>
```

- **b**: Visuell fettgedruckt.
- **strong**: Fett + semantisch bedeutend (für Suchmaschinen relevant).

## Kursivschrift

```html
<i>Dies ist kursiver Text.</i>
<em>Dies ist semantisch bedeutender kursiver Text.</em>
```

- **i**: Visuell kursiv.
- **em**: Kursiv + semantisch bedeutend.

-----------------------------------------------------------------------------------------------

# 11. Escape-Zeichen (Sonderzeichen)

| Zeichen    | HTML-Code |
|------------|------------|
| Leerzeichen| `&nbsp;`   |
| ™          | `&#8482;`  |
| &          | `&amp;`    |
| ©          | `&copy;`   |
| <          | `&lt;`     |
| >          | `&gt;`     |
| ?          | `&#63;`    |

-----------------------------------------------------------------------------------------------
