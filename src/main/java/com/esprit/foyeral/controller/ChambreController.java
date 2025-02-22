package com.esprit.foyeral.controller;

import com.esprit.foyeral.entities.Chambre;
import com.esprit.foyeral.services.IChambreService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {
  private final IChambreService chambreService;

  @PostMapping()
  public Chambre addChambre(@RequestBody Chambre chambre) {
    return chambreService.add(chambre);
  }

  @PutMapping()
  public Chambre updateChambre(@RequestBody Chambre chambre) {
    return chambreService.update(chambre);
  }

  @GetMapping("/{id}")
  public Chambre getChambre(@PathVariable Long id) {
    return chambreService.getById(id).orElse(null);
  }

  @DeleteMapping("/{id}")
  public void deleteChambre(@PathVariable Long id) {
    chambreService.delete(id);
  }

  @GetMapping("/all")
  public List<Chambre> getAllChambres() {
    return chambreService.getAll();
  }
}
