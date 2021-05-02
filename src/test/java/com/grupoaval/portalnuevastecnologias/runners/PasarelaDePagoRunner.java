package com.grupoaval.portalnuevastecnologias.runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="C:\\Jenkins\\workspace\\RunProjects\\ULTIMO LAST\\automatizacionportalnuevastecnologias\\src\\test\\resources\\com\\grupoaval\\portalnuevastecnologias\\features\\pasareladepago.feature",
glue="com.grupoaval.portalnuevastecnologias.stepdefinitions",
plugin={"pretty","html:C:\\Users\\soporteti\\Pictures\\Saved Pictures"
		})

public class PasarelaDePagoRunner {
	

}
