package org.eclipse.emf.teneo.jpox.test.generate;

import org.eclipse.emf.teneo.ERuntime;
import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.conf.Testbed;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Encapsulates a real action to ensure that the action is not really done but only the generation of the mapping file
 * and enhancement is done.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class JPOXGenerateTest extends AbstractActionTest {

	/** Constructor */
	public JPOXGenerateTest(Class testActionClass) {
		super(testActionClass);
	}

	/** Constructor */
	public JPOXGenerateTest(AbstractTestAction testAction) {
		super(testAction);
	}

	/** Perform the mapping action */
	public void testAction() {
		ERuntime.INSTANCE.clear();

		((JPOXTestbed) Testbed.instance()).doMapping(this);
	}

	/** Throws unsupportedexception */
	protected TestStore getStore() {
		throw new UnsupportedOperationException("No store present for this type of test");
	}

	/** Passes the call to testAction */
	protected void runTest() throws Throwable {
		testAction();
	}

	/** Does nothing in this implementation */
	public void setUp() throws Exception {
		// do nothing
	}

	/** Does nothing in this implementation */
	public void tearDown() {
		// do nothing
	}
}
