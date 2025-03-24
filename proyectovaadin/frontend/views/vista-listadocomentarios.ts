import { LitElement, html, css, customElement } from 'lit-element';
import './vista-listadotweets_item';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import './vista-listadocomentarios_item';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listadocomentarios')
export class VistaListadocomentarios extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; position:absolute;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-shrink: 0; flex-grow: 1; flex-direction: column;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 0; flex-grow: 1; flex-direction: column;">
   <vista-listadotweets_item style="flex-shrink: 0;"></vista-listadotweets_item>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; flex-grow: 1;">
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; width: 100%;">
     <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-shrink: 0;">
      <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0;">
       <vista-listadocomentarios_item style="width: 100%; flex-shrink: 0;"></vista-listadocomentarios_item>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0;">
       <vista-listadocomentarios_item style="width: 100%; flex-shrink: 0;"></vista-listadocomentarios_item>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
