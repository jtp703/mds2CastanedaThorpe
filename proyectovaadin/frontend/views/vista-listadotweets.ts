import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-area/src/vaadin-text-area.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/select/src/vaadin-select.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';

@customElement('vista-listadotweets')
export class VistaListadotweets extends LitElement {
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
<vaadin-vertical-layout theme="spacing-s" style="display: flex; flex-direction: column; flex: 1 1 auto; overflow-y: auto; /* aquí aparece el scroll cuando hay muchos items */
height: 100%; /* rellena la pantalla */
box-sizing: border-box; width: 100%;" id="contenedorListadoTweets">
 <vaadin-vertical-layout theme="spacing" id="contenedorNuevoTweet" style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-horizontal-layout style="flex-grow: 0; margin: var(--lumo-space-m); align-self: flex-start;" id="perfilLayout">
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; justify-content: flex-end; margin-right: var(--lumo-space-m);" id="contenedorVerPerfilPersonal">
     <vaadin-avatar id="imgPerfilPersonal" style="align-self: center;"></vaadin-avatar>
     <vaadin-button id="verPerfilPersonal" tabindex="0" style="align-self: center;">
       @usuario 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-text-area style="flex-grow: 1;" placeholder="¿Qué esta pasando?" id="textoTweet"></vaadin-text-area>
   <vaadin-button id="btnEnviarTweet" style="align-self: center;" tabindex="0">
     Enviar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="margin-right: var(--lumo-space-m); align-self: center;">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field id="url1" style="align-self: center;" type="text" label="Url 1">
      TextText 
    </vaadin-text-field>
    <vaadin-select id="select1" style="align-self: flex-end;">
      imagenvideo 
    </vaadin-select>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
    <vaadin-text-field style="align-self: center;" type="text" label="Url 2" id="url2">
      TextText 
    </vaadin-text-field>
    <vaadin-select style="align-self: flex-end;" id="select2">
      imagenvideo 
    </vaadin-select>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
<<<<<<< HEAD
 <vaadin-vertical-layout theme="spacing-s" id="contenedorListadoTweets_item" style="flex: 1 1 auto;      /* flex-grow:1; flex-shrink:1; flex-basis:auto */
width: 80%;
max-width: 80%;
align-self: center;
/* quitamos height:100% para que la altura sea la del contenido */
height: auto;
/* quitamos el overflow—lo gestiona el padre con scroll */
overflow: visible;
box-sizing: border-box;"></vaadin-vertical-layout>
=======
 <vaadin-vertical-layout theme="spacing-s" id="contenedorListadoTweets_item" style="flex-grow: 1; width: 100%; height: 100%; align-self: center;"></vaadin-vertical-layout>
>>>>>>> branch 'vistaListasDiego' of git@github.com:jtp703/mds2CastanedaThorpe.git
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
