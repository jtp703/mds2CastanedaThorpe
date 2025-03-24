import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; position:absolute; padding: var(--lumo-space-l);" id="_LayoutUsuario">
 <vaadin-vertical-layout theme="spacing" style="align-self: flex-start;">
  <vaadin-avatar style="align-self: center;"></vaadin-avatar>
  <a href="" id="_verPerfil" style="flex-grow: 0; align-self: center;">@usuario</a>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: flex-start; justify-content: center;">
   <vaadin-vertical-layout id="idMegustaLayout" style="margin: var(--lumo-space-s); justify-content: center;">
    <vaadin-horizontal-layout>
     <label style="align-self: center;">Seguidores</label>
     <span style="background-color: gray !important; 
color: white !important; 
border-radius: 999px; 
padding: 2px 8px; 
font-size: 12px; 
font-weight: bold;flex-grow: 0; margin: var(--lumo-space-m);" id="_SeguidoresUsuario">6</span>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="idMegustaLayout" style="margin: var(--lumo-space-s); justify-content: center;">
    <vaadin-horizontal-layout>
     <label style="align-self: center;">Seguidos</label>
     <span style="background-color: gray !important; 
color: white !important; 
border-radius: 999px; 
padding: 2px 8px; 
font-size: 12px; 
font-weight: bold;flex-grow: 0; margin: var(--lumo-space-m);" id="_SeguidosUsuario">6</span>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-button tabindex="0" id="_SeguirUsuario" style="align-self: flex-start;">
   Seguir usuario 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
