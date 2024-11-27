# Esercizio: Gestione dei Rifiuti Elettronici

  

Una città ha deciso di migliorare la gestione dei rifiuti elettronici, come cellulari, computer e altri dispositivi elettronici dismessi, installando delle EcoBox intelligenti in vari punti della città. Queste EcoBox sono collegate a un server centrale e devono comunicare con esso per tenere aggiornato lo stato delle raccolte e ricevere istruzioni su eventuali interventi necessari, come lo svuotamento quando sono piene o la risoluzione di guasti.

SI è scelto di non utilizzare HTTP per questa comunicazione, preferendo sviluppare un proprio protocollo basato su TCP. 

Le EcoBox, una volta connesse, inviano periodicamente aggiornamenti al server, informandolo sul livello di riempimento, specificando la percentuale di spazio ancora disponibile. Inoltre, se una EcoBox rileva problemi, come un blocco nello sportello o un malfunzionamento del sensore, comunica immediatamente questi errori al server. Il server, a sua volta, può rispondere inviando comandi alle EcoBox, come il ripristino dei dati dopo uno svuotamento o la notifica che un intervento di manutenzione è stato programmato. Inoltre, può essere cambiata la modalità operativa dell'EcoBox per ottimizzare il consumo energetico o per altri scopi tecnici.