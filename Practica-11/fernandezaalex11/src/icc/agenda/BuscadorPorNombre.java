/* -*- jde -*- */
/* <BuscadorPorNombre.java> */

package icc.agenda;
import icc.util.*;

/**
 * Clase que busca registros agenda con un nombre dado.
 */
public class BuscadorPorNombre implements Buscador {

	/* Nombre que se busca */
	private String nombreBuscado;

	/**
	 * Construye al buscador con el nombre que
	 * va a buscar.
	 * @param nombre es el nombre que se buscara 
	 */
	public BuscadorPorNombre(String nombre) {
		nombreBuscado = nombre;
	}

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 * @param reg Registro que se desea saber si corresponde
	 *        al nombre buscado.
	 * @return si <code>reg</code> tiene ese nombre.
	 */
	public boolean esEste(Object rg) {
		RegistroAgenda reg =(RegistroAgenda)(rg);
		if (reg.getNombre().contains(nombreBuscado)) {
			return true;
		}else{
			return false;
		}
	}

}
