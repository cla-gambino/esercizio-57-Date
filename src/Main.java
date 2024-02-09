import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        String inputDataString = "2023-03-01T13:00:00Z";
        OffsetDateTime dataObject = OffsetDateTime.parse(inputDataString);
        System.out.println("Oggetto Data: " + dataObject);

        String dataYear = String.valueOf(dataObject.getYear());
        System.out.println("Year: " + dataYear);

        String dataMonth = String.valueOf(dataObject.getMonth());
        System.out.println("Month: " + dataMonth.toLowerCase());

        String dataDayOfMonth = String.valueOf(dataObject.getDayOfMonth());
        System.out.println("Day Of Month: " + dataDayOfMonth);

        String dataDayOfWeek = String.valueOf(dataObject.getDayOfWeek());
        System.out.println("Day Of Week: " + dataDayOfWeek.toLowerCase());

    }
}