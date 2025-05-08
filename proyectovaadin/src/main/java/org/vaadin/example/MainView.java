package org.vaadin.example;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.dependency.CssImport;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.router.Route;

import interfaz.Administrador;
import interfaz.Banearusuario;

import interfaz.Darretweet;

import interfaz.Editarperfil;

import interfaz.Eliminarperfil;

import interfaz.Iniciarsesion;

import interfaz.Listadocomentarios;

import interfaz.ListadocomentariosAdministrador;

import interfaz.ListadocomentariosUsuarionoregistrado;

import interfaz.ListadocomentariosUsuarioregistrado;

import interfaz.Listadodehashtags;

import interfaz.Listadodeusuariosadministrador;

import interfaz.Listadodeusuariosusuarionoregistrado;

import interfaz.Listadodeusuariosusuarioregistrado;

import interfaz.Listadotweets;

import interfaz.Listadotweets_item;

import interfaz.Listadousuarios;

import interfaz.Megustas;

import interfaz.Notificaciones;

import interfaz.Usuarionoregistrado;

import interfaz.Usuarioregistrado;

import interfaz.Vercomentarios;

import interfaz.VercomentariosAdminstrador;

import interfaz.VercomentariosUsuarionoregistrado;

import interfaz.VercomentariosUsuarioregistrado;

import interfaz.Verlistadodeseguidores;

import interfaz.Verlistadodeseguidos;
import interfaz.VerlistadodetweetsfiltradoAdministrador;
import interfaz.VerlistadodetweetsfiltradoUsuarionoregistrado;
import interfaz.VerlistadodetweetsfiltradoUsuarioregistrado;
import interfaz.VerlistadoglobaldeusuariosAdministrador;

import interfaz.VerlistadoglobaldeusuariosUsuarionoregistrado;

import interfaz.VerlistadoglobaldeusuariosUsuarioregistrado;

import interfaz.Verperfildeusuario;

import interfaz.Verperfilpersonal;

import interfaz.ListadotweetsAdministrador;

import interfaz.ListadotweetsUsuarionoregistrado;

import interfaz.ListadotweetsUsuarioregistrado;

import interfaz.ListadotweetsUsuarioregistrado_item;

import interfaz.Notificacionesdeusuario;

import interfaz.Recuperarcontrasenia;

import interfaz.Registrarse;

import interfaz.Retweets;

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

	/*VerListadohashtags vlh = new VerListadohashtags();

	Listadodehashtags lth = new Listadodehashtags(vlh);

	Vermuroprincipal vmun = new Vermuroprincipal();

	Listadotweets lt = new Listadotweets(vmun);

	VermuroprincipalAdministrador vma = new VermuroprincipalAdministrador();

	ListadotweetsAdministrador lta = new ListadotweetsAdministrador(vma);

	VermuroprincipalUsuarioregistrado vmur = new VermuroprincipalUsuarioregistrado();

	ListadotweetsUsuarioregistrado ltur = new ListadotweetsUsuarioregistrado(vmur);

	VermuroprincipalUsuarionoregistrado vmurn = new VermuroprincipalUsuarionoregistrado();

	ListadotweetsUsuarionoregistrado ltun = new ListadotweetsUsuarionoregistrado(vmurn);

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

	Verperfilpersonal vpp;

	Editarperfil ep = new Editarperfil(vpp);

	Eliminarperfil eep = new Eliminarperfil(vpp);

	Registrarse r;

	Iniciarsesion is = new Iniciarsesion(r);

	Verperfildeusuario vpdu;

	Megustas mg = new Megustas(vpdu);

	Recuperarcontrasenia rc = new Recuperarcontrasenia(is);

	Registrarse re = new Registrarse(is);

	Retweets rts = new Retweets(vpdu);

	Listadousuarios lu;

	Verlistadodeseguidores vlseguidores = new Verlistadodeseguidores(lu);

	Verlistadodeseguidos vlseguidos = new Verlistadodeseguidos(lu);

	Vercomentarios vc;

	Listadocomentarios lc = new Listadocomentarios(vc);
	
	Administrador admin = new Administrador(this);
	VerlistadoglobaldeusuariosAdministrador vlgdua = new VerlistadoglobaldeusuariosAdministrador(admin);
	
	Usuarioregistrado u = new Usuarioregistrado(this);
	VerlistadoglobaldeusuariosUsuarioregistrado vlgduur = new VerlistadoglobaldeusuariosUsuarioregistrado(u);
	
	Usuarionoregistrado un = new Usuarionoregistrado(this);
	VerlistadoglobaldeusuariosUsuarionoregistrado vlgduunr = new VerlistadoglobaldeusuariosUsuarionoregistrado(un);
	
	VerlistadodetweetsfiltradoUsuarionoregistrado vldtfunr = new VerlistadodetweetsfiltradoUsuarionoregistrado(un);
	
	VerlistadodetweetsfiltradoUsuarioregistrado vldtfur = new VerlistadodetweetsfiltradoUsuarioregistrado(u);
	
	VerlistadodetweetsfiltradoAdministrador vldtfa = new VerlistadodetweetsfiltradoAdministrador(admin);
	
	VerListadohashtags vlha = new VerListadohashtags(u);
	
	VermuroprincipalAdministrador vmpad = new VermuroprincipalAdministrador(admin);
	
	VermuroprincipalUsuarionoregistrado vmpunr = new VermuroprincipalUsuarionoregistrado(un);
	
	VermuroprincipalUsuarioregistrado vmpur = new VermuroprincipalUsuarioregistrado(u);

	Notificacionesdeusuario nu = new Notificacionesdeusuario(u);
	*/
	Usuarioregistrado u = new Usuarioregistrado(this);


	public MainView(@Autowired GreetService service) {

		add(u);

	}

}