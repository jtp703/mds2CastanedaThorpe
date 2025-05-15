package org.vaadin.example;

import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.Component;
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


    public static class Pantalla{
		public static VerticalLayout MainView;

	    public static Stack<Component> pilaVistas = new Stack<>();
	    
	    public static void cambiarVista(Component nuevaVista) {
            if (MainView != null && MainView.getComponentCount() > 0) {
                pilaVistas.push(MainView.getComponentAt(0));
                MainView.removeAll();
                MainView.add(nuevaVista);
            }
        }

        public static void volver() {
            if (!pilaVistas.isEmpty()) {
                Component vistaAnterior = pilaVistas.pop();
                MainView.removeAll();
                MainView.add(vistaAnterior);
            } else {
                System.out.println("⚠ No hay vista anterior en la pila.");
            }
        }
    	    
    	    

    }
    public Usuarioregistrado usuarioregistrado = new Usuarioregistrado(this);
    public Administrador administrador = new Administrador(this);
    public Usuarionoregistrado usuarionoregistrado = new Usuarionoregistrado(this);

    @Autowired
    public MainView(GreetService service) {
        add(usuarionoregistrado);
        Pantalla.MainView = this;
    }
}

