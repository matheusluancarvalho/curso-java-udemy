package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class TrabalhandoComDatas {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        //------------------------------X--------------------------------

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L); // 0 milissegundos
        Date x4 = new Date(1000L * 60L * 60L * 5L); // 0 milissegundos

        //-------------------------------Y------------------------------

        Date y1 = sdf1.parse("27/12/2021");
        Date y2 = sdf2.parse("27/12/2021 17:20:34");

        //------------------------Formato ISO 8601----------------------

        Date y3 = Date.from(Instant.parse("2021-12-27T17:48:07Z"));

        //==================================================================================================
        //==================================================================================================
        System.out.println("-----------------Variáveis X-----------------");

        System.out.println(sdf2.format(x1)); // 27/12/2021 17:31:04 -> Horário atual
        System.out.println(sdf2.format(x2)); // 27/12/2021 17:33:07 -> Horário atual

        System.out.println(sdf2.format(x3)); /* 31/12/1969 21:00:00 -> Horário padrão Java UTC 01/01/1970.
                                               No caso, como está no Brasil, tem 3h de atraso*/

        System.out.println(sdf2.format(x4)); // 01/01/1970 02:00:00

        System.out.println("-----------------Variáveis Y-----------------");

        System.out.println(y1); // Mon Dec 27 00:00:00 BRT 2021
        System.out.println(y2); // Mon Dec 27 17:20:34 BRT 2021
        System.out.println(sdf2.format(y1)); // 27/12/2021 00:00:00
        System.out.println(sdf2.format(y2)); // 27/12/2021 17:20:34

        System.out.println("----------------Formato ISO 8601--------------");

        System.out.println(sdf2.format(y3)); // 27/12/2021 14:48:07 -> 3 hrs de atraso (horário atual 18:03)




        System.out.println("\n\n====================Time Zone=================");

        System.out.println("\n-----------------Variáveis X---------------------");

        System.out.println(sdf3.format(x1)); // 27/12/2021 20:59:01
        System.out.println(sdf3.format(x2)); // 27/12/2021 20:59:01
        System.out.println(sdf3.format(x3)); // 01/01/1970 00:00:00
        System.out.println(sdf3.format(x4)); // 01/01/1970 05:00:00

        System.out.println("-----------------Variáveis Y-----------------");

        System.out.println(y1); // Mon Dec 27 00:00:00 BRT 2021
        System.out.println(y2); // Mon Dec 27 17:20:34 BRT 2021
        System.out.println(sdf3.format(y1)); // 27/12/2021 03:00:00
        System.out.println(sdf3.format(y2)); // 27/12/2021 20:20:34

        System.out.println("----------------Formato ISO 8601--------------");

        System.out.println(sdf3.format(y3)); // 27/12/2021 17:48:07

    }
}
