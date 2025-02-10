package uniandes.dpoo.estructuras.logica;

import java.util.Collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.Arrays;
/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre mapas.
 *
 * Todos los métodos deben operar sobre el atributo mapaCadenas que se declara como un Map.
 * 
 * En este mapa, las llaves serán cadenas y los valores serán también cadenas. La relación entre los dos será que cada llave será igual a la cadena del valor, pero invertida.
 * 
 * El objetivo de usar el tipo Map es que sólo puedan usarse métodos de esa interfaz y no métodos adicionales provistos por la implementación concreta (HashMap).
 * 
 * No pueden agregarse nuevos atributos.
 */
public class SandboxMapas
{
    /**
     * Un mapa de cadenas para realizar varias de las siguientes operaciones.
     * 
     * Las llaves del mapa son cadenas, así como los valores.
     * 
     * Las llaves corresponden a invertir la cadena que aparece asociada a cada llave.
     */
    private Map<String, String> mapaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxMapas( )
    {
        setMapaCadenas(new HashMap<String, String>( ));
    }

    /**
     * Retorna una lista con las cadenas del mapa (los valores) ordenadas lexicográficamente
     * @return Una lista ordenada con las cadenas que conforman los valores del mapa
     */
    public List<String> getValoresComoLista( )
    {
    	List<String> vacio= new ArrayList<String>();
    	if(mapaCadenas.isEmpty()) {
    		return vacio;
    	}
    	else {
    		Collection<String> collecion = mapaCadenas.values();    	
        	List<String> list= new ArrayList<String>(collecion);  
        	Collections.sort(list);
        	return list;
    	}
    	
    }

    /**
     * Retorna una lista con las llaves del mapa ordenadas lexicográficamente de mayor a menor
     * @return Una lista ordenada con las cadenas que conforman las llaves del mapa
     */
    public List<String> getLlavesComoListaInvertida( )
    {
    	
    	Set<String> setkey=mapaCadenas.keySet();
    	List<String> list = new ArrayList<String>(setkey);    	
    	return list; 
    }

    /**
     * Retorna la cadena que sea lexicográficamente menor dentro de las llaves del mapa .
     * 
     * Si el mapa está vacío, debe retornar null.
     * @return
     */
    public String getPrimera( )
    {
    	 if (mapaCadenas.isEmpty()){
    	            return null;
    	        }
    	 else {
    		 String[] arreglo_cadenas= (String[]) mapaCadenas.values().toArray(new String[0]);
  	        
  	        Arrays.sort(arreglo_cadenas);
  	      return arreglo_cadenas[0];
    	 }
    	            
    	      
    }

    /**
     * Retorna la cadena que sea lexicográficamente mayor dentro de los valores del mapa
     * 
     * Si el conjunto está vacío, debe retornar null.
     * @return
     */
    public String getUltima( )
    {
    	if (mapaCadenas.isEmpty()){
            return null;
        }
    	else {
    		String[] arreglo_cadenas= (String[]) mapaCadenas.values().toArray(new String[0]);
    		
    		Arrays.sort(arreglo_cadenas);
    		int n=arreglo_cadenas.length;
    		return arreglo_cadenas[n-1];
    	}
    }

    /**
     * Retorna una colección con las llaves del mapa, convertidas a mayúsculas.
     * 
     * El orden de las llaves retornadas no importa.
     * @return Una lista de cadenas donde todas las cadenas están en mayúsculas
     */
    public Collection<String> getLlaves( )
    {
    	ArrayList<String> lista = new ArrayList<String>();;
        
        if (mapaCadenas.isEmpty()){
           return null;
        }
            
        String[] arreglo_cadenas= (String[]) mapaCadenas.keySet().toArray(new String[0]);
        
        for (int i=0; i<arreglo_cadenas.length; i++){
            lista.add(arreglo_cadenas[i].toUpperCase());
    
        }
        return lista;
    }

    /**
     * Retorna la cantidad de *valores* diferentes en el mapa
     * @return
     */
    public int getCantidadCadenasDiferentes( )
    {
    	Set<String> listakey= mapaCadenas.keySet();
		List<String> list = new ArrayList<String>(listakey);
		int size=list.size();
    	if(size==0) {
    		return 0;
    	}
    	else {
    		
    	}
    		int i,j;    	      
    	       int[] resultado;
    	       resultado= new int [size];    	      
    	       for(i=0; i < size; i++) {
    	    	   for(j=i+1; j<size; j++) {
    	    		   if (list.get(i)==list.get(i)) { 
    	    			  resultado[i]=i;
    	    		   }
    	    	   }
    	       }
    	return resultado.length;
    			
    }

    /**
     * Agrega un nuevo valor al mapa de cadenas: el valor será el recibido por parámetro, y la llave será la cadena invertida
     * 
     * Este método podría o no aumentar el tamaño del mapa, dependiendo de si ya existía la cadena en el mapa
     * 
     * @param cadena La cadena que se va a agregar al mapa
     */
    public void agregarCadena( String cadena )
    {
    	if (cadena=="") {
    		cadena="";
    	}
    	String alreves="";
    	for (int i=cadena.length()-1;i>=0;i--) {
    		alreves+=cadena.charAt(i);
    	}
    	mapaCadenas.put(alreves, cadena);
    }

    /**
     * Elimina una cadena del mapa, dada la llave
     * @param cadena La llave para identificar el valor que se debe eliminar
     */
    public void eliminarCadenaConLLave( String llave )
    {
    	mapaCadenas.remove(llave);
    }

    /**
     * Elimina una cadena del mapa, dado el valor
     * @param cadena El valor que se debe eliminar
     */
    public void eliminarCadenaConValor( String valor )
    {
    		Set<String> listakey= mapaCadenas.keySet();
    		List<String> list = new ArrayList<String>(listakey);
    		int size=list.size();
    		for(int i=0; i < size; i++) {
    			if (list.get(i)==valor) {
    				mapaCadenas.remove(i);
    			}
    		}
    		
    }

    /**
     * Reinicia el mapa de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarMapaCadenas( List<Object> objetos )
    {
    	String[] arreglo_llaves= (String[]) mapaCadenas.keySet().toArray(new String[0]);
    	String[] arreglo_cadenas = new String[objetos.size()];
    	for (int i = 0; i < arreglo_cadenas.length; i++) {
            arreglo_cadenas[i] = String.valueOf(objetos.get(i));
    	}
    	Iterator entries = mapaCadenas.entrySet().iterator();
        int j=0;
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            mapaCadenas.replace(arreglo_llaves[j], arreglo_cadenas[j]);                    
            
            j++;
        }
    }

    /**
     * Modifica el mapa de cadenas reemplazando las llaves para que ahora todas estén en mayúsculas pero sigan conservando las mismas cadenas asociadas.
     */
    public void volverMayusculas( )
    {
    	Map mapanuevo = new HashMap(); 
    	String[] arreglo_llaves= (String[]) mapaCadenas.keySet().toArray(new String[0]);
         
        
        String[] arreglo_valores = (String[]) mapaCadenas.values().toArray(new String[0]);
       
        String[] arreglo_mayus = new String[arreglo_llaves.length];
     
         
       
        for (int i=0; i<arreglo_llaves.length; i++){
           arreglo_mayus[i]=arreglo_llaves[i].toUpperCase();
           mapanuevo.put(arreglo_mayus[i],arreglo_valores[i]);
       }
        
       mapaCadenas.clear();
       mapaCadenas.putAll(mapanuevo);
    }

    /**
     * Verifica si todos los elementos en el arreglo de cadenas del parámetro hacen parte del mapa de cadenas (de los valores)
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si todos los elementos del arreglo están dentro de los valores del mapa
     */
    public boolean compararValores( String[] otroArreglo )
    {
    	List<String> valuesList = new ArrayList<>(mapaCadenas.values());
    	if(valuesList.equals(otroArreglo)) {
    		return true;
    	}
    	return false;
    }

	public Map<String, String> getMapaCadenas() {
		return mapaCadenas;
	}

	public void setMapaCadenas(Map<String, String> mapaCadenas) {
		this.mapaCadenas = mapaCadenas;
	}

}
