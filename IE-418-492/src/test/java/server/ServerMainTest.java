package server;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServerMainTest {

    @org.junit.Before
    public void setUp() throws Exception {
        //Connecting to the server
    }

    @org.junit.After
    public void tearDown() throws Exception {
        //Closing the streams and connections
    }

    @Test
    public void test1() {
        assert(true);
    }

    @Ignore
    @Test
    public void test2() {
        assert(false);
    }


}