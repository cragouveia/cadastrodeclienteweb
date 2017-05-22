package br.estacio.cct0080.cadastrodecliente;

import javax.inject.Singleton;
import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlos on 22/05/2017.
 */

@Path("/ws")
@Singleton
public class ClienteService {

    private static List<Cliente> clientes = new ArrayList();

    @GET
    @Path("/getListaCliente/{token}")
    @Produces("application/json")
    public String getListaCliente(@PathParam("token") String token) {
        try {
            return "{\"status\":\"OK\"}";
        } catch (Exception e) {
            return "{\"status\":\"ERRO\"}";
        }
    }

    @POST
    @Path("/savecliente")
    @Consumes("application/json;charset=utf-8")
    @Produces("application/json;charset=utf-8")
    public String saveCliente(Cliente cliente) {
        return "ok";
    }

}
