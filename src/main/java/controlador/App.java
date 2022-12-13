package controlador;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.alumnoServicioImpl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml");
		alumnoServicioImpl alum = (alumnoServicioImpl) context.getBean("alumnoDao");
		alum.insertarAlumno(null);

	}

}
