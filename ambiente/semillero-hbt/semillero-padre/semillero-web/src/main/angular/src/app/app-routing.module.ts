import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GestionarComicComponent } from './semillero/componentes/gestionarComic/gestionar-comic';
import { BienvenidaComponent } from './semillero/componentes/home/bienvenida-component';
import { ConsultarComponent } from './semillero/componentes/consultar/consultar.component';
import { GestionarPedidoComponent } from './semillero/componentes/gestionar-pedido/gestionar-pedido.component';
import { GestionarProveedorComponent } from './semillero/componentes/gestionar-proveedor/gestionar-proveedor.component';

const routes: Routes = [
  { path: 'gestionar-comic', component: GestionarComicComponent },
  { path: 'bienvenida', component: BienvenidaComponent, data : null },
    /**
   * redirige al modulo consultar comic conla informacion del comic seleccionado
   * @author Pedro Aguirre Arias
   */
  { path: 'consultar', component: ConsultarComponent, data: null},
   /**
   * redirige al modulo gestionar pedidos
   * @author Pedro Aguirre Arias
   */
  {path: 'pedidos', component: GestionarPedidoComponent},
  /**
   * redirige al modulo gestionar pedidos
   * @author Pedro Aguirre Arias
   */
  {path: 'proveedores', component: GestionarProveedorComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
