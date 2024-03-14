package co.vinni.soapproyectobase.controladores;


import co.vinni.soapproyectobase.dto.CuentaDto;
import co.vinni.soapproyectobase.entidades.Cuenta;
import co.vinni.soapproyectobase.servicios.ServicioCliente;
import co.vinni.soapproyectobase.servicios.ServicioCuenta;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Log4j2
public class ControladorCuenta {

    private static final Logger logger = LogManager.getLogger(ControladorCuenta.class);

    @Autowired
    ServicioCuenta servicioCuenta;
    public void registrar (CuentaDto cuenta) {
        servicioCuenta.agregarCuenta(cuenta);
    }

    public CuentaDto consultarCuenta(long cedula) { return servicioCuenta.obtenerCuenta(cedula); }

    public List<CuentaDto> consultarCuentas() { return servicioCuenta.obtenerCuentas(); }

}

