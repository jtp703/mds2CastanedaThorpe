import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
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
<vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
 <vista-listadodehashtags_item></vista-listadodehashtags_item>
 <div></div>
 <vista-listadodehashtags_item></vista-listadodehashtags_item>
 <div></div>
 <vista-listadodehashtags_item></vista-listadodehashtags_item>
 <div></div>
 <vista-listadodehashtags_item></vista-listadodehashtags_item>
 <div></div>
 <vista-listadodehashtags_item></vista-listadodehashtags_item>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
