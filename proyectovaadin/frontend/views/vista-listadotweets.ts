import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/text-area/src/vaadin-text-area.js';

@customElement('vista-listadotweets')
export class VistaListadotweets extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: stretch;position:absolute;" id="contenedorListadoTweets">
 <vaadin-vertical-layout theme="spacing" id="contenedorNuevoTweet" style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-horizontal-layout style="flex-grow: 0; margin: var(--lumo-space-m); align-self: flex-start;" id="perfilLayout">
    <vaadin-avatar style="align-self: center; margin-right: 4px;" id="iconoPerfil"></vaadin-avatar>
    <a href="" id="verPerfilPersonal" style="flex-grow: 0; align-self: center;">@usuario</a>
   </vaadin-horizontal-layout>
   <vaadin-text-area style="flex-grow: 1;" placeholder="¿Qué esta pasando?"></vaadin-text-area>
  </vaadin-horizontal-layout>
  <button id="enviarTweet" style="align-self: flex-end;">Enviar</button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
