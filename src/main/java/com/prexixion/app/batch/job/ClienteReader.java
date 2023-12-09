package com.prexixion.app.batch.job;


import java.util.Iterator;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import com.prexixion.app.model.Cliente;
import com.prexixion.app.repository.ClienteRepository;

public class ClienteReader implements ItemReader<Cliente>{

    @Autowired
    private ClienteRepository clienteRepository;

    private Iterator<Cliente> clienteIterator;

    @Override
    @Nullable
    public Cliente read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if(clienteIterator == null  || !clienteIterator.hasNext()){

        }

        return clienteIterator.hasNext() ? clienteIterator.next() : null;
    }
    
}
