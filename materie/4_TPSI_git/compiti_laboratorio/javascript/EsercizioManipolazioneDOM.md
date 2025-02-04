
**Esercizio: Manipolazione del DOM e disegno dell’albero**

Considera il seguente codice HTML:
```
<!DOCTYPE html>
<html lang="it">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Esercizio DOM</title>
</head>

<body>
  <div id="container">
    <h1>Benvenuti!</h1>
    <p class="intro">Questo è un paragrafo introduttivo.</p>
    <p class="info">Ulteriori informazioni sono disponibili qui sotto.</p>
  </div>
</body>
</html>
```
  

1. **Disegna l’albero del DOM** che rappresenta la struttura di questo documento HTML.
2. Ora, considera lo script JavaScript seguente, che viene eseguito dopo il caricamento della pagina:
```
// Seleziona l'elemento con id 'container'
let container = document.getElementById('container');
// Crea un nuovo elemento 'ul'
let ulElement = document.createElement('ul');
// Crea e aggiungi tre nuovi elementi 'li' all'interno del 'ul'
for (let i = 1; i <= 3; i++) {
  let liElement = document.createElement('li');
  liElement.textContent = "Elemento " + i;
  ulElement.appendChild(liElement);
}
// Aggiungi l'elemento 'ul' al 'container'
container.appendChild(ulElement);
```

2. **Disegna l’albero del DOM** dopo l’esecuzione del codice JavaScript sopra descritto.
3. Rispondi alle seguenti domande:
	- Cosa viene restituito dal seguente metodo dopo l’esecuzione del codice JavaScript document.getElementById('container');
	- Qual è il risultato di eseguire il metodo getElementsByTagName('li') dopo la manipolazione del DOM?
	- Se ci fossero ulteriori paragrafi con la classe info aggiunti al documento, cosa restituirebbe il metodo getElementsByClassName('info')?
	- Supponiamo di voler selezionare solo il primo paragrafo con la classe intro. Quale metodo e selettore utilizzeresti in JavaScript per farlo?
	- Che cosa restituisce il seguente codice dopo la manipolazione del DOM? document.querySelector('#container ul li');

  

  

  

