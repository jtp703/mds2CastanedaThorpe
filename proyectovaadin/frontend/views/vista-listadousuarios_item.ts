import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-horizontal-layout class="content" style="position:absolute; padding: var(--lumo-space-l); width: 100%; margin: var(--lumo-space-l);" id="_LayoutUsuario">
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 1;">
  <vaadin-avatar style="align-self: center;"></vaadin-avatar>
  <a href="" id="_verPerfil" style="flex-grow: 0; align-self: center;">@usuario</a>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; flex-shrink: 0;">
  <vaadin-horizontal-layout style="flex-shrink: 0;">
   <label style="align-self: center;">Seguidores</label>
   <span style="background-color: gray !important; color: white !important; border-radius: 999px; padding: 2px 8px; font-size: 12px; font-weight: bold; flex-grow: 0; margin: var(--lumo-space-m); flex-shrink: 0;" id="_SeguidoresUsuario">6</span>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-grow: 0; flex-shrink: 0;">
   <label style="align-self: center;">Seguidos</label>
   <span style="background-color: gray !important; color: white !important; border-radius: 999px; padding: 2px 8px; font-size: 12px; font-weight: bold; flex-grow: 0; margin: var(--lumo-space-m);" id="_SeguidosUsuario">6</span>
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
