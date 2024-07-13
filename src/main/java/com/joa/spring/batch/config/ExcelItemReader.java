/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joa.spring.batch.config;

import org.springframework.batch.item.ItemReader;
import com.joa.spring.batch.entity.Pago;
import java.util.Iterator;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Joaquín
 */
public class ExcelItemReader implements ItemReader<Pago> {
    
    private Iterator<Row> rowIterator;
    private String ruc;
    private String fecha;

    @Override
    public Pago read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
