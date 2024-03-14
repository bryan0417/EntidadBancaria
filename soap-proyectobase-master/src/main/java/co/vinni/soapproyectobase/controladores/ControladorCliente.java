package co.vinni.soapproyectobase.controladores;


import co.vinni.soapproyectobase.dto.ClienteDto;
import co.vinni.soapproyectobase.entidades.Cliente;
import co.vinni.soapproyectobase.servicios.ServicioCliente;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Log4j2
public class ControladorCliente {
    private static final Logger logger = LogManager.getLogger(ControladorCliente.class);

    @Autowired
    ServicioCliente servicioCliente;

    public void registrarCliente (ClienteDto cliente) {
        servicioCliente.registrar(cliente);
    }

    public List<ClienteDto> consultarClientes () {
        logger.info("Verificando ");
        return servicioCliente.obtenerClientes();
    }

}
