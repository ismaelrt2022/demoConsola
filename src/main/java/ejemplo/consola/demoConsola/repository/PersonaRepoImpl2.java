package ejemplo.consola.demoConsola.repository;


import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;

@Repository
public class PersonaRepoImpl2  implements IPersonaRepo{

    private static Logger  LOG= LoggerFactory.getLogger(PersonaRepoImpl1.class);

    @Override
    public void registrar(String nombre) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'registrar'");

        LOG.info("SE REGISTRO : "+nombre);
    }

    
    
}
