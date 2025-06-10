import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/password-field/src/vaadin-password-field.js';
import '@vaadin/text-field/src/vaadin-text-field.js';

@customElement('vista-iniciarsesion')
export class VistaIniciarsesion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;position:absolute;" id="contenedorIniciarSesion">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-grow: 1;">
  <vaadin-vertical-layout theme="spacing" style="align-items: flex-start; align-self: center; padding: var(--lumo-space-l);">
   <h1 style="align-self: center;">Iniciar sesión en X</h1>
   <vaadin-text-field label="Correo electrónico" placeholder="example@gmail.com" id="correo" style="align-self: center;" type="text"></vaadin-text-field>
   <vaadin-password-field id="contrasenia1" style="align-self: center;" type="password" label="Contraseña"></vaadin-password-field>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
    <vaadin-button id="btnIniciarSesion" tabindex="0">
      Acceder a x 
    </vaadin-button>
    <vaadin-button tabindex="0" id="btnIniciarSesionGoogle">
      Iniciar sesión con google 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-button id="recuperarContrasenia" style="align-self: center;" tabindex="0">
    ¿Olvidaste tu contraseña?
   </vaadin-button>
   <vaadin-button id="btnVolver" tabindex="0">
     Volver 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
