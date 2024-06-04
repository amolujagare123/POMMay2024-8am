package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public  static  String convertCountry(String countryShort)
    {
        String convertedCountry="";

        switch (countryShort)
        {
            case "IN": convertedCountry = "India"; break;
            case "US": convertedCountry = "United States"; break;
            case "CA": convertedCountry = "Canada"; break;
            case "GB": convertedCountry = "United Kingdom"; break;
            case "AU": convertedCountry = "Australia"; break;
            case "CN": convertedCountry = "China"; break;
            case "JP": convertedCountry = "Japan"; break;
            case "FR": convertedCountry = "France"; break;
            case "DE": convertedCountry = "Germany"; break;
            case "IT": convertedCountry = "Italy"; break;
            case "BR": convertedCountry = "Brazil"; break;
            case "ZA": convertedCountry = "South Africa"; break;
            case "RU": convertedCountry = "Russia"; break;
            case "MX": convertedCountry = "Mexico"; break;
            case "ES": convertedCountry = "Spain"; break;
            case "NG": convertedCountry = "Nigeria"; break;
            default: convertedCountry = "Unknown"; break;
        }

        return convertedCountry;
    }


    public static String getGender(String genderCode)
    {
        String gender = "";

        switch (genderCode)
        {
            case "0" : gender = "Male";break;
            case "1" : gender = "Female";break;
            case "2" : gender = "Other";break;
        }
        return gender;
    }

    public static String convertDate(String dbDateStr) throws ParseException // 1985-10-12| yyyy-MM-dd
    {
         Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dbDateStr);
         return  new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
