import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/text-area/src/vaadin-text-area.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-listadocomentarios')
export class VistaListadocomentarios extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="contendorListadoComentarios">
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; margin-left: var(--lumo-space-m);">
  <h3>Comentarios</h3>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; align-self: stretch;" id="contenedorComentariosItem"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; align-self: stretch; margin: var(--lumo-space-l);" id="contenedorEscribirComentarios">
  <vaadin-horizontal-layout style="flex-grow: 1; margin: var(--lumo-space-m); align-self: flex-start;" id="perfilLayout">
   <vaadin-avatar style="align-self: center; margin-right: 4px;" id="iconoPerfil"></vaadin-avatar>
   <a href="" id="verPerfil" style="flex-grow: 0; align-self: center;">@usuario</a>
  </vaadin-horizontal-layout>
  <vaadin-text-area id="textAreaComentario" style="align-self: stretch;" placeholder="¿Que esta pasando?"></vaadin-text-area>
  <vaadin-button id="btnEnviarComentario" style="align-self: flex-end;" tabindex="0">
    Enviar 
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
