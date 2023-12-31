package sg.nus.vttp.day18demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/demo")
public class demoController {

    public ResponseEntity<?> hello(){
        try{
            return new ResponseEntity<>("Springboot is ok", HttpStatusCode.valueOf(200));
        }
        catch(Exception ex){
            return new ResponseEntity<>("Error running springboot",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
