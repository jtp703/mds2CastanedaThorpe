import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/icon/src/vaadin-icon.js';

@customElement('vista-notificaciones')
export class VistaNotificaciones extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="contenedorNotificaciones" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout style="align-self: stretch;">
  <vaadin-button id="btnSeguidores" style="margin-right: var(--lumo-space-s);" tabindex="0">
   Seguidores nuevos
   <vaadin-icon icon="vaadin:user-check"></vaadin-icon>
  </vaadin-button>
  <vaadin-button tabindex="0" id="btnMegustas" style="margin-right: var(--lumo-space-s);">
   Me gustas recibidos
   <vaadin-icon icon="vaadin:clipboard-heart"></vaadin-icon>
  </vaadin-button>
  <vaadin-button tabindex="0" id="btnRetweets" style="margin-right: var(--lumo-space-s);">
   Retweets recibidos
   <vaadin-icon icon="vaadin:retweet"></vaadin-icon>
  </vaadin-button>
  <vaadin-button tabindex="0" id="btnMenciones">
   Menciones 
   <vaadin-icon icon="vaadin:users"></vaadin-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%;height: 100%;" id="contenedorNofiticiacionesItem"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
