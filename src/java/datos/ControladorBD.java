/*
 * Clase que se conecta a la base de datos y:
       - agrega un nuevo empleado, medicamento y pacinete.
       - elimina un empleado, medicamento y paciente.
       - consulta todos los empleados, medicamentos y pacientes.

 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Empleado;

/**
 *
 * @author Profesor
 */
public class ControladorBD {

    private static final String USUARIO = "root";
    private static final String PSWD = "root";
    private static final String BD = "hospital";
    private static final String URL = "jdbc:mysql://localhost:3306/";

    private Connection conexion;

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL + BD, USUARIO, PSWD);
            if (conexion != null) {
                System.out.println("conectado");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error 1" + ex.getMessage());
        }

    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }

    public ArrayList<Empleado> consultarEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Statement st;
        try {
            st = conexion.createStatement();
            String query = "SELECT* FROM empleados";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Empleado em = new Empleado();
                em.setNumEmpleado(rs.getInt("numEmpleado"));
                em.setNombre(rs.getString("nombre"));
                em.setEdad(rs.getInt("edad"));
                em.setSexo(rs.getString("sexo"));
                em.setSalario(rs.getDouble("salario"));
                
                
                empleados.add(em);
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }

        return empleados;
    }

    public boolean agregarEmpleado(Empleado empleado) {
        boolean estado = false;
        Statement consultaSQL;
        String q = "INSERT INTO empleados VALUES(" + empleado.getNumEmpleado() + ","
                + "'" + empleado.getNombre() + "'," +  empleado.getEdad() + "'" + empleado.getSexo() + "'," + empleado.getSalario() +")";
        /*
            INSERT INTO empleados
            VALUES (1,'Juan Cabrera Ortiz', 25, 'Masculino', 15.315);
         */
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }

        return estado;
    }


    public boolean eliminarEmpleado(String numEmpleado) {
        boolean estado = false;
        Statement consultaSQL;
        String q = "DELETE FROM empleados numEmpleado=" + "'" + numEmpleado + "'";
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }

        return estado;
    }



}
