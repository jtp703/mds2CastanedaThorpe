import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-recuperarcontrasenia')
export class VistaRecuperarcontrasenia extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position:absolute; align-items: center;" id="contenedorRecuperarContrasenia">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-grow: 1;">
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <vaadin-horizontal-layout theme="spacing">
    <h1 style="align-self: center;">Recuperar contraseña</h1>
    <vaadin-button id="btnCerrar" style="align-self: center;" tabindex="0">
      Cerrar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <span>Introduzca el correo de la contraseña que desea recuperar</span>
   <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
    <vaadin-text-field placeholder="example@gmail.es" id="correo" style="flex-grow: 1;" type="text"></vaadin-text-field>
    <vaadin-button id="btnEnviar" style="align-self: flex-end;" tabindex="0">
      Enviar 
    </vaadin-button>
   </vaadin-horizontal-layout>
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
