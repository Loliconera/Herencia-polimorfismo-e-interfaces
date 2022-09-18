public class Main
{
    public static void main(String[] args)
    {
        Persona persona = new Persona();
        persona.setNombre("Gustavo");
        persona.setEdad(33);
        persona.setTeléfono(949243737);
        System.out.println(" El nombre es: " + persona.getNombre());
        System.out.println(" tiene " + persona.getEdad() + " años");
        System.out.println(" su número de teléfono es: " + persona.getTeléfono());

        Cliente cliente = new Cliente();
        cliente.setNombre("Pepe");
        cliente.setEdad(40);
        cliente.setTeléfono(989248767);
        cliente.setCrédito(7.899);
        System.out.println(" El nombre es: " + cliente.getNombre());
        System.out.println(" tiene " + cliente.getEdad() + " años");
        System.out.println(" su número de teléfono es: " + cliente.getTeléfono());
        System.out.println(" tiene una cantidad de crédito de: S/ " + cliente.getCrédito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Manuel");
        trabajador.setEdad(58);
        trabajador.setTeléfono(960244380);
        trabajador.setSalario(1.989);
        System.out.println(" El nombre es: " + trabajador.getNombre());
        System.out.println(" tiene " + trabajador.getEdad() + " años");
        System.out.println(" su número de teléfono es: " + trabajador.getTeléfono());
        System.out.println(" y su salario es de: S/ " + trabajador.getSalario());
    }
}
class Persona
{
    int edad;
    String nombre;
    int teléfono;

    public Persona() {}

    public int getEdad()
    {
        return this.edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getTeléfono()
    {
        return this.teléfono;
    }

    public void setTeléfono(int teléfono)
    {
        this.teléfono = teléfono;
    }
}
class Cliente extends Persona
{
    double crédito;

    public double getCrédito()
    {
        return this.crédito;
    }

    public void setCrédito(double crédito)
    {
        this.crédito = crédito;
    }
}
class Trabajador extends Persona {
    double salario;

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
