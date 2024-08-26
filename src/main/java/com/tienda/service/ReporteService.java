/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;
import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReporteService {
    //converison del reporte .jasper para que se convierta al tipo que deseamos
    public ResponseEntity<Resource> 
           generaReporte(
           String reporte,  //El nombre del archivo llamado .jasper 
                   Map<String, Object> parametros, //Los parametros del reporte, si tiene reporte 
                   String tipo //El tipo de reportes como csv, pdf, excel, txt 
           )throws IOException;
           
}
