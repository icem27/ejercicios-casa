package org.barajas.ies.services;

import org.barajas.ies.entities.Registro;
import org.barajas.ies.entities.Usuario;
import org.barajas.ies.util.Utilidad;

public class Gestion {

	public static boolean agregarUsuario(Registro registro, Usuario usuario) {
		boolean icem_aniadido = false;

		if (!Utilidad.registroLleno(registro) && !Utilidad.usuarioRepetido(registro, usuario)) {
			int icem_posicion = Utilidad.posicionDisponible(registro);
			if (icem_posicion != -1) {
				registro.setUsuario(usuario, icem_posicion);
				icem_aniadido = true;
			}
			
		}

		return icem_aniadido;
	}
	
	public static boolean removeUser(Registro registro, Usuario usuario) {
		boolean removed = false;
		
		if (Utilidad.posicionUsuario(registro, usuario) != -1) {
			registro.setUsuario(null, Utilidad.posicionUsuario(registro, usuario));
			removed = true;
		}
		
		return removed;
	}

}
