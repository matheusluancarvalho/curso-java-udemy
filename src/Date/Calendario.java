package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.Instant;
import java.util.Date;

public class Calendario {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2021-12-27T18:29:07Z")); // Horário atual

        System.out.println(sdf.format(d)); // 27/12/2021 15:29:07

        System.out.println("\n------------------Somando uma unidade de Tempo------------------");
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4); // Acrescenta 4 hors do dia
        d = cal.getTime();

        System.out.println("\n"+sdf.format(d)); // 27/12/2021 19:29:07 -> Acrescentou 4h as 15h

        System.out.println("\n------------------Obtendo uma unidade de tempo------------------");

        int minutes = cal.get(Calendar.MINUTE); // Devolve a quantidade de minutos
        int month = 1 + cal.get(Calendar.MONTH); // Devolve o mês

        System.out.println("\n Minutes: " + minutes);
        System.out.println("\n Month: " + month);
    }
}
