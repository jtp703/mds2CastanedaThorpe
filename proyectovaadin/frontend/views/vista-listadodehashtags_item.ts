import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listadodehashtags_item')
export class VistaListadodehashtags_item extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; position:absolute; align-items: flex-start;">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; flex-shrink: 1;" id="_layoutElementoHashtag">
  <a href="https://vaadin.com" id="_NombreHashtag" style="margin: var(--lumo-space-m); align-self: flex-start;">#Hashtag </a>
  <vaadin-horizontal-layout theme="spacing" style="align-items: flex-start; justify-content: flex-end; flex-grow: 1;">
   <label style="padding: 2px 8px; margin: var(--lumo-space-m);">Numero de interacciones</label>
   <span style="background-color: gray !important; 
color: white !important; 
border-radius: 999px; 
padding: 2px 8px; 
font-size: 12px; 
font-weight: bold;flex-grow: 0; margin: var(--lumo-space-m);" id="idNumeroInteraccionesHashtag">6</span>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
