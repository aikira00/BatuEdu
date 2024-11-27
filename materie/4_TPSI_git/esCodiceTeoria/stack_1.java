public class StackHeapSimulation {

    public static void main(String[] args) {
        // Dichiarazione di variabili locali
        int localVar = 10;
        System.out.println("localVar: " + localVar + " (HashCode: " + System.identityHashCode(localVar) + ")");

        // Creazione di un oggetto
        MyObject myObj = new MyObject();
        myObj.value = 20;
        System.out.println("myObj.value: " + myObj.value + " (HashCode: " + System.identityHashCode(myObj) + ")");

        // Passaggio di parametri
        modifyValue(localVar, myObj);
        
        // Stampa valori dopo la modifica
        System.out.println("localVar after modifyValue: " + localVar);
        System.out.println("myObj.value after modifyValue: " + myObj.value);

        // Richiamo del metodo updateValue() su myObj
        myObj.updateValue(50);
        System.out.println("myObj.value after updateValue: " + myObj.value);
    }

    public static void modifyValue(int value, MyObject obj) {
        value = 30; // Modifica il parametro locale
        obj.value = 40; // Modifica il valore dell'oggetto
        System.out.println("Inside modifyValue: value = " + value + ", obj.value = " + obj.value);
    }
}

// Classe MyObject
class MyObject {
    int value;

    // Metodo che aggiorna il valore dell'oggetto
    void updateValue(int newValue) {
        this.value = newValue;
        System.out.println("Inside updateValue: value updated to " + this.value);
    }
}