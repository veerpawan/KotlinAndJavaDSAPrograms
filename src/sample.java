import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class sample {


    public static void main(String[] args) {
        String number = "100055500.574";
        //String number = "10000000";
        double amount = Double.parseDouble(number);
        //DecimalFormat formatter = new DecimalFormat("#,#00.00");
        //formatter.setCurrency(Currency.getInstance("EUR"));
        //System.out.println(formatter.format(amount));


        Locale locale = new Locale("en", "IN");
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);

        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(locale);
        decimalFormat.setDecimalFormatSymbols(dfs);
        //System.out.println(decimalFormat.format(amount));


        printCurrency(Locale.UK);
        printCurrency(Locale.US);
        printCurrency(Locale.FRANCE);

        double currencyAmount = 15004322.00;
// Create a new Locale
        Locale usa = new Locale("en", "IN");
// Create a Currency instance for the Locale
        Currency dollars = Currency.getInstance(usa);
// Create a formatter given the Locale
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

// Format the Number into a Currency String
        //System.out.println(dollars.getDisplayName() + ": " + dollarFormat.format(currencyAmount));

    }

    static void printCurrency(Locale locale){
        double dbl=10503440.3245;
        NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);
        String currency=formatter.format(dbl);
        System.out.println(currency+" for the locale "+locale);
    }

}
