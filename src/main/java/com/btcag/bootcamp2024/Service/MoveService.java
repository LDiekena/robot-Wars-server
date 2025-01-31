package com.btcag.bootcamp2024.Service;

import com.btcag.bootcamp2024.Model.Align;
import com.btcag.bootcamp2024.Model.Move;
import com.btcag.bootcamp2024.Model.MovementType;
import com.btcag.bootcamp2024.Model.Robot;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/moves")
public class MoveService {

    //Konstruktor für Beispiel Moves
    public MoveService() {
        moves.add(new Move("1","1",  MovementType.END, Align.S, 0));
        moves.add(new Move("2", "2", MovementType.END, Align.N, 44));
    }

    List<Move> moves = new ArrayList<Move>();

    @GetMapping("/getFirstMove")
    public Move getFirstMoveInList() {
        return moves.getFirst();
    }

    @GetMapping("/getLastMove")
    public Move getLastMoveInList() {
        return moves.getLast();
    }

    @GetMapping("/{id}")
    public Move getMoveById(@PathVariable(value = "id") int id) {
        return moves.get(id);
    }

    @GetMapping("/getMoveList")
    public List<Move> getMoveList() {
        return moves;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void newMove(@RequestBody Move move) {
        this.moves.add(move);
    }
}
