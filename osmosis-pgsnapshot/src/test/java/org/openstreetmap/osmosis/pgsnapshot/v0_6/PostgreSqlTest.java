// This software is released into the Public Domain.  See copying.txt for details.
package org.openstreetmap.osmosis.pgsnapshot.v0_6;

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

	private File getAuthFile(String name) {
		return dataUtils.createDataFile("db.pgsql.authfile", name);
	}


	/**
	 * A basic test loading an osm file into a pgsql database, then dumping it
	 * again and verifying that it is identical.
	 *
	 * @throws IOException
	 *             if any file operations fail.
	 */
	

}
