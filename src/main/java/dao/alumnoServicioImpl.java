package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class alumnoServicioImpl implements alumnoServicio {
	private DataSource datasource;

	public void insertarAlumno(alumno Alumno) {
		// TODO Auto-generated method stub
		
System.out.println("[INFORMACIÓN-PedidoServicioImpl-insertarPedido] Se accede a insertarPedido");
		
		String consulta = "INSERT INTO \"dkl_alumnos\".\"alumnos\" (nombre,apellidos,edad)"
				+ "VALUES('Adrian','Hidalgo',26)";
		
		try {
			Connection conexion = datasource.getConnection();
			PreparedStatement declaracionSentencia = conexion.prepareStatement(consulta);
			declaracionSentencia.execute();
			System.out.println("[INFORMACIÓN-alumnoServicioImpl-insertarAlumno] Finaliza insertarAlumno");
		} catch (SQLException e) {
			System.out.println("[ERROR-alumnoServicioImpl-insertarAlumno] Error al crear la conexión:" + e);
		}
		
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
	public DataSource getDatasource() {
		return datasource;
	}

}
