
package modelos;

import Excepciones.MenorEdadException;
import Excepciones.rutInvalidException;

/**
 * Clase que permite simular a un persona que será proxima a votar.
 */
public class Persona{
    private String nombre;
    private int edad;
    private String rut;
    private String genero;
    
    
    
    //============GETTERS============\\
    public String getRut() {
        return rut;
    }
    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    
    //================SETTERS==========\
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    /**
     * @setEdad
     * Función que setter que permite settear un posible número entero como edad
     * del objeto instanciado.
     * 
     * @param edad ; número entero que se verificará para saber si es posible de 
     * agregar al objeto instanciado.
     * 
     * @throws ; MenorEdadException ; en caso de que la edad ingresada menor a 18.
     * 
     */
    public void setEdad(int edad) throws MenorEdadException {
        if(edad >= 18)
            this.edad = edad;
        else
            throw new MenorEdadException();
    }
    
    /**
     * @setRut
     * Función que settea una cadena de texto al atributo de rut del objeto instanciado.
     * 
     * @param rut ; Cadena de texto que se verificará para saber si es posible de 
     * agregar al objeto instanciado, esta función en específica soporta ruts que 
     * tengan la forma mas simple con dígito verificador (xxxxxxxx-x, 10 caracteres
     * o xxxxxxx-x, i caracteres).
     * 
     * @throws rutInvalidException ; en caso de que el rut ingresado no cumpla 
     * con las condiciones antes mencionadas (El largo y que sea válido.)
     */
    public void setRut(String rut) throws rutInvalidException {
        
        if (rut.length() == 10 || rut.length() == 9){
            if (verificarRut(rut)){
                this.rut = rut;
            }else{
                throw new rutInvalidException();
            } 
        }else{
            throw new rutInvalidException();
        }

    }
    
    //=================METODOS================\\
    
    /**
     * @verificarRut
     * Función que se utiliza en el método setRut(String rut), y que se utiliza para
     * determinar si el rut que se ingresa con parámetro sea válido.
     * 
     * @param rut parámetro String recibida que se utilizará para saber si es válida.
     * 
     * @return true; en caso de que el dígito verificador sea válido
     *         false; en caso contrario (inválido).
     */
    public boolean verificarRut(String rut){
        //DV= Dígito verificador.
        
        //Eliminar el guión del rut
        String rutLimpio = rut.replace("-", "");

        // Obtener el número (en formato String) sin DV del rut.
        String numeroRUT = rutLimpio.substring(0, rutLimpio.length() - 1);

        // Obtener el DV
        char dvIngresado = rutLimpio.charAt(rutLimpio.length() - 1);

        // Calcular el dígito verificador correspondiente de numeroRUT.
        char dvCalculado = calcularDigitoVerificador(numeroRUT);

        // Verificar si el dígito verificador ingresado coincide con el calculado
        return dvIngresado == dvCalculado;
    }

    /**
     * @calcularDigitoVerificador
     * Algoritmo para calcular el dígito verificador del rut ingresado como parámetro.
     * 
     * @param rut String rut sin puntos,guión y DV.
     * 
     * @return Char que corresponde el dígito verificador de la cadena ingresada.
     */
    public char calcularDigitoVerificador(String rut) {
        int suma = 0;
        int multiplicador = 2;
        int rutNum = Integer.parseInt(rut);
        // Recorrer el RUT de derecha a izquierda
        for (int i = rut.length() - 1; i >= 0; i--) {
            suma += Character.getNumericValue(rut.charAt(i)) * multiplicador;
            multiplicador++;
            if (multiplicador > 7) {
                multiplicador = 2; // Reiniciar la secuencia de multiplicadores
            }
        }

        // Calcular el resto de la división
        int resto = suma % 11;
        int dv = 11 - resto;

        // Devolver el dígito verificador en formato de carácter
        if (dv == 11) {
            return '0'; // Si el dígito es 11, el DV es 0
        } else if (dv == 10) {
            return 'K'; // Si el dígito es 10, el DV es K
        } else {
            return (char) (dv + '0'); // Devolver el dígito verificador como carácter numérico
        }

    }
    /**
     * @modificar
     * Función para modificar datos correspondientes a clase Persona (ya que 
     * existe sobreescritura en Voto.java), esta función verifica que el rut ingresado
     * y se que quiera sobreescribir, corresponda con el que será modificado. Posteriormente
     * se realiza la modificación.
     * 
     * @param nombre cadena de texto que corresponde al nombre
     * @param rut  cadena de texto que corresponde al rut
     * @param edad  int que corresponde a la edad
     * @param genero  cadena de texto que corresponde al género
     * @return true; en caso de que el rut ingresado corresponda con el del objeto.
     *         false; en caso contrario.
     */
    public boolean modificar (String nombre, String rut, int edad ,String genero){
        if(this.rut.equals(rut)){
            this.nombre = nombre;
            this.edad = edad;
            this.genero = genero;
            return true;
        }
        return false;
    }
}
