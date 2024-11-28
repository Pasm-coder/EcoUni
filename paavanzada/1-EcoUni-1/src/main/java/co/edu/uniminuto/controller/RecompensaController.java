package co.edu.uniminuto.controller;

import co.edu.uniminuto.entity.Recompensa;
import co.edu.uniminuto.service.IRecompensaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recompensas")
public class RecompensaController {

    @Autowired
    private IRecompensaService recompensaService;

    @GetMapping
    public List<Recompensa> obtenerTodas() {
        return recompensaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Recompensa obtenerPorId(@PathVariable Long id) {
        return recompensaService.obtenerPorId(id);
    }

    @PostMapping
    public Recompensa crear(@RequestBody Recompensa recompensa) {
        return recompensaService.guardar(recompensa);
    }

    @PutMapping("/{id}")
    public Recompensa actualizar(@PathVariable Long id, @RequestBody Recompensa recompensa) {
        return recompensaService.actualizar(id, recompensa);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        recompensaService.eliminar(id);
    }
}