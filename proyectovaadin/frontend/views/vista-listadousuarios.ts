import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import './vista-listadousuarios_item';

@customElement('vista-listadousuarios')
export class VistaListadousuarios extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-listadousuarios_item style="flex-shrink: 1; flex-grow: 0;"></vista-listadousuarios_item>
 <vista-listadousuarios_item style="flex-shrink: 1; flex-grow: 0;"></vista-listadousuarios_item>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
