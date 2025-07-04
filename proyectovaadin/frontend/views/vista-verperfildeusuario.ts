import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-verperfildeusuario')
export class VistaVerperfildeusuario extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
	#headerBanner {
	  position: relative;
	  width: 100%;
	  height: 200px;              /* alto fijo coherente */
	  background-image: var(--fondo-url);
	  background-size: cover;     /* recorta/escala */
	  background-position: center;
	}
	
	#headerBanner h1 {
	  position: absolute;
	  bottom: 16px;               /* distancia desde abajo */
	  left: 24px;                 /* margen izquierdo */
	  margin: 0;
	  color: white;               /* contraste sobre la imagen */
	  text-shadow: 0 0 4px rgba(0,0,0,0.7);
	  font-size: 2rem;
	}

      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;position:absolute;" id="contenedorVerPerfil">
 <vaadin-vertical-layout theme="spacing" id="contenedorImgFondo" style="align-self: stretch;">
  <vaadin-vertical-layout theme="spacing" id="contenedorImgPerfil" style="align-items: center; flex-grow: 0; align-self: center;">
   <div id="headerBanner">
    <h1 id="nombreUsuario" style="align-self: center;">Heading 1</h1>
    <img id="imgFondo">
   </div>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-shrink: 0;">
  <img id="imgPerfil" style="align-self: center;">
  <vaadin-horizontal-layout style="flex-grow: 0; align-self: center; flex-shrink: 0;" id="perfilLayout">
   <h3 id="nickUsuario">Heading 3</h3>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; margin-left: var(--lumo-space-m); margin-right: var(--lumo-space-l);">
  <vaadin-button id="btnVolver" style="align-self: center;" tabindex="0">
    volver 
  </vaadin-button>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-button id="btnSeguir" style="align-self: stretch;" tabindex="0" vaadin-icon="" icon="vaadin:check">
     Seguir 
   </vaadin-button>
   <vaadin-button tabindex="0" id="btnBloquear" style="align-self: stretch;">
     Bloquear 
   </vaadin-button>
   <vaadin-button tabindex="0" id="btnBanearUsuario" style="align-self: stretch;">
     Banear 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; width: 50%;">
   <vaadin-horizontal-layout style="align-self: center; justify-content: flex-end; flex-grow: 1;">
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
   <vaadin-horizontal-layout style="justify-content: flex-end; flex-grow: 0; align-self: center; padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">
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
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; justify-content: flex-end;">
   <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 0;">
    <vaadin-button id="btnEditarPerfil" style="align-self: stretch;" tabindex="0">
      Editar perfil 
    </vaadin-button>
    <vaadin-button tabindex="0" id="btnEliminarPerfil" style="align-self: stretch;">
      Eliminar perfil 
    </vaadin-button>
    <vaadin-button tabindex="0" id="btnCerrarSesion" style="align-self: stretch;">
      Cerrar sesion 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch;">
  <p id="descripcionPerfil" style="align-self: center;">Paragraph</p>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; margin-left: var(--lumo-space-m);">
   <vaadin-button id="verPosts" tabindex="0">
     Posts 
   </vaadin-button>
   <vaadin-button tabindex="0" id="verRetweets">
     Retweets 
   </vaadin-button>
   <vaadin-button tabindex="0" id="verMegustas">
     Me gustas 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="contenedorListadotweets" style="align-self: stretch; flex-grow: 1;border: 2px solid #888;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
