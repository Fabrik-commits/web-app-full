import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from '../Modelo/Persona';

@Injectable()
export class ServiceService {

  constructor(private http: HttpClient) { }

  Url = 'http://localhost:8080/ejemplo01b/personas';

  getPersonas() {
    return this.http.get<Persona[]>(this.Url);
  }
  createPersona(persona: Persona) {
    return this.http.post<Persona>(this.Url, persona);
  }

}
