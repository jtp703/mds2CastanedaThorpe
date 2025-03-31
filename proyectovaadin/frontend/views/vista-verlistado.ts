import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="contenedorListadousuariosSeguidores-Seguidos">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 1; justify-content: center;">
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 0; flex-shrink: 1;">
   <h1>Seguidores de <a href="" id="_verPerfil" style="flex-grow: 0; align-self: center;">@usuario</a></h1>
   <vaadin-vertical-layout theme="spacing" style="align-self: stretch;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
