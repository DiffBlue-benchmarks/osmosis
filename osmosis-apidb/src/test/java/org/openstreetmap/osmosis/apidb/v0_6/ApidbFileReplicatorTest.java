// This software is released into the Public Domain.  See copying.txt for details.
package org.openstreetmap.osmosis.apidb.v0_6;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openstreetmap.osmosis.apidb.v0_6.impl.DatabaseUtilities;
import org.openstreetmap.osmosis.core.Osmosis;
import org.openstreetmap.osmosis.testutil.AbstractDataTest;


/**
 * Tests the file-based database replicator.
 */
public class ApidbFileReplicatorTest extends AbstractDataTest {

    private final DatabaseUtilities dbUtils = new DatabaseUtilities(dataUtils);


    /**
     * A basic test loading an osm file into an API database and verifying that it gets replicated correctly.
     *
     * @throws IOException if any file operations fail.
     */

}
