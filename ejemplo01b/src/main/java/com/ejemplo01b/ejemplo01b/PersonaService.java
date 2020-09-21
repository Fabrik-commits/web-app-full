package com.ejemplo01b.ejemplo01b;

import java.util.List;

public interface PersonaService {
	List<Persona>listar();
	Persona listarId(int id);
	Persona add(int id);
	Persona edit(int id);
	Persona delete(int id);
}
