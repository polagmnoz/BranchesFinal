import processing.core.PApplet;
import processing.core.PImage;

public class Cajon extends Thread {

	private PApplet app;
	private Mundo m;
	private int pantalla, cajon;
	private boolean vivo;
	private PImage[] abrir, cajonFlotante, abreCajon, acercaCajon;
	private int numFrame, numFrameAcerca, numFrameAbrir, numFrameAC;

	public Cajon(PApplet app, Mundo m) {
		this.app = app;
		this.m = m;
		cargar();
		iniciarVariables();
	}

	public void cargar() {
		abrir = m.getCargar().getAbrir();
		cajonFlotante = m.getCargar().getCajonFlotante();
		abreCajon = m.getCargar().getAbreCajon();
		acercaCajon = m.getCargar().getAcercaCajon();
	}

	public void iniciarVariables() {
		vivo = true;
		pantalla = m.getPantalla();
		cajon = m.getCajon();
	}

	@Override
	public void run() {
		while (vivo) {
			try {
				calculo();
				sleep(33);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void calculo() {
		// System.out.println("Pantalla: " + m.getPantalla());
		switch (m.getPantalla()) {
		case 1:
			calculoCajonFlotante();
			break;
		case 2:
			calculoAcercaCajon();
			break;
		case 3:

			switch (m.getCajon()) {
			case 0:
				calculoPintarAbrir();
				break;
			case 1:
				calculoPintarAbrirCajon();
				if (numFrameAC >= 12) {
					// liss.pintar(app);
					// lib.pintar(app);
					// champPrin.pintar(app);
				}
				break;
			}

			break;
		}

	}

	public void calculoCajonFlotante() {
		if (app.frameCount % 5 == 0) {
			numFrame++;
			if (numFrame >= 28) {
				numFrame = 0;
			}
		}
	}

	public void calculoAcercaCajon() {
		if (app.frameCount % 5 == 0 && numFrameAcerca != 16) {
			if (numFrameAcerca <= 16) {
				numFrameAcerca++;
			}
		} else if (numFrameAcerca >= 16) {
			numFrameAcerca = 16;
		}
	}

	public void calculoPintarAbrir() {
		if (app.frameCount % 5 == 0 && numFrameAbrir != 11) {
			if (numFrameAbrir <= 11) {
				numFrameAbrir++;
			}
		} else if (numFrameAbrir >= 11) {
			numFrameAbrir = 11;
		}
	}

	public void calculoPintarAbrirCajon() {
		if (app.frameCount % 5 == 0 && numFrameAC != 13) {
			if (numFrameAC <= 13) {
				numFrameAC++;
			}
		} else if (numFrameAC >= 13) {
			numFrameAC = 13;
		}
	}

	// ---------PINTAR-------//
	public void pintarCajonFlotante() {
		cajonFlotante = m.getCargar().getCajonFlotante();
		app.image(cajonFlotante[numFrame], app.width / 2, app.height / 2);
	}

	public void pintarAcercarCajon() {
		app.image(acercaCajon[numFrameAcerca], app.width / 2, app.height / 2);
	}

	public void pintarAbrirCajon() {
		app.image(abreCajon[numFrameAC], app.width / 2, app.height / 2);
	}

	public void pintarAbrir() {
		app.image(abrir[numFrameAbrir], app.width / 2, app.height / 2);
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
}
