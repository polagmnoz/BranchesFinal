import processing.core.PApplet;
import processing.core.PImage;

public class Cargar {
//
	private PApplet app;
	private PImage cargarCalaverita;
	private PImage [] kuleshov;
	private PImage [] abrir, revUnoF, cajonFlotante, abreCajon, acercaCajon; 
	private PImage champUno, champDos, pote;
	private int champ;
	//Pantalla Fotos
	private PImage fondo, fotoUno, fotoDos, fotoTres, fotoCuatro, fotoCinco, fotoSeis, fotoSiete, fotoOcho, llave;


	public Cargar(PApplet app) {
		this.app = app;
		cargarKuleshov();
		cargarCajonAbrir();
		cargarFondo();
		cargarCajonF();
		cargarAbreCajon();
		cargarAcercarCajon();
		cargarChampinones();
		cargarPote();
		cargarFotos();
	}


	//-------PANTALLA CAJÓN FLOTANDO---------//
	public void cargarCajonAbrir() {
		abrir = new PImage[12];
		for (int i = 0; i < abrir.length; i++) {
			abrir[i] = app.loadImage("../data/CajonAbrir/CajonAbrir_" + i + ".png");
		}
	}

	public void cargarFondo() {
		revUnoF = new PImage[8];
		for (int i = 0; i < revUnoF.length; i++) {
			revUnoF[i] = app.loadImage("../data/Revision1/rev1_" + i + ".png");

		}
	}

	public void cargarCajonF() {
		cajonFlotante = new PImage[30];
		for (int i = 0; i < cajonFlotante.length; i++) {
			cajonFlotante[i] = app.loadImage("../data/CajonFlotando/CajonFlotando_" + i + ".png");

		}
	}

	public void cargarAbreCajon() {
		abreCajon = new PImage[14];
		for (int i = 0; i < abreCajon.length; i++) {
			abreCajon[i] = app.loadImage("../data/AbreCajon/AbreCajon_" + i + ".png");
		}
	}

	public void cargarAcercarCajon() {
		acercaCajon = new PImage[17];
		System.out.println(app);
		for (int i = 0; i < acercaCajon.length; i++) {
			acercaCajon[i] = app.loadImage("../data/CajonAcercar/CajonAcercar_" + i + ".png");
		}
	}
	
	// -----------------PANTALLA CHAMP. REV DOS----------------------//
	public void cargarChampinones() {
			champUno = app.loadImage("../data/PantallaArbol/champUno.png");
			champDos = app.loadImage("../data/PantallaArbol/champDos.png");
	}
	
	public void cargarPote() {
		pote = app.loadImage("../data/PantallaArbol/pote.png");
}
	
	// -----------------------PANTALLA KULESHOV ------------------//
	public void cargarKuleshov() {
		kuleshov = new PImage[1];
		for (int i = 0; i < kuleshov.length; i++) {
			kuleshov[i] = app.loadImage("../data/kuleshov_prueba_" + i + ".png");
		}
	}
	
	//-----------------PANTALLA FOTOS------------//
	public void cargarFotos (){
		fondo = app.loadImage("../data/PantallaFotos/fondo.png");
		fotoUno = app.loadImage("../data/PantallaFotos/fotoUno.png");
		fotoDos = app.loadImage("../data/PantallaFotos/fotoDos.png");
		fotoTres = app.loadImage("../data/PantallaFotos/fotoTres.png");
		fotoCuatro = app.loadImage("../data/PantallaFotos/fotoCuatro.png");
		fotoCinco = app.loadImage("../data/PantallaFotos/fotoCinco.png");
		fotoSeis = app.loadImage("../data/PantallaFotos/fotoSeis.png");
		fotoSiete = app.loadImage("../data/PantallaFotos/fotoSiete.png");
		fotoOcho = app.loadImage("../data/PantallaFotos/fotoOcho.png");
		llave = app.loadImage("../data/PantallaFotos/llave.png");
	}

	//-------------GETTERS Y SETTERS------------//
	public PImage getCargarCalaverita() {
		return cargarCalaverita;
	}

	public void setCargarCalaverita(PImage cargarCalaverita) {
		this.cargarCalaverita = cargarCalaverita;
	}

	public PImage[] getKuleshov() {
		return kuleshov;
	}

	public void setKuleshov(PImage[] kuleshov) {
		this.kuleshov = kuleshov;
	}

	public PImage[] getAbrir() {
		return abrir;
	}

	public void setAbrir(PImage[] abrir) {
		this.abrir = abrir;
	}

	public PImage[] getRevUnoF() {
		return revUnoF;
	}

	public void setRevUnoF(PImage[] revUnoF) {
		this.revUnoF = revUnoF;
	}

	public PImage[] getCajonFlotante() {
		return cajonFlotante;
	}

	public void setCajonFlotante(PImage[] cajonFlotante) {
		this.cajonFlotante = cajonFlotante;
	}

	public PImage[] getAbreCajon() {
		return abreCajon;
	}

	public void setAbreCajon(PImage[] abreCajon) {
		this.abreCajon = abreCajon;
	}

	public PImage[] getAcercaCajon() {
		return acercaCajon;
	}

	public void setAcercaCajon(PImage[] acercaCajon) {
		this.acercaCajon = acercaCajon;
	}

	public PImage getChampUno() {
		return champUno;
	}

	public void setChampUno(PImage champUno) {
		this.champUno = champUno;
	}

	public PImage getChampDos() {
		return champDos;
	}

	public void setChampDos(PImage champDos) {
		this.champDos = champDos;
	}

	public int getChamp() {
		return champ;
	}

	public void setChamp(int champ) {
		this.champ = champ;
	}


	public PImage getFondo() {
		return fondo;
	}


	public void setFondo(PImage fondo) {
		this.fondo = fondo;
	}


	public PImage getFotoUno() {
		return fotoUno;
	}


	public void setFotoUno(PImage fotoUno) {
		this.fotoUno = fotoUno;
	}


	public PImage getFotoDos() {
		return fotoDos;
	}


	public void setFotoDos(PImage fotoDos) {
		this.fotoDos = fotoDos;
	}


	public PImage getFotoTres() {
		return fotoTres;
	}


	public void setFotoTres(PImage fotoTres) {
		this.fotoTres = fotoTres;
	}


	public PImage getFotoCuatro() {
		return fotoCuatro;
	}


	public void setFotoCuatro(PImage fotoCuatro) {
		this.fotoCuatro = fotoCuatro;
	}


	public PImage getFotoCinco() {
		return fotoCinco;
	}


	public void setFotoCinco(PImage fotoCinco) {
		this.fotoCinco = fotoCinco;
	}


	public PImage getFotoSeis() {
		return fotoSeis;
	}


	public void setFotoSeis(PImage fotoSeis) {
		this.fotoSeis = fotoSeis;
	}


	public PImage getFotoSiete() {
		return fotoSiete;
	}


	public void setFotoSiete(PImage fotoSiete) {
		this.fotoSiete = fotoSiete;
	}


	public PImage getFotoOcho() {
		return fotoOcho;
	}


	public void setFotoOcho(PImage fotoOcho) {
		this.fotoOcho = fotoOcho;
	}


	public PImage getLlave() {
		return llave;
	}


	public void setLlave(PImage llave) {
		this.llave = llave;
	}


	public PImage getPote() {
		return pote;
	}


	public void setPote(PImage pote) {
		this.pote = pote;
	}
	
	

	// --------------FINAL DE LA CLASE CARGAR------------//
}