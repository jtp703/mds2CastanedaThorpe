import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-vercomentarios')
export class VistaVercomentarios extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="contenedorVercomentarios">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; align-self: stretch;" id="contenedorTweet"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="contenedorListadoComentarios" style="align-self: stretch;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-bottom: var(--lumo-space-m);">
  <vaadin-button id="btnVovler" tabindex="0">
    Volver 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
