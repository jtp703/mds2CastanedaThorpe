import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-verlistado')
export class VistaVerlistado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position:absolute;" id="contenedorListadousuariosSeguidores-Seguidos">
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; height: 100%; align-self: center; align-items: center; width: 100%;">
  <vaadin-vertical-layout theme="spacing-s" style="flex-grow: 1; flex-shrink: 0; width: 100%; align-items: center; align-self: center;">
   <vaadin-horizontal-layout theme="spacing">
    <h1 id="tituloSeguidores">Seguidores</h1>
    <h1 id="Seguidos">Seguidos</h1>
    <h1> de <a href="" id="verPerfil" style="flex-grow: 0; align-self: center;">@usuario</a></h1>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout style="align-self: stretch; flex-shrink: 0; flex-grow: 0; width: 100%;" id="ListadoSeguidores"></vaadin-vertical-layout>
   <vaadin-vertical-layout style="flex-shrink: 0; align-self: stretch; width: 100%;" id="ListadoSeguidos"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-button id="btnCerrar" tabindex="0" style="flex-shrink: 0; flex-grow: 0;">
   Cerrar 
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
