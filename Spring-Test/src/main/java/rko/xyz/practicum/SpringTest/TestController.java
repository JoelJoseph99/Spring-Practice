package rko.xyz.practicum.SpringTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class TestController {

    List<Float> ArrayList = new ArrayList<>();

    @GetMapping("/add/{idOne}/{idTwo}")
    public Float Add(
            @PathVariable Float idOne,
          
            @PathVariable Float idTwo)
            {
            
               Float output = idOne + idTwo;
               
               
                return output;
    }

    @GetMapping("/subtract/{idOne}/{idTwo}")
    public Float Minus(
            @PathVariable Float idOne,
         
            @PathVariable Float idTwo){
             
                Float output = idOne - idTwo;
              
                ArrayList.add(output);
                 
                return output;

    }
    @GetMapping("/multiply/{idOne}/{idTwo}")
    public Float Times(
            @PathVariable Float idOne,
           
            @PathVariable Float idTwo){
              
                Float output = idOne * idTwo;
                
                ArrayList.add(output);
                   
                return output;

    }
    @GetMapping("/divide/{idOne}/{idTwo}")
    public Float Divide(
            @PathVariable Float idOne,
           
            @PathVariable Float idTwo){
               
                Float output = idOne / idTwo;
                
                ArrayList.add(output);
                    return output;

    }

    @GetMapping("/history")
    public List<Float> History(){
            
        return ArrayList;
    }

    @DeleteMapping("/history")
    public List<Float> deleteHistory(){
            
        return ArrayList;
    }

    @GetMapping("/clear")
    public List<Float> Clear(){
            
        ArrayList.removeAll(ArrayList);
             
            return ArrayList;
    }


    
}