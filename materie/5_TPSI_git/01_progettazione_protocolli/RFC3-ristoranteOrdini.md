# Esercizio: Progettazione di un Protocollo per un Ristorante

  

Contesto  
Un ristorante desidera implementare un sistema per la gestione degli ordini tramite un servizio di rete. L’obiettivo è consentire ai camerieri di inviare ordini in modo semplice ed efficace al sistema centrale del ristorante, evitando l’uso del protocollo HTTP. Questa scelta permette al ristorante di sviluppare un protocollo privato, che garantisce una comunicazione più diretta, controllata e ottimizzata per le esigenze interne.

Operazioni del Protocollo:

1. Invio dell’Ordine: I camerieri possono inviare un ordine che include una lista di piatti e bevande scelti dai clienti.
    
2. Richiesta dello Stato dell’Ordine: I camerieri possono interrogare il sistema per ottenere informazioni sullo stato di un ordine specifico (ad esempio, se è in preparazione o già servito).
    
3. Cancellazione dell’Ordine: I camerieri hanno la possibilità di annullare un ordine già inviato in caso di modifiche dell’ultimo minuto.
    

Obiettivo dell’Esercizio  
Progettate un protocollo applicativo che soddisfi le operazioni sopra indicate. Si progetti il protocollo applicativo secondo lo schema RFC fornito dai docenti (vedere template con elenco aspetti da considerare)