package org.vaadin.example;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import interfaz.Banearusuario;
import interfaz.Darretweet;
import interfaz.ListadocomentariosAdministrador;
import interfaz.ListadocomentariosUsuarionoregistrado;
import interfaz.ListadocomentariosUsuarioregistrado;
import interfaz.Listadodehashtags;
import interfaz.Listadodeusuariosadministrador;
import interfaz.Listadodeusuariosusuarionoregistrado;
import interfaz.Listadodeusuariosusuarioregistrado;
import interfaz.Listadotweets;
import interfaz.Listadotweets_item;
import interfaz.Usuarionoregistrado;
import interfaz.Usuarioregistrado;
import interfaz.Vercomentarios;
import interfaz.VercomentariosAdminstrador;
import interfaz.VercomentariosUsuarionoregistrado;
import interfaz.VercomentariosUsuarioregistrado;
import interfaz.VerlistadoglobaldeusuariosAdministrador;
import interfaz.VerlistadoglobaldeusuariosUsuarionoregistrado;
import interfaz.VerlistadoglobaldeusuariosUsuarioregistrado;
import interfaz.Verperfildeusuario;
import interfaz.ListadotweetsAdministrador;
import interfaz.ListadotweetsUsuarionoregistrado;
import interfaz.ListadotweetsUsuarioregistrado;
import interfaz.ListadotweetsUsuarioregistrado_item;
import interfaz.Notificacionesdeusuario;
import interfaz.VerListadohashtags;
import interfaz.Vermuroprincipal;
import interfaz.VermuroprincipalAdministrador;
import interfaz.VermuroprincipalUsuarionoregistrado;
import interfaz.VermuroprincipalUsuarioregistrado;
import interfaz.VerperfilAdministrador;

@Route
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {
	// Cibernauta cb = new Cibernauta(this);

	VerListadohashtags vlh = new VerListadohashtags();
	Listadodehashtags lth = new Listadodehashtags(vlh);

	Vermuroprincipal vmun = new Vermuroprincipal();
	Listadotweets lt = new Listadotweets(vmun);

	VermuroprincipalAdministrador vma = new VermuroprincipalAdministrador();
	ListadotweetsAdministrador lta = new ListadotweetsAdministrador(vma);

	VermuroprincipalUsuarioregistrado vmur = new VermuroprincipalUsuarioregistrado();
	ListadotweetsUsuarioregistrado ltur = new ListadotweetsUsuarioregistrado(vmur);

	VermuroprincipalUsuarionoregistrado vmurn = new VermuroprincipalUsuarionoregistrado();
	ListadotweetsUsuarionoregistrado ltun = new ListadotweetsUsuarionoregistrado(vmurn);

	Notificacionesdeusuario nu = new Notificacionesdeusuario();
	
	VercomentariosUsuarionoregistrado vcun;
	ListadocomentariosUsuarionoregistrado lcun = new ListadocomentariosUsuarionoregistrado(vcun);
	
	VercomentariosAdminstrador vca;
	ListadocomentariosAdministrador lca = new ListadocomentariosAdministrador(vca);
	
	VercomentariosUsuarioregistrado vcur;
	ListadocomentariosUsuarioregistrado lcur = new ListadocomentariosUsuarioregistrado(vcur);	
	
	VerlistadoglobaldeusuariosAdministrador vlgua;
	Listadodeusuariosadministrador lua = new Listadodeusuariosadministrador(vlgua);
	
	VerlistadoglobaldeusuariosUsuarioregistrado vlguur;
	Listadodeusuariosusuarioregistrado luur = new Listadodeusuariosusuarioregistrado(vlguur);
	
	VerlistadoglobaldeusuariosUsuarionoregistrado vlguunr;
	Listadodeusuariosusuarionoregistrado luunr = new Listadodeusuariosusuarionoregistrado(vlguunr);
	
	ListadotweetsUsuarioregistrado_item lturi;
	Darretweet dr = new Darretweet(lturi);
	
	VerperfilAdministrador vpa;
	Banearusuario bu = new Banearusuario(vpa);
	
	public MainView(@Autowired GreetService service) {

		add(bu);

	}

}
