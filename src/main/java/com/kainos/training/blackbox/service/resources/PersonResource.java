package com.kainos.training.blackbox.service.resource;

import com.kainos.training.blackbox.service.model.Person;

import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.ArrayList;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {
    private List<Person> people = new ArrayList<Person>();
    private int nextId = 0;

    @GET
    public List<Person> getPeople() {
        return people;
    }

    @POST
    public List<Person> addPerson(Person person) {
        person.id = nextId;
        nextId++;

        people.add(person);
        return people;
    }

    @DELETE
    @Path("/{id}")
    public List<Person> removePerson(@PathParam("id") Integer id) {
        return people;
    }
}
