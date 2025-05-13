import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import './vista-listadotweets_item';
import '@vaadin/text-area/src/vaadin-text-area.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-darretweet')
export class VistaDarretweet extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;position:absolute;" id="contenedorRetweet">
 <vaadin-horizontal-layout style="height: 100%;background-color: lightgray;" id="contenedorTweetsItem">
  <vista-listadotweets_item id="item"></vista-listadotweets_item>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: space-between; align-content: stretch; height: 100%;margin-bottom: 150px;">
  <vaadin-horizontal-layout style="flex-grow: 0; margin: var(--lumo-space-m); align-self: flex-start; padding: var(--lumo-space-m);" id="idPerfilLayout">
   <vaadin-avatar style="align-self: center;"></vaadin-avatar>
   <a href="" id="_verPerfil" style="flex-grow: 0; align-self: center;">@usuario</a>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 100%;">
   <vaadin-text-area id="_MensajeRetweet" style="flex-grow: 1; align-self: stretch; flex-shrink: 1; width: 100%;" placeholder="¿!Que esta pasando¡?"></vaadin-text-area>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center;margin-right: 150px;">
   <vaadin-button tabindex="0" id="idEnviarRetweet" style="flex-grow: 0;">
     Enviar Retweet 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-button id="volver" tabindex="0">
  Volver
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
