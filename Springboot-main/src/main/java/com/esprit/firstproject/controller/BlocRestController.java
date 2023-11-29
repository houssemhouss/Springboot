package com.esprit.firstproject.controller;

import com.esprit.firstproject.entity.Bloc;
import com.esprit.firstproject.service.IBlocService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "GestionBloc")
@RestController
@RequestMapping("/Bloc")
@AllArgsConstructor
public class BlocRestController {
    @Autowired
    IBlocService iBlocService;

    @PostMapping("/add")
    public Bloc AddBloc(@RequestBody Bloc b) {
        return iBlocService.addBloc(b);
    }

    @GetMapping("/getBloc")
    @Operation(description = "recuperation toutes les Bloc")
    public List<Bloc> getBloc() {
        List<Bloc> blocs = iBlocService.retrieveAllBloc();
        return blocs;
    }

    @GetMapping("/getbloc/{idbloc}")
    public ResponseEntity<?> getbyid(@PathVariable("idbloc") Integer bid) {
        Bloc bloc = iBlocService.retrieveBloc(bid);
        if (bloc != null) {
            return ResponseEntity.ok(bloc);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Aucune Bloc trouvée avec l'ID : " + bid);
        }
    }

    @DeleteMapping("/delete/{idbloc}")
    public ResponseEntity<?> delet(@PathVariable("idbloc") Integer blid) {
       iBlocService.removeBloc(blid);
        return new ResponseEntity("delete succ"+blid ,HttpStatus.CREATED);
    }

    @PutMapping("/update/{idbloc}")
    public ResponseEntity<?> update(@PathVariable("idbloc") Integer bliid, @RequestBody Bloc updatedBloc){
        Bloc blocs = iBlocService.modifyBloc(bliid,updatedBloc);
        if (blocs !=null){
            return ResponseEntity.ok(blocs);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aucune bloc trouvée avec l'ID : " + bliid);
        }
    }

}
