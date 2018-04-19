package es.project.clashRoyale.controller;

import es.project.clashRoyale.exception.GenericException;
import es.project.clashRoyale.bean.CartasDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public Boolean greeting(){
        return true;
    }

    @ResponseBody
    @RequestMapping("/cartas")
    public void recibeCartas(@RequestBody ArrayList<CartasDTO> cartas) throws Exception {
        System.out.println(cartas);
        throw new GenericException("Error holiiiiiiiii");
    }
}
