import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})
export class PerfilComponent implements OnInit {

  public persona: any = {nombre: 'Pedro', apellido: 'Aguirre Arias'};
  
  constructor() { }

  ngOnInit() {
  }

}
