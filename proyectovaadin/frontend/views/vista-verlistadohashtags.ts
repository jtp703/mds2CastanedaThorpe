import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-verlistadohashtags')
export class VistaVerlistadohashtags extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 100%; height: 100%; position:absolute; align-items: stretch;" id="panelPrincipal">
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: center; flex-grow: 0; flex-shrink: 0;background-color: lightblue;" id="vaadinHorizontalLayout">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
    <a href="" style="align-self: center; height: 100%; flex-grow: 1; flex-shrink: 0;" id="lRegistro">Registrate en X para tener mas privilegios o inicia sesion</a>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="vaadinHorizontalLayout2">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3">
    <vaadin-tabs orientation="horizontal" selected="0" id="vaadinTabs">
     <vaadin-tab selected id="vaadinTab">
      <span id="_idListadoHashtags" style="flex-grow: 0; flex-shrink: 0;">Listado de hashtag</span>
     </vaadin-tab>
     <vaadin-tab id="vaadinTab1">
      <span id="_idListadoUsuarios">Listado de usuarios</span>
     </vaadin-tab>
     <vaadin-tab id="vaadinTab2">
      <span id="_idMuroPrincipal">Muro principal</span>
     </vaadin-tab>
     <vaadin-tab id="vaadinTab3">
      <span id="_idNotificaciones">Notificaciones</span>
     </vaadin-tab>
    </vaadin-tabs>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; justify-content: flex-end;" id="vaadinHorizontalLayout4">
    <vaadin-vertical-layout style="align-self: flex-end; align-items: flex-end; padding-right: var(--lumo-space-l);" id="panelVerPerfil">
     <a href="" id="_verPerfil">@usuario</a>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <vista-listadodehashtags_item></vista-listadodehashtags_item>
    <div></div>
    <vista-listadodehashtags_item></vista-listadodehashtags_item>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
