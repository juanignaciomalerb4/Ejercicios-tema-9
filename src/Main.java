public class Main {
    public static void main (String [] args) {

        Cliente cliente = new Cliente();

        cliente.setEdad(51);
        cliente.setNombre("Ernesto");
        cliente.setTelefono("+54 9 3434 123-4567");
        cliente.setCredito(50000.00);

        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito + "pesos argentinos");


        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(25);
        trabajador.setNombre("Juan Ignacio");
        trabajador.setTelefono("+54 9 3435 123-4455");
        trabajador.setSalario(200000.00);

        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "pesos argentinos");
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

        public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {
    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }
    public double getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona {
    double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return this.salario;
    }
}