package co.edu.uniminuto.controller;

import co.edu.uniminuto.entity.ContactosEmpresa;
import co.edu.uniminuto.service.IContactosEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contactos-empresa")
public class ContactosEmpresaController {

    @Autowired
    private IContactosEmpresaService contactosEmpresaService;

    @GetMapping
    public List<ContactosEmpresa> obtenerTodos() {
        return contactosEmpresaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ContactosEmpresa obtenerPorId(@PathVariable Long id) {
        return contactosEmpresaService.obtenerPorId(id);
    }

    @PostMapping
    public ContactosEmpresa crear(@RequestBody ContactosEmpresa contacto) {
        return contactosEmpresaService.guardar(contacto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        contactosEmpresaService.eliminar(id);
    }
}