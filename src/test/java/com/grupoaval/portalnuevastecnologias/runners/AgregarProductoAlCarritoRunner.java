package com.grupoaval.portalnuevastecnologias.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src\\test\\resources\\com\\grupoaval\\portalnuevastecnologias\\features\\AgregarProductoAlCarrito.feature" },
glue = {"com.grupoaval.portalnuevastecnologias.stepdefinitions" }, tags = "@SmokeTest", snippets = SnippetType.CAMELCASE,
format= {"pretty","html:test-output_1", "json:C:\\Proyecto POC\\Automatizacion\\Portal Nuevas Tenologias\\Cucumber\\CucumberTestReport.json"}, 
plugin = ("json:C:\\Proyecto POC\\Automatizacion\\Portal Nuevas Tenologias\\Cucumber\\CucumberTestReport.json"), monochrome= true, dryRun= false)
public class AgregarProductoAlCarritoRunner {

}
