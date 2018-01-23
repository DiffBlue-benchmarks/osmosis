// This software is released into the Public Domain.  See copying.txt for details.
package org.openstreetmap.osmosis.pgsimple.v0_6;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openstreetmap.osmosis.core.Osmosis;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;


/**
 * Tests for PostgreSQL tasks.
 *
 * @author Brett Henderson
 */
public class PostgreSqlTest extends AbstractDataTest {

	private File getAuthFile() {
		return dataUtils.createDataFile("db.pgsql.authfile", "v0_6/pgsql-authfile.txt");
	}


	/**
	 * A basic test loading an osm file into a pgsql database, then dumping it
	 * again and verifying that it is identical.
	 *
	 * @throws IOException
	 *             if any file operations fail.
	 */

}
