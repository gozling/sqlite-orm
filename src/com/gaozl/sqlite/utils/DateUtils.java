package com.gaozl.sqlite.utils;

import com.gaozl.sqlite.DataConnException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    
    public static Date getDateFromDatabaseFormattedString(String iso8601DateString) throws DataConnException {
        try {
            return DATE_FORMAT.parse(iso8601DateString);
        }
        catch (ParseException e) {
            throw new DataConnException(String.format("Error could not parse a date from the supplied string '%s' make sure it's in the form 'yyyy-MM-dd HH:mm:ss'", iso8601DateString));
        }
    }
    
    public static String getDatabaseFormattedStringFromDate(Date date) {
        return DATE_FORMAT.format(date);
    }

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
}
