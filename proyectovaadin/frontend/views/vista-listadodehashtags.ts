import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listadodehashtags_item';

@customElement('vista-listadodehashtags')
export class VistaListadodehashtags extends LitElement {
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
 <vista-listadodehashtags_item></vista-listadodehashtags_item>
 <vista-listadodehashtags_item style="flex-shrink: 1;"></vista-listadodehashtags_item>
 <vista-listadodehashtags_item style="flex-shrink: 1;"></vista-listadodehashtags_item>
 <vista-listadodehashtags_item style="flex-shrink: 1;"></vista-listadodehashtags_item>
 <vista-listadodehashtags_item style="flex-shrink: 1;"></vista-listadodehashtags_item>
 <vista-listadodehashtags_item style="flex-shrink: 1;"></vista-listadodehashtags_item>
 <vista-listadodehashtags_item style="flex-shrink: 1;"></vista-listadodehashtags_item>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
