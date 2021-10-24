package br.elizangela.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {"pretty"},
		monochrome = true,
		features = {"src/test/resources/features/"},
		glue = {"br.elizangela.steps"},
		snippets = SnippetType.CAMELCASE,
		tags = "not @ignore",
		dryRun = false,
		strict = true
		)

public class RunnerTest {

}
