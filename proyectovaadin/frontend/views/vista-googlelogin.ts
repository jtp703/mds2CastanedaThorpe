import { LitElement, html, css, customElement } from 'lit-element';
import './vista-eliminarperfil';

@customElement('vista-googlelogin')
export class VistaGooglelogin extends LitElement {
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
<vista-eliminarperfil></vista-eliminarperfil>
<div id="div" style="width: 100%; height: 100%;">
  Div 
</div>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
