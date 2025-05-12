import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/tabs/src/vaadin-tabs.js';
import '@vaadin/tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/icon/src/vaadin-icon.js';

@customElement('vista-verperfildeusuario')
export class VistaVerperfildeusuario extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;position:absolute;" id="contenedorVerPerfil">
 <vaadin-vertical-layout theme="spacing" id="contenedorImgFondo" style="align-self: stretch;">
  <vaadin-vertical-layout theme="spacing" id="contenedorImgPerfil" style="align-items: center; flex-grow: 0; align-self: center;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-shrink: 0;">
  <h1 id="nombreUsuario" style="align-self: center;">Heading 1</h1>
  <vaadin-horizontal-layout style="flex-grow: 0; align-self: center; flex-shrink: 0;" id="perfilLayout">
   <a href="" id="verPerfil" style="flex-grow: 0;">@usuario</a>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; margin-left: var(--lumo-space-m); margin-right: var(--lumo-space-l);">
  <vaadin-button id="btnVolver" style="align-self: center;" tabindex="0">
    volver al muro principal 
  </vaadin-button>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-button id="btnSeguir" style="align-self: stretch;" tabindex="0">
     Seguir 
    <vaadin-icon icon="vaadin:user-check"></vaadin-icon>
   </vaadin-button>
   <vaadin-button tabindex="0" id="btnBloquear" style="align-self: stretch;">
     Bloquear 
    <vaadin-icon icon="vaadin:ban"></vaadin-icon>
   </vaadin-button>
   <vaadin-button tabindex="0" id="btnBanearUsuario" style="align-self: stretch;">
     Banear 
    <vaadin-icon icon="vaadin:ban"></vaadin-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;">
   <vaadin-horizontal-layout style="align-self: center; justify-content: center; flex-grow: 1;">
    <a href="https://vaadin.com" style="background-color: gray !important; 
color: white !important; 
border-radius: 999px; 
padding: 2px 8px; 
font-size: 12px; 
font-weight: bold;flex-grow: 0; margin: var(--lumo-space-m);" id="verSeguidos">0</a>
    <span style="align-self: center;">Seguidos</span>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: center; justify-content: center; flex-grow: 1;">
    <a href="https://vaadin.com" style="background-color: gray !important; 
color: white !important; 
border-radius: 999px; 
padding: 2px 8px; 
font-size: 12px; 
font-weight: bold;flex-grow: 0; margin: var(--lumo-space-m);" id="verSeguidores">0</a>
    <span style="align-self: center;">Seguidores</span>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <vaadin-button id="btnEditarPerfil" style="align-self: stretch;" tabindex="0">
    Editar perfil 
   </vaadin-button>
   <vaadin-button tabindex="0" id="btnEliminarPerfil" style="align-self: stretch;">
    Eliminar perfil
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch;">
  <p id="descripcionPerfil" style="align-self: center;">Paragraph</p>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch;">
  <vaadin-tabs orientation="horizontal" selected="0">
   <vaadin-tab id="verPosts" selected>
     Posts 
   </vaadin-tab>
   <vaadin-tab selected id="verRetweets">
     Retweets 
   </vaadin-tab>
   <vaadin-tab selected id="VerMeGustas">
     Me gustas 
   </vaadin-tab>
  </vaadin-tabs>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="contenedorListadotweets" style="align-self: stretch; flex-grow: 1;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
