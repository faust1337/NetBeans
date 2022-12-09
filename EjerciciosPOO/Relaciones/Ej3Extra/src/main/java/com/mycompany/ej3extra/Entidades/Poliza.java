package com.mycompany.ej3extra.Entidades;

import java.util.ArrayList;
import java.util.Date;

public class Poliza {
    private ArrayList<Vehiculo> vehiculos;
    private Cuota cuota;
    private Cliente cliente;
    private String formaPago, tipoCobertura;
    private Integer numPoliza, cantCuotas, montoTotalAsegurado, montoMaximoGranizo;
    private Date fechaInicioPoliza, fechaFinPoliza;
    private boolean granizo;
}
