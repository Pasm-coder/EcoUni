package co.edu.uniminuto.controller;

import co.edu.uniminuto.entity.PuntosReciclaje;
import co.edu.uniminuto.service.IPuntosReciclajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/puntos-reciclaje")
public class PuntosReciclajeController {

    @Autowired
    private IPuntosReciclajeService puntosReciclajeService;

    @GetMapping
    public List<PuntosReciclaje> obtenerTodos() {
        return puntosReciclajeService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public PuntosReciclaje obtenerPorId(@PathVariable Long id) {
        return puntosReciclajeService.obtenerPorId(id);
    }
    
    @PostMapping  // Maneja solicitudes POST en la ruta "/puntos-reciclaje"
    public PuntosReciclaje crear(@RequestBody PuntosReciclaje punto) {
        return puntosReciclajeService.guardar(punto);
    }

    @PutMapping("/{id}")
    public PuntosReciclaje actualizar(@PathVariable Long id, @RequestBody PuntosReciclaje punto) {
        return puntosReciclajeService.actualizar(id, punto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        puntosReciclajeService.eliminar(id);
    }
}