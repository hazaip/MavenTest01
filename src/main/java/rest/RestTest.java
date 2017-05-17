package rest;


import framework.TestData;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/resttest")
public class RestTest {
    @GET
    @Path("get")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<TestData> getList(@Context HttpServletResponse response) {
        response.setHeader("Access-Controll-Allow-Origin", "*");
        List<TestData> result = new ArrayList<TestData>();
        TestData t = new TestData();
        t.setId(1);
        t.setName("name");
        result.add(t);

        return result;
    }

    @GET
    @Path("get/{name}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public TestData getId(@PathParam("name") String name) {//, @Context HttpServletResponse response) {
        TestData result = new TestData();
        result.setName(name);
        result.setId(1);
//        response.setHeader("Access-Controll-Allow-Origin", "*");
        return result;
    }
}

