import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/avatar/src/vaadin-avatar.js';
import '@vaadin/icons';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/icon/src/vaadin-icon.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listadocomentarios_item')
export class VistaListadocomentarios_item extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="Contenedorcontenido">
 <vaadin-horizontal-layout theme="spacing" style="padding-bottom: var(--lumo-space-xs); padding: var(--lumo-space-xs); margin-top: var(--lumo-space-s); padding-left: var(--lumo-space-s); flex-grow: 0; flex-shrink: 0; align-self: stretch;" id="vaadinHorizontalLayout">
  <vaadin-avatar id="vaadinAvatar"></vaadin-avatar>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;">
   <vaadin-button id="verperfil" tabindex="0" style="flex-shrink: 0; flex-grow: 0;">
     usuario 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <button style="flex-shrink: 1; flex-grow: 0;" id="botonEliminarComentario">Eliminar comentario</button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0;" id="vaadinHorizontalLayout2">
  <vaadin-vertical-layout style="flex-grow: 1; flex-shrink: 1; margin: var(--lumo-space-m);" id="vaadinVerticalLayout1">
   <p id="textoComentario" style="margin-left: var(--lumo-space-l); flex-shrink: 0;">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially u</p>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-shrink: 1; flex-grow: 0; flex-wrap: wrap; align-self: center;" id="vaadinVerticalLayout2">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="flex-grow: 0; flex-shrink: 0; margin-right: var(--lumo-space-m); padding-right: var(--lumo-space-l);">
    <vaadin-icon style="flex-grow: 0; flex-shrink: 0;" icon="vaadin:heart" id="btnDarMegusta" size="16"></vaadin-icon>
    <label id="nMegustas">0</label>
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
