package com.ejemplo01b.ejemplo01b;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService {

  @Autowired
  private PersonaRepositorio repositorio;

  @Override
  public List<Persona> listar() {
    return repositorio.findAll();
  }

  @Override
  public Persona listarId(int id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Persona add(int id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Persona edit(int id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Persona delete(int id) {
    // TODO Auto-generated method stub
    return null;
  }

}
