package com.grupoaval.portalnuevastecnologias.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src\\test\\resources\\com\\grupoaval\\portalnuevastecnologias\\features\\pasareladepago.feature" },
glue = {"com.grupoaval.portalnuevastecnologias.stepdefinitions" }, tags = "@SmokeTest", snippets = SnippetType.CAMELCASE,
plugin={"pretty","html:C:\\Users\\soporteti\\Pictures\\Saved Pictures"
})
public class DetalleProductoRunner {

}
