import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/text-area/src/vaadin-text-area.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-registrarse')
export class VistaRegistrarse extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;position:absolute;" id="contenedorRegistrarse">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-grow: 1;">
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <h1>Registrate para acceder a X</h1>
   <vaadin-text-field id="correo" type="text" label="Correo electronico"></vaadin-text-field>
   <vaadin-text-field type="text" id="nickUsuario" label="Nick de usuario"></vaadin-text-field>
   <vaadin-text-field type="text" id="imgPerfil" label="Foto de perfil"></vaadin-text-field>
   <vaadin-text-field type="text" id="imgFondo" label="Imagen de fondo"></vaadin-text-field>
   <vaadin-text-area id="descripción" label="Descripcion"></vaadin-text-area>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field type="text" id="contrasenia" label="Contraseña"></vaadin-text-field>
    <vaadin-vertical-layout theme="spacing">
     <span style="align-self: center;">Debe contener entre 8 y 14 caracteres, una</span>
     <span style="align-self: flex-start;">letra mayúscula y un caracter especial </span>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button id="btnVolver" tabindex="0">
     Volver
    </vaadin-button>
    <vaadin-button tabindex="0" id="btnRegistrarse">
     Acceder a X
    </vaadin-button>
    <a href="https://vaadin.com" id="iniciarSesion" style="align-self: center;">Inicia sesión aqui</a>
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
