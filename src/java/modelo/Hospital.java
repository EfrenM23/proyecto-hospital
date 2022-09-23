/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author sitrack
 */
public class Hospital {
    
    private ArrayList<Empleado> empleados;
    
    
    public Hospital() {
        this.empleados = new ArrayList<>();
    }
    
    public Hospital(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public String numEmpleadosFemMasc(){
        int numEmpleadosFem = 0;
        int numEmpleadosMasc = 0;
        String numEmpleadosFemMasc = null;
        
        for (Empleado empleado : empleados) {
            if(empleado.getSexo().equals("Femenino")){
                numEmpleadosFem++;
            }else if(empleado.getSexo().equals("Masculino")){
                numEmpleadosMasc++;
            }
        }
        
        numEmpleadosFemMasc = "Numero de empleados de sexo Femenino:" +numEmpleadosFem+ 
                              "\nNumero de empleados de sexo Masculino: " +numEmpleadosMasc;
        return numEmpleadosFemMasc;
        
    }
    
    public int promEdadesEmpleados(){
        int edadesProm = 0;
        int sumaEdades = 0;
        int i = 0;
        
            for (Empleado empleado : empleados) {
                if(empleado.getSucursalApertura().equals(sucursal)){
                    i++;
                    saldt += empleado.getSaldo();
                    saldoProm = saldt/i;
            }
        }
        return saldoProm;
        return 0;
        
    }
    
    
    public double menorSalario(){
        double menorSalario = 0;
        
        return menorSalario;
        
    }
    
    public double mayorSalario(){
        double mayorSalario = 0;
        
        return mayorSalario;
        
    }
}
