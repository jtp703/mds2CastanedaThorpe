import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-notificacionesdeusuario')
export class VistaNotificacionesdeusuario extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: stretch;position:absolute;" id="contenedorNotificacionesUsuario">
 <vaadin-vertical-layout theme="spacing" id="contenedorCibernauta"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="contemdorListadoNotificaciones" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
