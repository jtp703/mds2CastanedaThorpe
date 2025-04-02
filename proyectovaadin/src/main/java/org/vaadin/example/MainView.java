package org.vaadin.example;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import interfaz.Listadodehashtags;
import interfaz.Listadotweets;
import interfaz.ListadotweetsAdministrador;
import interfaz.ListadotweetsUsuarionoregistrado;
import interfaz.ListadotweetsUsuarioregistrado;
import interfaz.Notificacionesdeusuario;
import interfaz.VerListadohashtags;
import interfaz.Vermuroprincipal;
import interfaz.VermuroprincipalAdministrador;
import interfaz.VermuroprincipalUsuarionoregistrado;
import interfaz.VermuroprincipalUsuarioregistrado;

@Route
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {	
	//Cibernauta cb = new Cibernauta(this);
	
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
	
    public MainView(@Autowired GreetService service) {
    	
        add(ltun);
    	
        
    }
    
    

}
