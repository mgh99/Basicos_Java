import java.util.Vector;

public class Universidad {
	
	private String web;
	private Vector<Persona> personas;
	
	public Universidad(String web) {
		
		this.web = web;
		this.personas = new Vector<Persona>();
	}
	
	public String getWeb() {
		return this.web;
	}
	
	public void altaPersona(Persona p) {
		this.personas.add(p);
	}
	
	public String consultaPersonas() {
		
		// devuelve una cadena con los profesores y alumnos de
		// la universidad
		
		String s = this.getWeb() + "\t\t Profesores y alumnos \n";
		
		for(Persona p: this.personas) {
			
			s = s + "\n" + p.getDatos();
		}
		
		s = s + "\n";
		
		return s;
		
	}
	public String consultaPersonas(String tipo) {
		
		// devuelve una cadena con los profesores o alumnos de
		// la universidad, según se indique en el tipo
		
		String s = this.getWeb() + "\t\t\t " + tipo + "\n";
		
		for(Persona p: this.personas) {
			
			if(p.getClass().getSimpleName().equals(tipo)) {
				
				s = s + "\n" + p.getDatos();
			}
		}
		
		s = s + "\n";
		
		return s;
	}
}
