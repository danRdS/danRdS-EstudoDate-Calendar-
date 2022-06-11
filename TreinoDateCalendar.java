package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TreinoDateCalendar {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = sdf.parse("23/06/2020 18:43:56");
			
		int y;
			
		Calendar cal = Calendar.getInstance();
		cal.setTime(x1);
		
		System.out.println(sdf.format(x1));
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		x1 = cal.getTime();
		System.out.println(sdf.format(x1));
		
		System.out.print("Vence em: ");
		y = sc.nextInt();
		
		cal.add(Calendar.DAY_OF_YEAR, y);
		x1 = cal.getTime();
		System.out.println(sdf.format(x1));
		
		sc.close();
	}

}
