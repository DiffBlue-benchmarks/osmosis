// This software is released into the Public Domain.  See copying.txt for details.
package org.openstreetmap.osmosis.apidb.v0_6;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;
import org.openstreetmap.osmosis.apidb.v0_6.impl.DatabaseUtilities;
import org.openstreetmap.osmosis.core.Osmosis;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;


/**
 * Tests for PostgreSQL tasks.
 *
 * @author Brett Henderson
 */
public class ApiDbTest extends AbstractDataTest {

    private static final String DATE_FORMAT = "yyyy-MM-dd_HH:mm:ss";

	private final DatabaseUtilities dbUtils = new DatabaseUtilities(dataUtils);


    private String convertUTCTimeToLocalTime(String dateString) throws ParseException {
        DateFormat inFormat;
        DateFormat outFormat;
        Date date;

        inFormat = new SimpleDateFormat(DATE_FORMAT, Locale.US);
        inFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        outFormat = new SimpleDateFormat(DATE_FORMAT, Locale.US);

        date = inFormat.parse(dateString);

        return outFormat.format(date);
    }

    /**
     * A basic test loading an osm file into a mysql database, then dumping it again and verifying
     * that it is identical.
     *
     * @throws IOException if any file operations fail.
     */


    /**
     * A basic test loading an osm file into a apidb database, then dumping it from current tables
     * and verifying that it is identical.
     *
     * @throws IOException if any file operations fail.
     */

}
