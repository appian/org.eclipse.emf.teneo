/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: ClaimAction.java,v 1.3 2009/11/10 10:05:34 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.samples.emf.sample.claim.Claim;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimFactory;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the capa, detach and update
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class ClaimAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public ClaimAction() {
		super(ClaimPackage.eINSTANCE);
	}

	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.EXTRA_ANNOTATION_SOURCES,
				"teneo.extra, teneo.extra.test, teneo.extra.test2");
		return props;
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	@SuppressWarnings("unchecked")
	public void doAction(TestStore store) {
		store.beginTransaction();
		store.store(createClaim(1));
		store.store(createClaim(2));
		store.store(createClaim(3));
		store.commitTransaction();

		store.beginTransaction();
		List<?> claims = store.getObjects(Claim.class);
		for (Object o : claims) {
			final Claim c = (Claim) o;
			final int t = Integer.parseInt(c.getBillingName());
			assertEquals("v" + t, c.getClaimGroupVSPId());
			assertEquals("s" + t, c.getClaimStatus());
			assertEquals(t, c.getClaimLine().size());
			assertEquals("ext" + t, c.getClaimCompositeKey().getClaimExtensionNumber());
			assertEquals("num" + t, c.getClaimCompositeKey().getClaimNumber());
			int k = 0;
			for (Object co : c.getClaimLine()) {
				final ClaimLine cl = (ClaimLine) co;
				int number = (1 + k++) * 10 * t;
				assertEquals(number, Integer.parseInt(cl.getClaimLineCompositeKey().getClaimLineNumber()));
				assertEquals("" + number, cl.getClaimLineStatus());
				assertTrue(c == cl.getClaimLineCompositeKey().getClaim());
			}
		}
		store.commitTransaction();
	}

	private Claim createClaim(int i) {
		final Claim c = ClaimFactory.eINSTANCE.createClaim();
		c.setBillingName("" + i);
		c.setClaimGroupVSPId("v" + i);
		c.setClaimStatus("s" + i);

		ClaimCompositeKey ckey = ClaimFactory.eINSTANCE.createClaimCompositeKey();
		ckey.setClaimExtensionNumber("ext" + i);
		ckey.setClaimNumber("num" + i);
		c.setClaimCompositeKey(ckey);
		for (int j = 0; j < i; j++) {
			c.getClaimLine().add(createClaimLine((j + 1) * 10 * i));
		}
		return c;
	}

	private static ClaimLine createClaimLine(int i) {
		ClaimLine cl = ClaimFactory.eINSTANCE.createClaimLine();
		cl.setClaimLineBilledAmount(new BigDecimal(400.0 + i));
		cl.setClaimLineStatus("" + i);
		cl.setServiceCode("servicecode" + i);

		ClaimLineCompositeKey clkey = ClaimFactory.eINSTANCE.createClaimLineCompositeKey();
		clkey.setClaimLineNumber(i + "");
		cl.setClaimLineCompositeKey(clkey);
		return cl;
	}
	
	@Override
	public boolean supportAuditing() {
		// compose key not supported
		return false;
	}
}
