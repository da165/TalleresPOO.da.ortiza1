package uniandes.dpoo.estructuras.logica;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;


/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre conjuntos implementados usando un árbol (TreeSet).
 *
 * Todos los métodos deben operar sobre el atributo arbolCadenas que se declara como un NavigableSet.
 * 
 * El objetivo de usar el tipo NavigableSet es que sólo puedan usarse métodos de esa interfaz y no métodos adicionales provistos por la implementación concreta (TreeSet).
 * 
 * A diferencia de un Set, en un NavigableSet existe una noción de orden que en este caso corresponde al órden lexicográfico.
 * 
 * No pueden agregarse nuevos atributos.
 */
public class SandboxConjuntos {
    private NavigableSet<String> arboldeCadenas;

    public SandboxConjuntos() {
        arboldeCadenas = new TreeSet<>();
    }

    public List<String> getCadenasComoLista() {
        return new ArrayList<>(arboldeCadenas);
    }

    public List<String> getCadenasComoListaInvertida() {
        return new ArrayList<>(arboldeCadenas.descendingSet());
    }

    public String getPrimera() {
        return arboldeCadenas.isEmpty() ? null : arboldeCadenas.first();
    }

    public String getUltima() {
        return arboldeCadenas.isEmpty() ? null : arboldeCadenas.last();
    }

    public Collection<String> getSiguientes(String cadena) {
        return arboldeCadenas.tailSet(cadena);
    }

    public int getCantidadCadenas() {
        return arboldeCadenas.size();
    }

    public void agregarCadena(String cadena) {
        arboldeCadenas.add(cadena);
    }

    public void eliminarCadena(String cadena) {
        arboldeCadenas.remove(cadena);
    }

    public void eliminarCadenaSinMayusculasOMinusculas(String cadena) {
        Iterator<String> iterador = arboldeCadenas.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().equalsIgnoreCase(cadena)) {
                iterador.remove();
            }
        }
    }

    public void eliminarPrimera() {
        if (!arboldeCadenas.isEmpty()) {
            arboldeCadenas.pollFirst();
        }
    }

    public void reiniciarConjuntoCadenas(List<Object> objetos) {
        arboldeCadenas.clear();
        objetos.forEach(obj -> arboldeCadenas.add(obj.toString()));
    }

    public void volverMayusculas() {
        NavigableSet<String> nuevoConjunto = new TreeSet<>();
        for (String cadena : arboldeCadenas) {
            nuevoConjunto.add(cadena.toUpperCase());
        }
        arboldeCadenas = nuevoConjunto;
    }

    public TreeSet<String> invertirCadenas() {
        return new TreeSet<>(arboldeCadenas.descendingSet());
    }

    public boolean compararElementos(String[] otroArreglo) {
        for (String element : otroArreglo) {
            if (!arboldeCadenas.contains(element)) {
                return false;
            }
        }
        return true;
    }


	public NavigableSet<String> getArbolCadenas() {
		return arboldeCadenas;
	}

	public void setArbolCadenas(NavigableSet<String> arbolCadenas) {
		this.arboldeCadenas = arbolCadenas;
	}

}
