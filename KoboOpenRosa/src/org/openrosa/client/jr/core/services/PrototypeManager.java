package org.openrosa.client.jr.core.services;

import org.openrosa.client.jr.core.util.PrefixTree;

public class PrototypeManager {
	private static PrefixTree prototypes;
		
	/*public static void registerPrototype (String className) {
		getPrototypes().addString(className);
		
		try {
			PrototypeFactory.getInstance(Class.forName(className));
		} catch (ClassNotFoundException e) {
			throw new CannotCreateObjectException(className + ": not found");
		}
	}*/
	
	/*public static void registerPrototypes (String[] classNames) {
		for (int i = 0; i < classNames.length; i++)
			registerPrototype(classNames[i]);
	}*/
	
	public static PrefixTree getPrototypes () {
		if (prototypes == null) {
			prototypes = new PrefixTree();
		}
		return prototypes;
	}
	
}
