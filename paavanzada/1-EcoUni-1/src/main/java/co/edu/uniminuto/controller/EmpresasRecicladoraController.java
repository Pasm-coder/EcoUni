package co.edu.uniminuto.controller;

import co.edu.uniminuto.entity.EmpresasRecicladora;
import co.edu.uniminuto.service.IEmpresasRecicladoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas-recicladoras")
public class EmpresasRecicladoraController {

    @Autowired
    private IEmpresasRecicladoraService empresasRecicladoraService;

    @GetMapping
    public List<EmpresasRecicladora> obtenerTodas() {
        return empresasRecicladoraService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public EmpresasRecicladora obtenerPorId(@PathVariable Long id) {
        return empresasRecicladoraService.obtenerPorId(id);
    }

    @PostMapping
    public EmpresasRecicladora crear(@RequestBody EmpresasRecicladora empresa) {
        return empresasRecicladoraService.guardar(empresa);
    }

    @PutMapping("/{id}")
    public EmpresasRecicladora actualizar(@PathVariable Long id, @RequestBody EmpresasRecicladora empresa) {
        return empresasRecicladoraService.actualizar(id, empresa);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        empresasRecicladoraService.eliminar(id);
    }
}