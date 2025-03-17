import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/avatar/src/vaadin-avatar.js';
import '@vaadin/text-area/src/vaadin-text-area.js';
import '@vaadin/icons';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/icon/src/vaadin-icon.js';

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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 5%; padding-bottom: var(--lumo-space-xs); padding: var(--lumo-space-xs); margin-top: var(--lumo-space-s); padding-left: var(--lumo-space-s);" id="vaadinHorizontalLayout">
  <vaadin-avatar id="vaadinAvatar"></vaadin-avatar>
  <a href="https://vaadin.com" style="flex-shrink: 0; flex-grow: 1;" usuario="" id="a">@usuario</a>
  <button style="flex-shrink: 1; flex-grow: 0;" id="_idEliminarComentario">Eliminar comentario</button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="flex-shrink: 0; flex-grow: 0; width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 20%;" id="vaadinHorizontalLayout2">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 90%;" id="vaadinVerticalLayout1">
    <vaadin-text-area placeholder="Este es un ejemplo de un comentario" style="width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0; padding-left: var(--lumo-space-s);" id="vaadinTextArea"></vaadin-text-area>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; flex-grow: 1; align-items: center; width: 5%; justify-content: center; flex-wrap: wrap;" id="vaadinVerticalLayout2">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3">
     <vaadin-icon style="flex-grow: 0; flex-shrink: 0;" icon="vaadin:heart" id="_idMg" size="16"></vaadin-icon>
     <span id="_numLikes">0</span>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
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
