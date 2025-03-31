import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import './vista-listadotweets_item';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/text-area/src/vaadin-text-area.js';

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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; position:absolute;" id="vaadinVerticalLayout">
 <vista-listadotweets_item style="flex-shrink: 1;" id="vistaListadotweets_item"></vista-listadotweets_item>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; width: 100%;" id="contenedorListadoComentariosItem"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="contenedorEscribirComentario" style="width: 75%; height: 100%; align-self: center; flex-grow: 1;">
  <vaadin-horizontal-layout style="flex-grow: 0; margin: var(--lumo-space-m); align-self: flex-start;" id="idPerfilLayout">
   <vaadin-avatar style="align-self: center;"></vaadin-avatar>
   <a href="" id="_verPerfilPersonal" style="flex-grow: 0; align-self: center;">@usuario</a>
  </vaadin-horizontal-layout>
  <vaadin-text-area style="flex-grow: 1;"></vaadin-text-area>
  <button style="align-self: center;">Enviar </button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
