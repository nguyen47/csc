package csc.model;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import csc.model.SenderList;

public class SenderListTest
{
	private SenderList senderList;

	public SenderListTest() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        senderList = new SenderList();
    }

    @After
    public void tearDown() {
    }

   /**
     * Test case for add, getAll, getCount methods of class ReceiverList.
     */
    @Test
    public void testAddGetAllGetCount() {
		Sender sender1 = new Sender("Nguyen");
		Sender sender2 = new Sender("Hoang");
		testInvariant();
		senderList.add(sender1);
		testInvariant();
		senderList.add(sender2);
		testInvariant();
		List<Receiver> senders = senderList.getAll();
		assertTrue("sender1 missing", senders.contains(sender1));
		assertTrue("sender2 missing", senders.contains(sender2));
		assertTrue("count error", senderList.getCount() == 2);
    }

    /**
     * Test of invariant method, of class ReceiverList.
     */
    @Test
    public void testInvariant() {
		assertTrue("senderList is null",senderList.invariant());
    }

}
