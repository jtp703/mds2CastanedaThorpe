import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/tabs/src/vaadin-tabs.js';
import '@vaadin/tabs/src/vaadin-tab.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: center; flex-grow: 0; flex-shrink: 0;background-color: lightblue;" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
   <a href="" style="align-self: center; height: 100%; flex-grow: 1; flex-shrink: 0;" id="a">Registrate en X para tener mas privilegios o inicia sesion</a>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="vaadinHorizontalLayout2">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3">
   <vaadin-tabs orientation="horizontal" selected="0" id="vaadinTabs">
    <vaadin-tab selected id="vaadinTab">
     <iron-icon id="ironIcon"></iron-icon>
     <span id="_idMuroPrincipal" style="flex-grow: 0; flex-shrink: 0;">Muro principal</span>
    </vaadin-tab>
    <vaadin-tab id="vaadinTab1">
     <iron-icon icon="lumo:user" id="ironIcon1"></iron-icon>
     <span id="_idListadoUsuarios">Listado de usuarios</span>
    </vaadin-tab>
    <vaadin-tab id="_idListadoHashtags">
     <iron-icon icon="#" id="ironIcon2"></iron-icon>
     <span id="span">Listado de hashtahgs</span>
    </vaadin-tab>
    <vaadin-tab id="vaadinTab2">
     <iron-icon icon="lumo:bell" id="ironIcon3"></iron-icon>
     <span id="_idNotificaciones">Notificaciones</span>
    </vaadin-tab>
   </vaadin-tabs>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; justify-content: flex-end;" id="vaadinHorizontalLayout4">
   <vaadin-vertical-layout style="align-self: flex-end; align-items: flex-end; padding-right: var(--lumo-space-l);" id="vaadinVerticalLayout1">
    <vaadin-button theme="icon" aria-label="Add new" tabindex="0" style="flex-grow: 0; align-self: center;border-radius: 20px;" id="vaadinButton">
     <iron-icon icon="lumo:user" style="round" id="ironIcon4"></iron-icon>
    </vaadin-button>
    <a href="" id="a1">@usuario</a>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="vaadinHorizontalLayout5">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout6">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="vaadinVerticalLayout2"></vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="vaadinVerticalLayout3"></vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="vaadinVerticalLayout4"></vaadin-vertical-layout>
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
