import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import './vista-listadotweets_item';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import './vista-listadousuarios_item';

@customElement('vista-notificaciones_item')
export class VistaNotificaciones_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;position:absolute;" id="_layoutNotificacionUsuario">
 <vaadin-vertical-layout theme="spacing" id="_LayoutRetweetUsuario" style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout theme="spacing-l" style="align-self: stretch;background-color: #f0f0f0;">
   <a href="" id="_verPerfilRetweet" style="flex-grow: 0; align-self: center;">@usuario</a>
   <vaadin-icon style="align-self: center; flex-grow: 0; flex-shrink: 0;" icon="vaadin:retweet" size="16"></vaadin-icon>
   <label>te ha retweeteado</label>
  </vaadin-horizontal-layout>
  <vista-listadotweets_item></vista-listadotweets_item>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="_LayoutMegustaUsuario">
  <vaadin-horizontal-layout theme="spacing-l" style="align-self: stretch;background-color: #f0f0f0;">
   <a href="" id="_verPerfilMegusta" style="flex-grow: 0; align-self: center;">@usuario</a>
   <vaadin-icon style="align-self: center;" icon="vaadin:heart" size="16"></vaadin-icon>
   <label>te ha dado me gusta</label>
  </vaadin-horizontal-layout>
  <vista-listadotweets_item></vista-listadotweets_item>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="_LayoutSeguimientoUsuario">
  <vaadin-horizontal-layout theme="spacing-l" style="align-self: stretch;background-color: #f0f0f0;">
   <a href="" id="_verPerfilSeguidor" style="flex-grow: 0; align-self: center;">@usuario</a>
   <vaadin-icon style="align-self: center;" icon="vaadin:heart" size="16"></vaadin-icon>
   <label>te ha seguido</label>
  </vaadin-horizontal-layout>
  <vista-listadousuarios_item></vista-listadousuarios_item>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="_LayoutMencionUsuario">
  <vaadin-horizontal-layout theme="spacing-l" style="align-self: stretch;background-color: #f0f0f0;">
   <a href="" id="_verPerfilMencion" style="flex-grow: 0; align-self: center;">@usuario</a>
   <vaadin-icon style="align-self: center; flex-grow: 0; flex-shrink: 0;" icon="vaadin:retweet" size="16"></vaadin-icon>
   <label>te ha mencionado</label>
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
