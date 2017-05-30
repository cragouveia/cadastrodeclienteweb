package br.estacio.cct0080.cadastrodecliente;

import com.google.gson.Gson;

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
    @Path("/getListaCliente")
    @Produces("application/json")
    public String getListaCliente() {
        System.out.println(clientes);
        return new Gson().toJson(clientes);
    }

    @POST
    @Path("/savecliente")
    @Consumes("application/json;charset=utf-8")
    @Produces("application/json;charset=utf-8")
    public String saveCliente(Cliente cliente) {
        try {
            clientes.add(cliente);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "{\"status\":\"OK\"}";
    }

}
