package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.*; 
import java.util.random.*;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
	private int[] arregloEnteros;	
	

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
	
    private String[] arregloCadenas;
  
    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     * 
     */
    


	public SandboxArreglos( )
    {
		arregloEnteros = new int[] {};
        arregloCadenas = new String[] { };

    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
        
    public int[] getCopiaEnteros( )
    {
    	int[] arregloEnterosCopia;	
    	arregloEnterosCopia = new int[]{};
    	for (int i=0;i<arregloEnteros.length;i++) {
    		arregloEnterosCopia[i]=arregloEnteros[i];
		
        }
    	return arregloEnterosCopia;
    }
    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	String[] arregloCadenasCopia;	
    	arregloCadenasCopia = new String[arregloCadenas.length];
    	
    	/*for (int i=0;i<arregloCadenas.length;i++) {
    		arregloCadenasCopia[i]=arregloCadenas[i];		
        }*/
    	arregloCadenasCopia = Arrays.copyOf(arregloCadenas, arregloCadenas.length);
        return arregloCadenasCopia;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	
    	int i;
    	int newArray[]= new int[arregloEnteros.length+ 1]; 	    	
    	for ( i=0; i < arregloEnteros.length; i++) {
    		newArray[i] =arregloEnteros[i];	
		
        }
    	newArray[arregloEnteros.length]= entero; 
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[] arregloCadenasCopia;	
    	arregloCadenasCopia = new String[]{};
    	int i;
    	String newArray[]= new String[arregloCadenas.length+ 1]; 	    	
    	for ( i=0; i < arregloCadenas.length; i++) {
    		newArray[i] =arregloCadenas[i];			
        }
    	newArray[arregloCadenas.length]= cadena; 
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int i;
    	for ( i=0; i < arregloEnteros.length; i++) {
    		if (arregloEnteros[i]==valor);
    		 arregloEnteros[i]=0;   				 
		
        }
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int i;
    	for ( i=0; i < arregloCadenas.length; i++) {
    		if (arregloCadenas[i].equals(cadena)) {
    		    arregloCadenas[i]=""; 
    		     			 
    		}
    	}
    	
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int i;
    	for ( i=0; i < arregloEnteros.length; i++) {
    		if (i==posicion);
    		 arregloEnteros[i]=entero;   				 
		
        }
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int i;
    	for ( i=0; i < arregloEnteros.length; i++) {
    		if (i==posicion);
    		 arregloEnteros[i]=0;   				 
		
        }
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int i;
    	for(i=0; i < valores.length; i++) {
    	   String numero= String.valueOf(valores[i]);
    	   int parte_entera = Integer.parseInt(numero.substring(0, numero.indexOf('.')));
    	   valores[i]=parte_entera;
    	   
    	}
    	
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	int i;
    	for ( i=0; i < arregloCadenas.length; i++) {
    		String convertedToString = String.valueOf(objetos[i]); 
    		arregloCadenas[i]=convertedToString;    		
    	}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int i=0;
    	for ( i=0; i < arregloEnteros.length-1; i++) {
    		if (arregloEnteros[i] < 0) {
    	   	   arregloEnteros[i]=arregloEnteros[i]*(-1);   				 
    		}
        }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	for (int x = 0; x < arregloEnteros.length; x++) {
            for (int i = 0; i < arregloEnteros.length-x-1; i++) {
                if(arregloEnteros[i] < arregloEnteros[i+1]){
                    int tmp = arregloEnteros[i+1];
                    arregloEnteros[i+1] = arregloEnteros[i];
                    arregloEnteros[i] = tmp;
                }
            }
        }
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(arregloCadenas);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
      int contador;
      contador =0;
      int i;
      for(i=0; i < arregloEnteros.length; i++) {
  		if (arregloEnteros[i]==valor) {
		 contador= contador +1 ;  			 
  		}
     }
    		  
    	if (contador==0){
    	  return -1;
    	}
    	else{
    		return contador;
    		}
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
       
    	int contador;
        contador =0;
        int i;
        for(i=0; i < arregloCadenas.length; i++) {
    		if (arregloCadenas[i]==cadena) {
  		 contador= contador +1 ;  			 
    		}
       }
      		  
      	if (contador==0){
      	  return -1;
      	}
      	else{
      		return contador;
      		}
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
        int i,j=0;
        int[] resultado;
        resultado= new int [arregloEnteros.length];
        int encontrado;
        encontrado=0;
        for(i=0; i < arregloEnteros.length; i++) {
        	if (arregloEnteros[i]==valor) {
        		encontrado= encontrado+1;
        		if (encontrado>1) {        			
        			resultado[j]=i;
        			j++;
        			
        		}
        	}
        }  
        if (encontrado<=0) {
        	resultado =new int[0];
        }        
        return resultado;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	
    	int[] resultado;
    	resultado = new int [2];
    
    	
    	if (arregloEnteros.length==0) {
    		return resultado;
    	}
    	int i=0;
    	int menor;
    	menor= arregloEnteros[0];
    	int mayor;
    	mayor= arregloEnteros[0];
    	for(i=0; i<arregloEnteros.length-1; i++) {
    		if (arregloEnteros[i] <= menor) {
    			menor=arregloEnteros[i];
    		}
    	}
    	for(i=0; i<arregloEnteros.length-1; i++) {
    		if (arregloEnteros[i] >= mayor) {
    			mayor=arregloEnteros[i];
    		}
    	}
    	
    	resultado[0]=menor;
    	resultado[1]=mayor;
    	
    			
        return resultado;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        
    	 HashMap<Integer, String> hash = new HashMap<>();
    	 HashMap<Integer, Integer> hashnum = new HashMap<>();
    	 int n=0;
         Arrays.sort(arregloEnteros);
         
         for (int i=1; i < arregloEnteros.length; i++){
              hash.put(i,"");
              hashnum.put(i,0);
         }        
                 
         for (int i = 0; i < arregloEnteros.length; i++) {
             hash.put(new Integer(arregloEnteros[i]), hash.get(i++));
         }

         for (Integer key : hash.keySet()) {
             //System.out.println(key + ": " + hash.get(key));
             n=hash.get(key).length();
             hashnum.put(key,n);            
             
         }
     return hashnum;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
       int i,j;
       int cont=0;
       int[] resultado;
       resultado= new int [arregloEnteros.length];
       for(i=0; i < arregloEnteros.length; i++) {
    	   for(j=i+1; j<arregloEnteros.length; j++) {
    		   if (arregloEnteros[i]==arregloEnteros[j]) 
    			  resultado[i]=arregloEnteros[i];
    		   
    	   }
       }
    	   int [] arreglo_resultado= new int[resultado.length];       
           int a,top=0;
           boolean repetido;
           
           for(i=0; i<resultado.length; i++){
        	   repetido=false;
        	   a=0;
        	   while(!repetido && (a<top)) {
        		   if(resultado[i]== arreglo_resultado[a]) {
        			   repetido=true;
        		   }
        		   a++;
        	   }
        	   if (!repetido) {
        		   arreglo_resultado[top]=resultado[i];
        		   top++;
        	   }
        			   
           }
           for(i=0; i<arreglo_resultado.length; i++){
        	   if (arreglo_resultado[i]!=0) {
        		   cont++;
        	   }
        	   
           }
           
           
         return cont;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	boolean respuesta;
    	Arrays.sort(otroArreglo);
      	respuesta=Arrays.equals(arregloEnteros, otroArreglo);
    	//int [] otroArreglo= new int[otroArreglo.length];    	
    	//Arrays.sort(arregloEnteros);
    	//Arrays.sort(otroArreglo);  
    	//if (Arrays.equals(otroArreglo, arregloEnteros) && (arregloEnteros.length==otroArreglo.length)){
    		//respuesta=true;
    	//}
    	//else {
    		//respuesta=false;
    	//}
    		
    		
    		
    	/*for (int i=0; i < arregloEnteros.length; i++ ) {
    		for (int j=0; j<otroArreglo.length; j++){
    			if (arregloEnteros[i]==otroArreglo[j]) {
    			respuesta=true;
    			}
    			else {
    			respuesta=false;
    			}
    		}
    	}*/
    	return respuesta;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	for (int i = 0; i < otroArreglo.length-1; i++) {
    	    for (int j = i+1; j < otroArreglo.length; j++) {
    	        if (otroArreglo[j]<otroArreglo[i]){
    	            int aux = otroArreglo[j];
    	            otroArreglo[j] =otroArreglo[i];
    	            otroArreglo[i] = aux;
    	        }
    	    }
    	}
    	for (int i = 0; i < arregloEnteros.length-1; i++) {
    	    for (int j = i+1; j < arregloEnteros.length; j++) {
    	        if (arregloEnteros[j]<arregloEnteros[i]){
    	            int aux = arregloEnteros[j];
    	            arregloEnteros[j] = arregloEnteros[i];
    	            arregloEnteros[i] = aux;
    	        }
    	    }
    	}
    	
    	boolean respuesta;
    	if (Arrays.equals(arregloEnteros, otroArreglo)) {
    		respuesta=true;
    	}
    	else {
    		respuesta=false;
    	}
    	return respuesta;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	//System.out.println(cantidad);
    	
    		if(minimo == maximo) {
    			arregloEnteros[0]=1;
    			
    		}
    		else if(minimo<=0) {
    			for (int pos = 0; pos < cantidad-1; pos++){
        			//arregloEnteros[pos] = (int)(Math.random()*(maximo - minimo) + minimo);  	
        			//arregloEnteros[pos]  = Math.random().nextInt(maximo + minimo) - minimo;
    			}
    			}
    		else {
    			for (int pos = 0; pos < cantidad-1; pos++){
    			arregloEnteros[pos] = (int)(Math.random()*(maximo - minimo) + minimo);  	
    			//arregloEnteros[pos] =new Random().nextInt(maximo + minimo) - minimo;
    		
    		} 	
    		//arregloEnteros[pos] = (int)(Math.random()*(minimo -(maximo+1)) + (maximo + 1));
     	}
    }
    	

	public int[] getArregloEnteros() {
		return getArregloEnteros();
	}

	public void setArregloEnteros(int[] arregloEnteros) {
	}

	public String[] getArregloCadenas() {
		return arregloCadenas;
	}

	public void setArregloCadenas(String[] arregloCadenas) {
		this.arregloCadenas = arregloCadenas;
	}

}
