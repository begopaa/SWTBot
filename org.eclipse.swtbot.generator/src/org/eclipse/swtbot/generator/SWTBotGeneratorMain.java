/*******************************************************************************
 * Copyright (c) 2008 Ketan Padegaonkar and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ketan Padegaonkar - initial API and implementation
 *******************************************************************************/
package org.eclipse.swtbot.generator;

import java.io.File;

/**
 * @author Ketan Padegaonkar &lt;KetanPadegaonkar [at] gmail [dot] com&gt;
 * @version $Id$
 */
public class SWTBotGeneratorMain {

	public static void main(String[] args) {
		try {
			XmlConfigurator.main("widgets.xml", "org.eclipse.swtbot.swt.finder.SWTBot", "SWTBotFactory", new File("../org.eclipse.swtbot.swt.finder/src" ));
			XmlConfigurator.main("widgets-forms.xml", "org.eclipse.swtbot.forms.finder.SWTFormsBot", "SWTBot", new File("../org.eclipse.swtbot.forms.finder/src" ));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
