package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramCalendar {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Faz com que o horário seja apresentado de acordo com o padrão ISO 8601
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		/*cal.add(Calendar.HOUR_OF_DAY, 4);      // ADICIONA 4 HORAS
		d = cal.getTime();*/
		int minutes = cal.get(Calendar.MINUTE);  // MOSTRA OS MINUTOS
		int month = 1 + cal.get(Calendar.MONTH); // MOSTRA O MÊS
		
		//System.out.println(sdf.format(d));
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
	}

}
