import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listadousuarios_item')
export class VistaListadousuarios_item extends LitElement {
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
<vaadin-horizontal-layout class="content" style="padding: var(--lumo-space-l); width: 80%; margin: var(--lumo-space-l);" id="_LayoutUsuario" theme="spacing">
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 1;">
  <vaadin-avatar style="align-self: center;"></vaadin-avatar>
  <vaadin-button id="verperfil" tabindex="0" style="flex-shrink: 0; flex-grow: 0; align-self: center;">
    usuario 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; flex-shrink: 0;" id="contenedorSeguidoresSeguidos">
  <vaadin-horizontal-layout style="align-self: center; justify-content: center; flex-grow: 0;">
   <vaadin-button tabindex="0" id="verSeguidores" style="background-color: gray !important;
  color: white !important;
  border-radius: 999px;
  font-size: 12px;
  font-weight: bold;
  padding: 2px 10px;
  line-height: 1;
  min-height: unset;
  min-width: unset;
  box-shadow: none;
  margin: var(--lumo-space-xs);">
     0 
   </vaadin-button>
   <span style="align-self: center;">Seguidores</span>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-self: center; justify-content: center; flex-grow: 0;">
   <vaadin-button id="verSeguidos" style="background-color: gray !important;
  color: white !important;
  border-radius: 999px;
  font-size: 12px;
  font-weight: bold;
  padding: 2px 10px;
  line-height: 1;
  min-height: unset;
  min-width: unset;
  box-shadow: none;
  margin: var(--lumo-space-xs);" tabindex="0">
     0 
   </vaadin-button>
   <span style="align-self: center;">Seguidos</span>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center;">
  <vaadin-button tabindex="0" id="SeguirUsuario" style="flex-shrink: 0; align-self: flex-start;">
    Seguir usuario 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
