Progetta un protocollo per il monitoraggio di più **serre**, ciascuna dotata di sensori per rilevare dati ambientali come temperatura, umidità, luminosità e umidità del suolo. Ogni serra ha il proprio **sistema di gestione ambientale**, che include **ventilatori**, **sistemi di raffreddamento**, **illuminazione artificiale**, **umidificatori** e **sistemi di irrigazione**. Il server centrale raccoglie i dati da tutti i sensori e, in caso di letture fuori soglia, invia comandi ai sensori per richiedere nuove rilevazioni o attiva i sistemi di ogni singola serra per correggere le condizioni ambientali.

### Valori Anomali e Sistemi di Attivazione per Ogni Serra

1. **Temperatura**: Se la temperatura rilevata supera i **35°C**, il server considera il valore anomalo. Ogni serra ha un proprio sistema di **raffreddamento**. Il server invia una richiesta di nuova lettura al sensore, e se la lettura è confermata, attiva i **ventilatori** e/o il **sistema di raffreddamento** specifico della serra per abbassare la temperatura.
    
2. **Umidità dell’Aria**: Se l’umidità relativa dell’aria scende sotto il **30%** o supera l'**80%**, il server considera il valore anomalo. In risposta, il server invia una richiesta di conferma della lettura al sensore, e, se confermato, attiva l'**umidificatore** o il **deumidificatore** specifico della serra, a seconda della necessità.
    
3. **Umidità del Suolo**: Se l’umidità del suolo scende sotto il **20%** o supera il **80%**, il server considera il valore anomalo. Se confermato, il server invia comandi per attivare il **sistema di irrigazione** per aumentare l’umidità o il **sistema di drenaggio** per ridurla, a seconda del caso. Ogni serra ha il proprio sistema di irrigazione e drenaggio.
    
4. **Luminosità**: Se la luminosità scende sotto i **100 lux** o supera i **10.000 lux**, il server considera il valore anomalo. Ogni serra ha il proprio **sistema di ombreggiamento** e **illuminazione artificiale**. In caso di valori anomali, il server invia il comando per attivare il sistema di **ombreggiamento** per ridurre l’eccessiva luce o il sistema di **illuminazione artificiale** per aumentarla.
    

### Esempio di Gestione dell'Anomalia in una Serra

Immagina che nella **Serra A**, il sensore rilevi una temperatura di **37°C**. Il server invia una richiesta al sensore per confermare la lettura. Se la lettura è confermata, il server attiva i **ventilatori** e il **sistema di raffreddamento** della **Serra A** per ridurre la temperatura. Allo stesso tempo, nella **Serra B**, se un altro sensore rileva un'umidità del suolo sotto il **20%**, il server attiva il **sistema di irrigazione** specifico di quella serra per aumentare l'umidità del terreno.

### Riepilogo

In questo sistema, ogni **serra** è autonoma nella gestione delle sue condizioni ambientali, ma il **server centrale** coordina le operazioni e monitora tutte le serre contemporaneamente. Ogni serra ha i propri **sistemi di controllo**, e il server agisce in base ai dati ricevuti, intervenendo localmente con il sistema specifico per ogni serra per mantenere le condizioni ottimali per la crescita delle piante.

