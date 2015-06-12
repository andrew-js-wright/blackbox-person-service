package com.kainos.training.blackbox.service;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.kainos.training.blackbox.service.resource.PersonResource;
import com.kainos.training.blackbox.service.configuration.PersonConfiguration;

public class PersonApplication extends Application<PersonConfiguration> {
    public static void main(String[] args) throws Exception {
        new PersonApplication().run(args);
    }

    @Override
    public String getName() {
        return "person";
    }

    @Override
    public void run(PersonConfiguration configuration,
            Environment environment) {
        final PersonResource resource = new PersonResource();
        environment.jersey().register(resource);
    }

}
