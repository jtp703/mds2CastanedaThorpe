import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/icons';
import '@vaadin/avatar/src/vaadin-avatar.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/icon/src/vaadin-icon.js';

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
<vaadin-vertical-layout id="contenedorTweet" style="width: 100%; box-sizing: border-box;border: 1px solid #ddd;        /* borde fino y gris claro */
  border-radius: 8px;            /* esquinas ligeramente redondeadas */
  padding: 12px;                 /* espacio interno */
  margin-bottom: 12px;           /* separa un tweet del siguiente */
  background-color: #fff;        /* fondo blanco */
  box-shadow: 0 2px 4px rgba(0,0,0,0.08);">
 <vaadin-horizontal-layout class="content" style="flex-shrink: 0; flex-grow: 0; align-self: stretch; box-sizing: border-box; align-items: center; width: 100%;" theme="spacing-s">
  <vaadin-horizontal-layout style="flex-grow: 1; margin: var(--lumo-space-xs); align-self: center;" id="perfilLayout">
   <vaadin-avatar style="align-self: center; margin-right: 4px;" id="iconoPerfil"></vaadin-avatar>
   <vaadin-button id="verperfil" tabindex="0">
     usuario 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout id="idContenidoTweetLayout" style="flex-grow: 1; margin: var(--lumo-space-m); align-self: center;">
   <vaadin-horizontal-layout style="align-self: center;">
    <p style="white-space: normal; overflow-wrap: break-word; flex-shrink: 1;" id="textoTweet">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially u</p>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
    <img id="doc1" style="width:100px; height:auto;">
    <img id="doc2" style="width:100px; height:auto;">
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <vaadin-button tabindex="0" id="BtnEliminarTweet" style="align-self: flex-end;">
     Eliminar Tweet 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; align-self: center; width: 70%; justify-content: center; align-items: center;" id="contenedorInteracciones">
  <vaadin-vertical-layout id="idMegustaLayout" style="margin: var(--lumo-space-s); justify-content: center;">
   <vaadin-horizontal-layout>
    <vaadin-icon style="align-self: center;" icon="vaadin:heart" size="16" id="meGusta"></vaadin-icon>
    <label id="nMegustas" style="margin-left: var(--lumo-space-m);">0</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="idMegustaLayout" style="margin: var(--lumo-space-s); justify-content: center;">
   <vaadin-horizontal-layout>
    <vaadin-icon style="align-self: center;" icon="vaadin:retweet" size="16" id="darRetweet"></vaadin-icon>
    <label style="margin-left: var(--lumo-space-m);" id="nRetweets">0</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="idMegustaLayout" style="margin: var(--lumo-space-s); justify-content: center;">
   <vaadin-horizontal-layout>
    <vaadin-icon style="align-self: center;" icon="vaadin:comment" size="16" id="comentar"></vaadin-icon>
    <label style="margin-left: var(--lumo-space-m);" id="nComentarios">0</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
