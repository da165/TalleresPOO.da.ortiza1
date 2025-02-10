package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre listas de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos listaEnteros y listaCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre listas (ie., no haga cosas como construir arreglos para evitar la manipulación de listas).
 * 
 * Intente usar varias formas de recorrer las listas (while, for, for each, iteradores ... )
 */
public class SandboxListas {
    private List<Integer> listadeEnteros;
    private List<String> listadeCadenas;

    public SandboxListas() {
        listadeEnteros = new ArrayList<>();
        listadeCadenas = new LinkedList<>();
    }

    public List<Integer> getCopiaEnteros() {
        return new ArrayList<>(listadeEnteros);
    }

    public List<String> getCopiaCadenas() {
        return new LinkedList<>(listadeCadenas);
    }

    public int[] getEnterosComoArreglo() {
        Integer[] temp = listadeEnteros.toArray(new Integer[0]);
        int[] arreglo = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            arreglo[i] = temp[i];
        }
        return arreglo;
    }

    public int getCantidadEnteros() {
        return listadeEnteros.size();
    }

    public int getCantidadCadenas() {
        return listadeCadenas.size();
    }

    public void agregarEntero(int entero) {
        listadeEnteros.add(entero);
    }

    public void agregarCadena(String cadena) {
        listadeCadenas.add(cadena);
    }

    public void eliminarEntero(int valor) {
        Iterator<Integer> iter = listadeEnteros.iterator();
        while (iter.hasNext()) {
            if (iter.next() == valor) {
                iter.remove();
            }
        }
    }

    public void eliminarCadena(String cadena) {
        Iterator<String> iter = listadeCadenas.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals(cadena)) {
                iter.remove();
            }
        }
    }

    public void insertarEntero(int entero, int posicion) {
        if (posicion < 0) {
            listadeEnteros.add(0, entero);
        } else if (posicion >= listadeEnteros.size()) {
            listadeEnteros.add(entero);
        } else {
            listadeEnteros.add(posicion, entero);
        }
    }

    public void eliminarEnteroPorPosicion(int posicion) {
        if (posicion >= 0 && posicion < listadeEnteros.size()) {
            listadeEnteros.remove(posicion);
        }
    }

    public void reiniciarArregloEnteros(double[] valores) {
        listadeEnteros.clear();
        for (double v : valores) {
            listadeEnteros.add((int) v);
        }
    }

    public void reiniciarArregloCadenas(List<Object> objetos) {
        listadeCadenas.clear();
        for (Object obj : objetos) {
            listadeCadenas.add(obj.toString());
        }
    }

    public void volverPositivos() {
        listadeEnteros.replaceAll(Math::abs);
    }

    public void organizarEnteros() {
        listadeEnteros.sort(Collections.reverseOrder());
    }

    public void organizarCadenas() {
        Collections.sort(listadeCadenas);
    }

    public int contarApariciones(int valor) {
        int contador = 0;
        for (Integer num : listadeEnteros) {
            if (Objects.equals(num, valor)) {
                contador++;
            }
        }
        return contador;
    }

    public int contarApariciones(String cadena) {
        int contador = 0;
        for (String str : listadeCadenas) {
            if (Objects.equals(str, cadena)) {
                contador++;
            }
        }
        return contador;
    }

    public int contarEnterosRepetidos() {
        Map<Integer, Integer> frecuencias = new HashMap<>();
        int contador = 0;
        for (int num : listadeEnteros) {
            frecuencias.put(num, frecuencias.getOrDefault(num, 0) + 1);
            if (frecuencias.get(num) == 2) {
                contador++;
            }
        }
        return contador;
    }

    public boolean compararArregloEnteros(int[] otroArreglo) {
        List<Integer> listaOtro = new ArrayList<>();
        for (int num : otroArreglo) {
            listaOtro.add(num);
        }
        return listadeEnteros.equals(listaOtro);
    }

    public void generarEnteros(int cantidad, int minimo, int maximo) {
        listadeEnteros.clear();
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            listadeEnteros.add(rand.nextInt(maximo - minimo + 1) + minimo);
        }
    }


	public List<Integer> getListaEnteros() {
		return listadeEnteros;
	}

	public void setListaEnteros(List<Integer> listaEnteros) {
		this.listadeEnteros = listaEnteros;
	}

	public List<String> getListaCadenas() {
		return listadeCadenas;
	}

	public void setListaCadenas(List<String> listaCadenas) {
		this.listadeCadenas = listaCadenas;
	}

}
