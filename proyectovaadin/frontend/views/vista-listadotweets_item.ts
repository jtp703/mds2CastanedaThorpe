import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/icon/src/vaadin-icon.js';
import '@vaadin/icons';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/avatar/src/vaadin-avatar.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-listadotweets_item')
export class VistaListadotweets_item extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; align-items: flex-start;position:absolute;">
 <vaadin-horizontal-layout style="flex-grow: 1; margin: var(--lumo-space-m); align-self: flex-start;" id="idPerfilLayout">
  <vaadin-avatar style="align-self: center;"></vaadin-avatar>
  <a href="" id="_verPerfil" style="flex-grow: 0; align-self: center;">@usuario</a>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout id="idContenidoTweetLayout" style="flex-grow: 1; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
   <p style="flex-grow: 1;">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially u</p>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; align-self: center;">
   <vaadin-vertical-layout id="idMegustaLayout" style="margin: var(--lumo-space-s); justify-content: center;">
    <vaadin-horizontal-layout>
     <vaadin-icon style="align-self: center;" icon="vaadin:heart" size="16"></vaadin-icon>
     <span style="background-color: gray !important; 
color: white !important; 
border-radius: 999px; 
padding: 2px 8px; 
font-size: 12px; 
font-weight: bold;flex-grow: 0; margin: var(--lumo-space-m);">6</span>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="idMegustaLayout" style="margin: var(--lumo-space-s); justify-content: center;">
    <vaadin-horizontal-layout>
     <vaadin-icon style="align-self: center;" icon="vaadin:retweet" size="16"></vaadin-icon>
     <span style="background-color: gray !important; 
color: white !important; 
border-radius: 999px; 
padding: 2px 8px; 
font-size: 12px; 
font-weight: bold;flex-grow: 0; margin: var(--lumo-space-m);">6</span>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="idMegustaLayout" style="margin: var(--lumo-space-s); justify-content: center;">
    <vaadin-horizontal-layout>
     <vaadin-icon style="align-self: center;" icon="vaadin:comment" size="16"></vaadin-icon>
     <span style="background-color: gray !important; 
color: white !important; 
border-radius: 999px; 
padding: 2px 8px; 
font-size: 12px; 
font-weight: bold;flex-grow: 0; margin: var(--lumo-space-m);">6</span>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-button tabindex="0" id="idEliminarTweet">
    Eliminar Tweet 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
