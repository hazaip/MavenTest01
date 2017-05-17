package rest;

import framework.BabyService;
import framework.WeightData;
import framework.WeightDataService;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/weights")
public class WeightDateREST {

    @EJB
    WeightDataService weightDataService;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<WeightDataHolder> getWeights(@PathParam("id") String id, @Context HttpServletResponse response) {
        response.setHeader("Access-Controll-Allow-Origin", "*");
        List<WeightDataHolder> result = new ArrayList<WeightDataHolder>();
        List<WeightData> temp = new ArrayList<WeightData>(weightDataService.getWeightData(id));
        for (WeightData w : temp) {
            result.add(new WeightDataHolder(w));
        }

        return result;
    }
}
