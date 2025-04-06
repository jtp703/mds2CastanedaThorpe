import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-megustas')
export class VistaMegustas extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;position:absolute;" id="contenedorMegustas">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-grow: 1;">
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
    <h1>Usuarios que han dado me gusta</h1>
    <vaadin-button id="btnCerrar" style="align-self: center;" tabindex="0">
     Cerrar
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="contenedorListadoMegustas" style="align-self: stretch;"></vaadin-vertical-layout>
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
