/*
 * Copyright (C) 2005 - 2015 by TESIS DYNAware GmbH
 */
package pl.zgora.jug.xtext;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class DemoIValueConverterService extends DefaultTerminalConverters {

	@ValueConverter(rule = "FQN")
	public IValueConverter<String> FQN() {
		return new IValueConverter<String>() {
			@Override
			public String toValue(String string, INode node) throws ValueConverterException {
				return string;
			}

			@Override
			public String toString(String value) throws ValueConverterException {
				return value;
			}
		};
	}

}
