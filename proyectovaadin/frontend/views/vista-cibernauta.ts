import { LitElement, html, css, customElement } from 'lit-element';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/avatar/src/vaadin-avatar.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-cibernauta')
export class VistaCibernauta extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; position:absolute; align-items: stretch;" id="contenedorPrincipal">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: center; flex-grow: 0; flex-shrink: 0;background-color: lightblue;" id="contenedorRegistro">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
   <vaadin-button id="Registrarse" tabindex="0">
     Registrate en X para tener mas privilegios o inicia sesion 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; margin-left: var(--lumo-space-s); margin: var(--lumo-space-s);" id="vaadinHorizontalLayout2">
  <vaadin-button id="verMuroPrincipal" tabindex="0">
    Muro principal 
  </vaadin-button>
  <vaadin-button tabindex="0" id="verListadoUsuarios">
    Listado de usuarios 
  </vaadin-button>
  <vaadin-button tabindex="0" id="verListadoHashtags">
    Listado de hashtags 
  </vaadin-button>
  <vaadin-button tabindex="0" id="verNotificaciones" style="flex-shrink: 1;">
    Notificaciones 
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; justify-content: flex-end; margin-right: var(--lumo-space-m);" id="contenedorVerPerfilPersonal">
   <vaadin-avatar id="imgPerfilPersonal" style="align-self: center;"></vaadin-avatar>
   <vaadin-vertical-layout theme="spacing">
    <vaadin-button id="verPerfilPersonal" tabindex="0" style="align-self: center;">
      @usuario 
    </vaadin-button>
    <vaadin-button id="btnCerrrarSesion" tabindex="0">
      Cerrar sesion 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout id="contenedorContenido" style="flex-grow: 1;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
