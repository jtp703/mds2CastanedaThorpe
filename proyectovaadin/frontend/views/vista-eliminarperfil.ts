import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-eliminarperfil')
export class VistaEliminarperfil extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position:absolute;" id="contenedorEliminarCuenta">
 <vaadin-vertical-layout theme="spacing" style="align-self: center;">
  <h1>Eliminar cuenta de usuario registrado</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch;">
  <vaadin-text-field label="Motivo de causa" placeholder="¿Qué te lleva a abandonarnos?" id="textFieldMotivo" style="align-self: center; width: 50%;" type="text"></vaadin-text-field>
  <vaadin-text-field label="Escribe &quot;Autorizo eliminar (@tu nick)&quot; para eliminar tu cuenta" placeholder=" &quot;Autorizo eliminar (@nickUsuario)&quot;" style="align-self: center; width: 50%;" id="textFieldConfirmacion" type="text"></vaadin-text-field>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: center; margin: var(--lumo-space-xl);">
  <vaadin-button id="btnVolver" tabindex="0">
    Volver 
  </vaadin-button>
  <vaadin-button id="btnEliminarCuenta" tabindex="0">
    Eliminar cuenta 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
