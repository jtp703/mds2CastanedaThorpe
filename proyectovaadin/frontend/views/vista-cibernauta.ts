import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/tabs/src/vaadin-tabs.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/tabs/src/vaadin-tab.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/avatar/src/vaadin-avatar.js';

@customElement('vista-cibernauta')
export class VistaCibernauta extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position:absolute; align-items: stretch;" id="contenedorPrincipal">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: center; flex-grow: 0; flex-shrink: 0;background-color: lightblue;" id="contenedorRegistro">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
   <a href="" style="align-self: center; height: 100%; flex-grow: 1; flex-shrink: 0;" id="lRegistro">Registrate en X para tener mas privilegios o inicia sesion</a>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="vaadinHorizontalLayout2">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3">
   <vaadin-tabs orientation="horizontal" selected="0" id="vaadinTabs">
    <vaadin-tab selected id="verMuroPrincipal" dir="verMuroPrincipal">
     <span id="_idMuroPrincipal" style="flex-grow: 0; flex-shrink: 0;">Muro principal</span>
    </vaadin-tab>
    <vaadin-tab id="verListadoUsuarios" selected>
     <span id="_idListadoUsuarios">Listado de usuarios</span>
    </vaadin-tab>
    <vaadin-tab id="verListadohashtags">
     <span id="_idListadoHashtags">Listado de hashtags</span>
    </vaadin-tab>
    <vaadin-tab id="verNotificacionesUsuario">
     <span id="_idNotificaciones">Notificaciones</span>
    </vaadin-tab>
   </vaadin-tabs>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; justify-content: flex-end; margin-right: var(--lumo-space-m);" id="contenedorVerPerfilPersonal">
   <vaadin-avatar id="imgPerfilPersonal" style="align-self: center;"></vaadin-avatar>
   <a href="" id="verPerfilPersonal" style="align-self: center;">@usuario</a>
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
