package clases_objetos6;

import java.time.LocalDate;
public class Programa {
	public static void main(String[] args) {
		
		CentroInvestigacion csic = new CentroInvestigacion("www.csic.es");
		
		csic.altaInvestigador(new InvestigadorFormacion("1", "Jaime", "González", LocalDate.parse("2017-01-02"), 22000.0, false));
		csic.altaInvestigador(new InvestigadorFormacion("2", "Juan", "Fernández", LocalDate.parse("2015-09-01"), 24000.0, true));
		csic.altaInvestigador(new InvestigadorFormacion("3", "Marta", "Robledo", LocalDate.parse("2014-09-01"), 25000.0, true));
		csic.altaInvestigador(new InvestigadorTitular("4", "Óscar", "Sánchez", LocalDate.parse("2016-01-15"), 34000.0, 0));
		csic.altaInvestigador(new InvestigadorTitular("5", "Miguel", "Álvarez", LocalDate.parse("2012-10-01"), 36000.0, 1));
		csic.altaInvestigador(new InvestigadorTitular("6", "Rodrigo", "López", LocalDate.parse("2011-03-15"), 38000.0, 2));
		
		System.out.println(csic.consultaInvestigadores());
	}
}
