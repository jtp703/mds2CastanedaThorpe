import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/text-area/src/vaadin-text-area.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-banearusuario')
export class VistaBanearusuario extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;position:absolute;" id="contenedorBanearUsuario">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 50%; align-items: center;">
  <h1>Banear <a href="" id="verPerfil" style="flex-grow: 0; align-self: center;">@usuario</a></h1>
  <vaadin-text-area label="Motivo de causa:" placeholder="Motivos que recibirá el usuario de su baneo" id="motivoBaneo" style="align-self: stretch;"></vaadin-text-area>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-button id="btnVolver" tabindex="0">
    Volver
   </vaadin-button>
   <vaadin-button id="btnEnviarBaneo" tabindex="0">
    Enviar
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
