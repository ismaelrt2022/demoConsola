package ejemplo.consola.demoConsola;




import java.lang.System.Logger;
import java.security.Provider.Service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ejemplo.consola.demoConsola.Services.IPersonaService;
import ejemplo.consola.demoConsola.Services.PersonaServiceImp;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner{

  private static org.slf4j.Logger LOG=LoggerFactory.getLogger(DemoConsolaApplication.class);

  @Autowired
  private IPersonaService service;
	public static void main(String[] args) {

		SpringApplication.run(DemoConsolaApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println("Bienvenido a la aplicacion en consola de Spring");
		LOG.info("Bienvenido a la aplicacion en consola de Spring 2");
		LOG.warn("Warning Advertencia");


		//service= new  PersonaServiceImp();
		service.registrar("Prueba Exitosa");
	}


	

}
