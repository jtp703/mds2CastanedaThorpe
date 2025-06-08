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
<vaadin-vertical-layout style="display: flex;
flex-direction: column;
width: 100%;
height: 100%;
position: absolute;
" id="contenedorVercomentarios">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0;
" id="contenedorTweet"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="contenedorListadoComentarios" style="flex-grow: 1;
overflow-y: auto;
min-height: 0;
"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0;">
  <vaadin-button id="btnVovler" tabindex="0" style="flex-shrink: 0; flex-grow: 0;">
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
