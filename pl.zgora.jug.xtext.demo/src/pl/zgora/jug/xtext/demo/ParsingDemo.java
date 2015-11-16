package pl.zgora.jug.xtext.demo;

import java.io.StringReader;
import java.util.logging.Logger;

import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

import com.google.inject.Injector;

import pl.zgora.jug.xtext.DemoDslStandaloneSetup;

public class ParsingDemo {

	static Logger LOGGER = Logger.getLogger(ParsingDemo.class.getName());

	static String dsl = "appender SYSOUT ch.qos.logback.core.ConsoleAppender" + " root error append-to SYSOUT";

	public static void main(String[] args) {
		Injector injector = new DemoDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		IParser parser = injector.getInstance(IParser.class);
		IParseResult parseResult = parser.parse(new StringReader(dsl));

		LOGGER.info("Has syntaxErrors: " + parseResult.hasSyntaxErrors());
		LOGGER.info(parseResult.getRootASTElement().toString());
	}

}
