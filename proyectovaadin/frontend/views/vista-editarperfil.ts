import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/text-field/src/vaadin-text-field.js';
import '@vaadin/text-area/src/vaadin-text-area.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-editarperfil')
export class VistaEditarperfil extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-xl); position:absolute;" id="contenedorEditarPerfil">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-self: stretch; flex-grow: 0; justify-content: center;">
  <h1 style="flex-grow: 0;">Editar perfil de usuario registrado</h1>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center;">
  <vaadin-text-field label="Nick de usuario" id="_nickUsuario" style="width: 40%;" type="text"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center;">
  <vaadin-text-field label="Nombre de usuario" type="text" id="_NombreUsuario" style="width: 40%;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center;">
  <vaadin-text-field label="Contraseña" type="text" id="_contraUsuario" style="width: 40%;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center;">
  <vaadin-text-field label="Foto de perfil" placeholder="Introduce la url de tu imagen" type="text" id="_UrlImagenPerfil" style="width: 40%;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center;">
  <vaadin-text-field label="Imagen de fondo" placeholder="Introduce la url de tu imagen" type="text" id="_UrlImagenFondo" style="width: 40%;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center;">
  <vaadin-text-area label="Descripcion de tu perfil" id="_DescripcionPerfil" style="width: 40%;"></vaadin-text-area>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <vaadin-button id="btnVolver" tabindex="0">
   Volver
  </vaadin-button>
  <vaadin-button id="btnGuardar" tabindex="0">
   Guardar
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
