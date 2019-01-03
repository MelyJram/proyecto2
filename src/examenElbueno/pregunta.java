package examenElbueno;

public class pregunta {
	int index;
	String pregunta;
	String respuestaCorrecta;
	
	
	public pregunta() {
		pregunta = "";
		respuestaCorrecta = "";
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}

	@Override
	public String toString() {
		return "pregunta [index=" + index + ", pregunta=" + pregunta + ", respuestaCorrecta=" + respuestaCorrecta + "]";
	}
	
	 
	
}
