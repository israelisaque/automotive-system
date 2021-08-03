package br.com.oficina.automotivesystem.controller;

import br.com.oficina.automotivesystem.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.oficina.automotivesystem.repository.ClienteRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository cliente;

    @GetMapping
    public ResponseEntity<List<Cliente>> getClients() {
        cliente.save(new Cliente("Israel", "123.456.789-00", "12234567-8", "israel@email.com", "00 2345678901", null));
        cliente.save(new Cliente("Israel", "123.456.789-00", "12234567-8", "israel@email.com", "00 2345678901", null));
        cliente.save(new Cliente("Israel", "123.456.789-00", "12234567-8", "israel@email.com", "00 2345678901", null));
        cliente.save(new Cliente("Israel", "123.456.789-00", "12234567-8", "israel@email.com", "00 2345678901", null));
        cliente.save(new Cliente("Israel", "123.456.789-00", "12234567-8", "israel@email.com", "00 2345678901", null));

        List<Cliente> clientes = cliente.findAll();

        return ResponseEntity.ok().body(clientes);
    }
}

