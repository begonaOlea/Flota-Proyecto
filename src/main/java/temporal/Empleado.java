package temporal;

import java.util.Date;

public class Empleado {
	
	public static final double SALARIO_BASE = 20000;
   
    //ATRIBUTOS
    private String nombre;
    public double salario;
    Date fechaNac;   //visibilidad default o package
    protected boolean activo; // visibilidad es package y dentro de las clases hijas por herencia
   
    
    //CONSTRUCTOR
    public Empleado(String nombre, double salario) {
    	super();
    	//validar
    	this.nombre = nombre;
    	if(salario < SALARIO_BASE) {
    		this.salario = SALARIO_BASE;
    	}else {
    		this.salario = salario;
    	}
    	
    	this.activo = true;
    }
    
    public Empleado(String nombre) {  // new Empleado("Luis");
    	this(nombre, SALARIO_BASE);
    }
    


	//METODOS
    public String getDetalles(){
        return "nombre: " + this.nombre 
               + ", salario: " + this.salario  
               +", fechaNac " + this.fechaNac;
    } 
    
    public double calcularSalario() {
    	return salario /12;
    }
    
    public String getNombre() {
		return nombre;
	}
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   

} //fin clase Empleado


class Gerente extends Empleado{
	
	public String departamento;
	
	//constructor Gerente - no hereda cons del padre
	public Gerente(String nombre, double salario, String departamento) {
		super(nombre, salario);
		this.departamento = departamento;
	}
	
	public Gerente(String nombre) {
		super(nombre);
		this.departamento = "General";
	}
	
	

	@Override
	public String getDetalles() {
		return super.getDetalles() + " - departamento " + this.departamento;
	}
	
	@Override
	public double calcularSalario() {
		String nombreCal = this.nombre ;// this.getNombre();
		if( ! this.activo ) return 0;
		return salario / 14  + 100;
	}
	
}


