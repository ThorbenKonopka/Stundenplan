package de.itc.stundenplan.contact.rest.test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/test")
public class TestWebservice {

    @GET
    public String getTest() {
        return "Hallo, Welt!";
    }
}
