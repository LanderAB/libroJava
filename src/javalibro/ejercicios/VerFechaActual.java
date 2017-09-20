package javalibro.ejercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Mostrar la fecha actual ldel sistema
 * @author Administrador
 *
 */
public class VerFechaActual {

	public static void main(String[] args) {
		
		Date date = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		
		final String[] MESES = {"Enero",
				"Febrero",
				"Marzo",
				"Abril",
				"Mayo",
				"Junio",
				"Julio",
				"Agosto",
				"Septiembre",
				"Octubre",
				"Noviembre",
				"Diciembre"};
		
		final String[] DIAS_SEMANA = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };
		
		
		int anyo = gc.get(Calendar.YEAR);
		int mes = gc.get(Calendar.MONTH);
		int dia = gc.get(Calendar.DAY_OF_MONTH);
		int diaSemana = gc.get(Calendar.DAY_OF_WEEK) - 1;
		
		
		System.out.println("Anyo :" + anyo + " Mes:" + MESES[mes] + " " + " Dia: " + DIAS_SEMANA[diaSemana]);
	}

}
