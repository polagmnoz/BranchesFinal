
import processing.core.PApplet;
import processing.core.PImage;

public class Calaverita implements Runnable {

	private PImage[] calavIzq, calavDer;
	private PImage c;
	private float x, y;
	private boolean viendo;
	private boolean abrir;
	private Mundo m;
	private PApplet app;
	private int numFrame;

	public Calaverita(Mundo m, float x, float y) {
		this.m = m;
		this.x = x;
		this.y = y;
		cargarCalaverita();
		numFrame= 0;
	}

	public void cargarCalaverita() {
		m.getCargar().getCalaverasIz();
		m.getCargar().getCalaverasDer();
	}

	/*
	 * Método que nos pintara el personaje
	 */
	public void pintar(PApplet app) {
		this.app = app;
		app.rect(x, y, 100, 100);
		// app.image(c, x, y);
	}

	/*
	 * Método que correrá el hilo de nuestras animaciones y movimiento de los
	 * personajes
	 */
	public void run() {

	}

	/*
	 * Método que tendra un for que correrá las imágenes del arreglo y animará
	 * el personaje
	 */
	public void animarIz() {
		if (app.frameCount % 5 == 0) {
			numFrame++;
			if (numFrame >= 28) {
				numFrame = 0;
			}
		}
	}

	/*
	 * Metodo que contendrá la animación de cuando se abre la puerta
	 */
	public void abrirPuerta() {

	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

}
