
package modelo;

/**
 *
 * @author Equipo 10
 */
public class Empleado {
    
    private int numEmpleado;
    private String nombre;
    private int edad;
    private String sexo;
    private double salario;
    
    public Empleado(){
        
    }

    public Empleado(int numEmpleado, String nombre, int edad, String sexo, double salario) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.salario = salario;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", salario=" + salario + '}';
    }
    
    
   
}
