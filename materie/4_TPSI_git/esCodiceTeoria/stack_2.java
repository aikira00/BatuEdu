class Book {
    String title;     // Questo viene allocato sull'heap come parte dell'oggetto Book
    int numPages;     // Anche questo viene allocato sull'heap

    // Costruttore della classe Book
    Book(String title, int numPages) {
        this.title = title;
        this.numPages = numPages;
    }

    // Metodo per aggiornare il numero di pagine
    void updatePages(int numPages) {
        this.numPages = numPages;  // Viene aggiornato il valore nello heap, associato all'oggetto Book
    }

    // Metodo per mostrare le informazioni del libro
    void showBookInfo() {
        System.out.println("Titolo: " + title + ", Pagine: " + numPages);
    }
}

public class StackHeapSimulazione {
    public static void main(String[] args) {
        // Allocazione di variabile locale nello stack
        int numPages = 1000;   // Variabile locale nello stack

        // Allocazione dinamica di un oggetto Book (sull'heap)
        Book book = new Book("Il signore degli anelli", numPages);

        // Un'altra variabile locale per aggiornare le pagine
        int updateNumPages = 1200;  // Variabile locale nello stack
        book.updatePages(updateNumPages);  // Aggiorna l'attributo numPages sull'heap

        // Mostra le informazioni del libro
        book.showBookInfo();  // I dati mostrati sono quelli presenti sull'heap
    }
}