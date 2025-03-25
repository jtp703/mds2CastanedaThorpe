import { LitElement, html, css, customElement } from 'lit-element';
import './vista-listadotweets_item';
import './vista-listadocomentarios_item';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listadocomentarios')
export class VistaListadocomentarios extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; position:absolute;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-shrink: 0; flex-grow: 1; flex-direction: column;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 0; flex-grow: 1; flex-direction: column;" id="vaadinHorizontalLayout">
   <vista-listadotweets_item style="flex-shrink: 0;" id="vistaListadotweets_item"></vista-listadotweets_item>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%;" id="vaadinHorizontalLayout1">
   <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; flex-grow: 1;" id="vaadinVerticalLayout2">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0;" id="vaadinHorizontalLayout3">
     <vista-listadocomentarios_item style="width: 100%; flex-shrink: 0;" id="vistaListadocomentarios_item"></vista-listadocomentarios_item>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0;" id="vaadinHorizontalLayout4">
     <vista-listadocomentarios_item style="width: 100%; flex-shrink: 0;" id="vistaListadocomentarios_item1"></vista-listadocomentarios_item>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
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
