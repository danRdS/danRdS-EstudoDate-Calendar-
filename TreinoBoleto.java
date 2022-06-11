package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TreinoBoleto {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor: R$");
		double price = sc.nextDouble();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse("01/06/2022");
		Date d1 = sdf.parse("01/06/2022");
		Date d2 = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		
		System.out.println("Data de emissão: " + sdf.format(d));
		
		System.out.print("Vence em quantos dias? ");
		int x = sc.nextInt();

		cal.add(Calendar.DAY_OF_YEAR, x);
		
		System.out.println("Juros");
			System.out.print("Quantos dias para incidência de juros? ");
			int j = sc.nextInt();
			double juros = 0;
			double porcentagem = 0;
			cal1.add(Calendar.DAY_OF_YEAR, x + j);
			if(j > 0) {
			System.out.print("Qual o valor do juros? (%)");
			porcentagem = sc.nextDouble();
			System.out.println("J");
			juros = price * (porcentagem/100);
			}

		d = cal.getTime();
		d1 = cal1.getTime();
		d2 = cal2.getTime();
		System.out.printf("%nValor R$%.2f%n", price);
		System.out.println("Vencimento: " + sdf.format(d));
		if(d1.after(d)) {
			System.out.println("Inicio da taxa de juros: " + sdf.format(d1));
			System.out.println("Juros de " + porcentagem + "% ao dia");
			System.out.printf("(Total de R$%.2f ao dia)%n", juros);
			}
		
		System.out.println();
		
		if(d1.compareTo(d2) > 0) {
			System.out.println("Data do pagamento: " + sdf.format(d2));
			System.out.printf("%nValor a pagar: R$%.2f", price);
		}
		else {
			System.out.println("Data do pagamento: " + sdf.format(d2));
			juros = juros *(d2.getDate() - d1.getDate() + 1);
			System.out.printf("%nValor a pagar: R$%.2f", price + juros);
		}
		
		sc.close();

	}

}
