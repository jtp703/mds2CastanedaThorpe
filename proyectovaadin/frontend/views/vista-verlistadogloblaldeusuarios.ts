import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-verlistadogloblaldeusuarios')
export class VistaVerlistadogloblaldeusuarios extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;position:absolute;" id="contenedorVerListadoGlobalUsuarios">
 <vaadin-vertical-layout theme="spacing" id="contenedorCibernauta" style="align-self: stretch;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="contenedorListadoUsuarios" style="align-self: stretch; flex-grow: 1;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
