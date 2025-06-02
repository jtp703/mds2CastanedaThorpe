package base_de_datos;

import base_de_datos.BDPrincipal;
import java.util.Vector;
import base_de_datos.Documento;

public class BD_Documentos {
	public BDPrincipal _bD_principal;
	public Vector<Documento> _contiene_documentos = new Vector<Documento>();

	public void addDocumento(String aDocumentos, String aTipo, int aIdTweet) {
		throw new UnsupportedOperationException();
	}
}