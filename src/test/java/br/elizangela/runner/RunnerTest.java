package br.elizangela.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {"pretty"}, //,"html:target/report-html", "json:target/report-json"},
		monochrome = true,
		features = "src\\test\\resources\\features\\cadastrar_usuario.feature",
		glue = "br.elizangela.steps",
		//tags = "~@ignore",
		//tags = {"@tipo1","@tipo2"},
		//tags = {"@tipo1,@tipo2"},
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)

public class RunnerTest {

}
