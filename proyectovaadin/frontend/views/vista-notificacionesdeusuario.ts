import { LitElement, html, css, customElement } from 'lit-element';

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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: stretch;position:absolute;" id="contenedorNotificacionesUsuario"></vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
