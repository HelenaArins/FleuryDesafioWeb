package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Helena\\eclipse-workspace\\FleuryDesafioWeb\\src\\main\\java\\Feature", //O caminho dos arquivos de feature
		glue= {"stepDefinition"}, //O caminho das definições dos steps
		format= {"pretty", "html:test-outout", "json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"}// Gera diferentes tipo de reports
		)

public class TestRunner {
}

