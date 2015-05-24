/**
 * <copyright>
 *
 * Copyright (c) Lukas Zaruba, 2015
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Lukas Zaruba, lukas.zaruba@gmail.com
 * </copyright>
 *
 */
package org.eclipse.emf.teneo.hibernate.mapping.identifier;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoggingThreadFactory implements ThreadFactory {

	private static final UncaughtExceptionHandler eh = new LoggingUncaughtExceptionHandler();

	private final String name;

	public LoggingThreadFactory(String name) {
		this.name = name;
	}

	public Thread newThread(Runnable r) {
		ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
		Thread thread = defaultThreadFactory.newThread(r);
		thread.setUncaughtExceptionHandler(eh);
		thread.setDaemon(true);
		thread.setName(name + "-" + thread.getId());
		return thread;
	}

	static class LoggingUncaughtExceptionHandler implements UncaughtExceptionHandler {

		public void uncaughtException(Thread t, Throwable e) {
			Log log = LogFactory.getLog(t.getClass());
			log.error("Uncaught exception occured in thread '" + t.getName() + "'. "
					+ "Thread has been terminated.\n", e);
		}

	}

}
