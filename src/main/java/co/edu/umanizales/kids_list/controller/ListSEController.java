package co.edu.umanizales.kids_list.controller;

import co.edu.umanizales.kids_list.model.Kid;
import co.edu.umanizales.kids_list.model.Node;
import co.edu.umanizales.kids_list.service.ListSEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/listse")
public class ListSEController {
    @Autowired
    private ListSEService listSEService;

    @GetMapping
    public Node getListChildren(){

        return listSEService.showKids();
    }

    @PostMapping
    public String addKidToFinal(@RequestBody  Kid kid){
        listSEService.getListSE().add(kid);
        return "Adicionado exitosamente";
    }

    @PostMapping("/tostart")
    public String addKidToStart(@RequestBody  Kid kid){
        listSEService.getListSE().addToStart(kid);
        return "Adicionado exitosamente";
    }
}
