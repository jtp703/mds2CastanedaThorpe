import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-retweets')
export class VistaRetweets extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;position:absolute;" id="contenedorRetweets">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-grow: 1;">
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
    <h1>Usuarios que han retweeteado</h1>
    <vaadin-button id="btnCerrar" style="align-self: center;" tabindex="0">
      Cerrar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="contenedorListadoRetweets" style="align-self: stretch;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
