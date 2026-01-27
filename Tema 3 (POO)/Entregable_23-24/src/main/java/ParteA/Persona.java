package ParteA;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;
    private final Sexo sexo;

    public Persona (String nombre, int edad, String dni, double peso, double altura, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public Persona (String nombre) {
        this(nombre, 0, null, 0, 0, Sexo.HOMBRE);
    }

    public Persona () {
        this("", 0, null, 0, 0, Sexo.HOMBRE);
    }

    public int calcularIMC(){
        int resultado;
        double imc = Math.pow(this.altura,2);
        if (imc < 20) {
            resultado = -1;
        } else if (imc < 26) {

        }
    }
}
