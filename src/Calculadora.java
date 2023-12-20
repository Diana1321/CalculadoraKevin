/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Calculadora {
   
    private String digitos;
    private int resultados;  // Cambiado a int
    private boolean Suma;
    private boolean Resta;
    private boolean Multiplicacion;
    private boolean Division;
    
    public Calculadora(){
        digitos = "";
        Suma = false;
        Resta = false;
        Multiplicacion = false;
        Division = false;
    }

    public String getDigitos() {
        return digitos;
    }

    public void setDigitos(String digitos) {
        this.digitos = digitos;
    }

    public void agregarNumero(int num){
        setDigitos(digitos + num);
    }

    public void Suma(String num){
        this.resultados = Integer.parseInt(num);  // Cambiado a Integer.parseInt
        Suma = true;
        setDigitos("");
    }

    public void Resta(String num){
        this.resultados = Integer.parseInt(num);  // Cambiado a Integer.parseInt
        Resta = true;
        setDigitos("");
    }

    public void Multiplicacion(String num){
        this.resultados = Integer.parseInt(num);  // Cambiado a Integer.parseInt
        Multiplicacion = true;
        setDigitos("");
    }

    public void Division(String num){
        this.resultados = Integer.parseInt(num);  // Cambiado a Integer.parseInt
        Division = true;
        setDigitos("");
    }
    
    public int calculo(String numero){
        if(Suma){
            resultados += Integer.parseInt(numero);  // Cambiado a Integer.parseInt
        }
        if(Resta){
            resultados -= Integer.parseInt(numero);  // Cambiado a Integer.parseInt
        }
        if(Multiplicacion){
            resultados *= Integer.parseInt(numero);  // Cambiado a Integer.parseInt
        }
        if(Division){
            if (Integer.parseInt(numero) != 0) {  // Cambiado a Integer.parseInt
                resultados /= Integer.parseInt(numero);  // Cambiado a Integer.parseInt
            } else {
                System.out.println("No se puede dividir por cero.");
            }
        }
        
        // Restablecer las banderas
        Suma = false;
        Resta = false;
        Multiplicacion = false;
        Division = false;

        return resultados;
    }
}
