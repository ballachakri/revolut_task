package com.revolut.sample.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test",
        tags = {"@sanity"},
        dryRun = false,
        strict = false,
        format = {"html:src/test/reports/cukesreports",
      //          "json:src/test/reports/revolut.json",
     //           "pretty"
        })

public class TestRunner {
}
