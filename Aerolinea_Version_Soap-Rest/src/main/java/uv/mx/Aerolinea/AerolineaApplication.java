package uv.mx.Aerolinea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"uv.mx.controladorRest", "uv.mx.controladorSoap"})
public class AerolineaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AerolineaApplication.class, args);
	}	
}