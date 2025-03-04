import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cibernauta';

@customElement('vista-darretweet')
export class VistaDarretweet extends LitElement {
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
<vista-cibernauta></vista-cibernauta>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
