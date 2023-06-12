package edu.idat.dsw1.demosoap;

import jakarta.annotation.PostConstruct;

import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dias;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DiasRepository {
    private static final Map<String, Dias> dias = new HashMap<>();

	@PostConstruct
	public void initData() {
		//lunes
		Dias lunes = new Dias();
		lunes.setName("Lunes");
		lunes.setTraduccion("Monday");

		dias.put(lunes.getName(), lunes);

		//martes
		Dias martes = new Dias();
		martes.setName("Martes");
		martes.setTraduccion("Tuesday");

		dias.put(martes.getName(), martes);

		//miercoles
		Dias miercoles = new Dias();
		miercoles.setName("Miercoles");
		miercoles.setTraduccion("Wednesday");

		dias.put(miercoles.getName(), miercoles);

		//jueves
		Dias jueves = new Dias();
		jueves.setName("Jueves");
		jueves.setTraduccion("Thuesday");

		dias.put(jueves.getName(), jueves);

		//viernes
		Dias viernes = new Dias();
		viernes.setName("Viernes");
		viernes.setTraduccion("Friday");

		dias.put(viernes.getName(), viernes);

		//sabado
		Dias sabado = new Dias();
		sabado.setName("Sabado");
		sabado.setTraduccion("Saturday");

		dias.put(sabado.getName(), sabado);

		//domingo
		Dias domingo = new Dias();
		domingo.setTraduccion("Sunday");
		domingo.setName("Domingo");
		dias.put(domingo.getName(), domingo);

	}

	public Dias findDias(String name) {
		Assert.notNull(name, "El nombre del dia no debe ser nulo");
		return dias.get(name);
	}
}
