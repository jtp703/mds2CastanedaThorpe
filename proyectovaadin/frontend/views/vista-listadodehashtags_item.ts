import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

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
<vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center;">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; flex-shrink: 1; margin: var(--lumo-space-m); padding: var(--lumo-space-m); width: 100%;" id="_layoutElementoHashtag">
  <vaadin-button id="nombrehashtag" tabindex="0" style="align-self: center; flex-shrink: 0; flex-grow: 1;">
    hashtag 
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing" style="align-items: flex-start; justify-content: flex-end; flex-grow: 1; width: 100%;">
   <label style="padding: 2px 8px; margin: var(--lumo-space-m); align-self: center;">Numero de interacciones</label>
   <span style="background-color: gray !important; color: white !important; border-radius: 999px; padding: 2px 8px; font-size: 12px; font-weight: bold; flex-grow: 0; margin: var(--lumo-space-m); align-self: center;" id="idNumeroInteraccionesHashtag">6</span>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
