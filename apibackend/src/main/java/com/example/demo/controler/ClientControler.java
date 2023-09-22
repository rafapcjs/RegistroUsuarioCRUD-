package com.example.demo.controler;

import com.example.demo.Repositorio.ClienteRepository;
import com.example.demo.execption.ResoursesNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.MODEL.Modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin (origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1")
public class ClientControler {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public List<Modelo> Listar(){
        return clienteRepository.findAll();
    }

    @PostMapping("/clientes/mandar")
    public Modelo saveClient (@RequestBody Modelo modelo){
        return clienteRepository.save(modelo);
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<Modelo> ListarId (@PathVariable Long id) {
        Modelo modelo = clienteRepository.findById(id)
                .orElseThrow(() -> new ResoursesNotFound("El cliente no tiene id " + id));
        return ResponseEntity.ok(modelo);
    }

    @PutMapping("/clientes/buscar/{id}")
    public ResponseEntity <Modelo> UpdateCliente (@PathVariable Long id , @RequestBody Modelo  modelorequest) {
        Modelo modelo = clienteRepository.findById(id)
                .orElseThrow(() -> new ResoursesNotFound("El cliente no tiene id " + id));


        modelo.setNombre(modelorequest.getNombre());
        modelo.setEmail(modelorequest.getEmail());
        Modelo clienteac= clienteRepository.save(modelo);
        return  ResponseEntity.ok(clienteac);

    }

    @DeleteMapping("/clientes/eliminar/{id}")


    public  ResponseEntity<Map<String,Boolean>> eliminarCliente(@PathVariable Long id){
        Modelo modelo = clienteRepository.findById(id)
                .orElseThrow(() -> new ResoursesNotFound("El cliente no tiene id " + id));

        clienteRepository.delete(modelo);
        Map<String,Boolean> response = new HashMap<>();


        response.put("deleted",Boolean.TRUE);

        return  ResponseEntity.ok(response);






    }
}