package org.acme.quarkus.rxia.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.runtime.annotations.Recorder;

import org.acme.quarkus.rxia.GreetingServlet;
import io.quarkus.undertow.deployment.ServletBuildItem;

class QuarkusRxiaProcessor {

    private static final String FEATURE = "quarkus-rxia";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
    
    @BuildStep
    ServletBuildItem createServlet() { 
      ServletBuildItem servletBuildItem = ServletBuildItem.builder("greeting", GreetingServlet.class.getName())
        .addMapping("/greeting")
        .build(); 
      return servletBuildItem;
    }

}
