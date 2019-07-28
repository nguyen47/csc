package csc.model;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import csc.model.ReceiverList;

public class ReceiverListTest
{
	private ReceiverList receiverList;

	public ReceiverListTest() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        receiverList = new ReceiverList();
    }

    @After
    public void tearDown() {
    }

   /**
     * Test case for add, getAll, getCount methods of class ReceiverList.
     */
    @Test
    public void testAddGetAllGetCount() {
		Receiver receiver1 = new Receiver("Teo KH");
		Receiver receiver2 = new Receiver("Francis Ho");
		testInvariant();
		receiverList.add(receiver1);
		testInvariant();
		receiverList.add(receiver2);
		testInvariant();
		List<Receiver> receivers = receiverList.getAll();
		assertTrue("receiver1 missing", receivers.contains(receiver1));
		assertTrue("receiver2 missing", receivers.contains(receiver2));
		assertTrue("count error", receiverList.getCount() == 2);
    }

    /**
     * Test of invariant method, of class ReceiverList.
     */
    @Test
    public void testInvariant() {
		assertTrue("receiverList is null",receiverList.invariant());
    }

}
