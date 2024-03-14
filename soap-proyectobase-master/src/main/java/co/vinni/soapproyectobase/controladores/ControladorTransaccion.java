package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.dto.TransaccionDto;
import co.vinni.soapproyectobase.entidades.Cuenta;
import co.vinni.soapproyectobase.entidades.Transaccion;
import co.vinni.soapproyectobase.servicios.ServicioCuenta;
import co.vinni.soapproyectobase.servicios.ServicioTransaccion;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Log4j2
public class ControladorTransaccion {
    private static final Logger logger = LogManager.getLogger(ControladorCuenta.class);

    @Autowired
    ServicioTransaccion servicioTransaccion;

    public void agregarTransaccion (TransaccionDto transaccion, long numeroCuenta) {
        servicioTransaccion.agregarTransaccion(transaccion,numeroCuenta);
    }

    public void agregarTransaccion (TransaccionDto transaccion, long numeroCuenta1, long numeroCuenta2) {
        servicioTransaccion.agregarTransaccion(transaccion,numeroCuenta1, numeroCuenta2);
    }

    public List<TransaccionDto> obtenerTransacciones() { return servicioTransaccion.obtenerTransacciones(); }

}

