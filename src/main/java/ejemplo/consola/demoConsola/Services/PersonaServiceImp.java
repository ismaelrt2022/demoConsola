package ejemplo.consola.demoConsola.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ejemplo.consola.demoConsola.repository.IPersonaRepo;
import ejemplo.consola.demoConsola.repository.PersonaRepoImpl1;

@Service
public class PersonaServiceImp  implements IPersonaService{

    @Autowired                    //Instanciamos o inyectamos
    @Qualifier("Persona1")      //se define para saber cual de las 2 implementaciones usaremos
    private IPersonaRepo repo;

    @Override
    public void registrar(String nombre) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'registrar'");
      
       // repo= new PersonaRepoImpl();  //forma tradicional de uso de inyeccion de depencias
    }



    
}
