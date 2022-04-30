public class Main {
    public static void main (String [] args) {

        Cliente cliente = new Cliente();

        cliente.setEdad(51);
        cliente.setNombre("Ernesto");
        cliente.setTelefono("+54 9 3434 123-4567");
        cliente.setCredito(true);

        System.out.println("Cliente:");
        System.out.println( cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());


        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(25);
        trabajador.setNombre("Juan Ignacio");
        trabajador.setTelefono("+54 9 3435 123-4455");
        trabajador.setSalario(200000.00);

        System.out.println("Trabajador:");
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
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
    boolean credito;

    public void setCredito(boolean credito) {
        this.credito = credito;
    }
    public boolean getCredito(){
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