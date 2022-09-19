public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente = new Cliente();
        cliente.setNombre("Gustavo");
        cliente.setEdad(33);
        cliente.setTeléfono(989248767);
        cliente.setCrédito(8.899);
        System.out.println(" Nombre del Cliente: " + cliente.getNombre());
        System.out.println(" Edad: " + cliente.getEdad() + " años");
        System.out.println(" Teléfono: " + cliente.getTeléfono());
        System.out.println(" Linea de crédito disponible: S/ " + cliente.getCrédito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Gonzalo");
        trabajador.setEdad(58);
        trabajador.setTeléfono(960244380);
        trabajador.setSalario(1.989);
        System.out.println(" Nombre del Trabajador: " + trabajador.getNombre());
        System.out.println(" Edad: " + trabajador.getEdad() + " años");
        System.out.println(" Teléfono: " + trabajador.getTeléfono());
        System.out.println(" Salario: S/ " + trabajador.getSalario());
    }
}
class Persona
{
    private int edad;
    private String nombre;
    private int teléfono;

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
