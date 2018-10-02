package ar.edu.unlam.pb2.Cerradura14;

public class Cerradura14 {
	//Atributes
	private Integer claveCorrecta;
	private Integer nroIntentos;
	private Boolean estado=false;
	private Boolean fueBloqueada=false;
	private Integer intentosExitosos=0;
	private Integer intentosFallidos=0;
	
	//Constructor
	public Cerradura14(Integer clave, Integer intentos) {
		this.claveCorrecta = clave;
		this.nroIntentos = intentos;
	}
	//Methods
	public boolean estadoCerradura() {
		return this.estado;
	}
	
	public boolean abrir(Integer clave) {
		if (this.claveCorrecta.equals(clave) && fueBloqueada==false && estado==false) {
			this.estado = true;
			this.intentosExitosos+=1;
			this.intentosFallidos=0;
		} else {
			if(this.intentosFallidos>=this.nroIntentos) {
				this.fueBloqueada=true;
			}
			this.intentosFallidos+=1;
		}
		return this.estado;
	}
	
	public void cerrar() {
		this.estado=false;
	}
	
	public boolean fueBloqueada() {
		return this.fueBloqueada;
	}
	
	public boolean estaAbierta() {
		return this.estado;
	}
	
	public boolean estaCerrada() {
		return !this.estado;
	}
	
	public Integer devolverAperturasExitosas() {
		return this.intentosExitosos;
	}
	
	public Integer devolverAperturasFallidas() {
		return this.intentosFallidos;
	}
	
	
	
	
	
	
	
	
}
