import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-notificaciones_item')
export class VistaNotificaciones_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;" id="_layoutNotificacionUsuario">
 <vaadin-vertical-layout theme="spacing" id="_LayoutRetweetUsuario" style="width: 100%; flex-grow: 0; flex-shrink: 0;">
  <vaadin-horizontal-layout theme="spacing-l" style="background-color: #f0f0f0; flex-shrink: 0; align-self: stretch; align-items: center;">
   <vaadin-button tabindex="0" id="verperfil">
     @usuario 
   </vaadin-button>
   <label id="tipoNotificacion">te ha emportillado</label>
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
