import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-verlistadodetweetsfiltrado')
export class VistaVerlistadodetweetsfiltrado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;position:absolute;" id="contenedorVerListadoTweetsFiltrados">
 <vaadin-vertical-layout theme="spacing" id="contenedorCibernauta" style="align-self: stretch;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="contenedorListadoTweetsFiltrado" style="align-self: stretch; flex-grow: 1;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
