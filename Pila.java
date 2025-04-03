import javax.swing.*;
import java.awt.*;
import java.rmi.server.ExportException;
import java.util.List;
import java.util.Stack;

public class Pila {

    private Stack<String> arreglo;
    private static final int LIMITE = 10;

    public Pila(){
        arreglo = new Stack<String>();
    }

    public void apilar(String dato) {
        if (arreglo.size() == LIMITE) {
            JOptionPane.showMessageDialog(null, "Numero maximo de elementos");
        } else if (arreglo.size() < LIMITE) {
            arreglo.push(dato);
        }

    }

    public String desapilar() throws Exception {
        //da error porque la clase stack puede almacenar cualquier tipo de dato y toca definir el tipo de dato
        //todos los elementos que se van a apilar son de tipo String con esto Stack<String>
        if(arreglo.isEmpty())
            throw new Exception("Error al desapilar, la pila esta vacia");
        return arreglo.pop();
    }

    public String cima() throws Exception {
        // el peek nos muestra el elemento de la cima sin eliminar

        return arreglo.peek();
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();

        //size cuenta la cantidad de elementos
        for(int indice=arreglo.size()-1; indice>=0; indice--){
            cadena.append(arreglo.get(indice)+"\n");
        }
        return cadena.toString();
    }
}
