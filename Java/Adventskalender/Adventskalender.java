import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Adventskalender {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate christmas = LocalDate.of(today.getYear(), 12, 24);

        long TageBisWeihnachten = ChronoUnit.DAYS.between(today, christmas);

        if (TageBisWeihnachten > 0) {
            System.out.println("Noch " + TageBisWeihnachten + " Tage bis Heiligabend !");
        } else if (TageBisWeihnachten == 0) {
            System.out.println("       *");
            System.out.println("      ***");
            System.out.println("     *****");
            System.out.println("    *******");
            System.out.println("   *********");
            System.out.println("       ||");
            System.out.println("Frohe Weihnachten !");
        } else {
            System.out.println("Weihnachten ist leider schon vorbei. Guten Rutsch ins neue Jahr !");
        }
    }
}
