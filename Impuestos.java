public class Impuestos {
    public static void main(String[] args) {
    Double salario = 50000.0, viveres = 12000.0, cerveza = 2*100.0, refrescos = 20*12.0, cigarros = 50.0, gasolina = 2000.0;
    Double agua = 150.0, internet = 500.0, telefonia = 400.0, plataformas = 275.0, Netflix = 219.0, diversion = 2000.0;
    Double renta = 3000.0, auto_mensualidad = 8000.0, seguro_auto = 1000.0, hotel = 6000.0, avion = 3000.0, comida_fuera = 1000.0, Energia_elec = 250.0;
    System.out.println("Salario = " ); System.err.println(salario);
    System.out.println("Gastos sin impuestos = "); System.out.println(viveres+cerveza+refrescos+cigarros+gasolina+agua+internet+telefonia+plataformas+Netflix+diversion+hotel+seguro_auto+avion+comida_fuera+Energia_elec+auto_mensualidad+renta);
    System.out.println("Impuesto IVA");System.out.println(viveres*.16+cerveza*.16+refrescos*.16+cigarros*.16+gasolina*.16+internet*.16+telefonia*.16+plataformas*.16+Netflix*.16+diversion*.16+hotel*.08+seguro_auto*.16+avion*.16+comida_fuera*.08+Energia_elec*.16+auto_mensualidad*.16+renta*.16);
    System.out.println("Impuesto IEPS");    System.out.println(cerveza*0.265+.355*12*1.5+0.5911*20+2*40*5.91+1000+6000*0.04);
    }
}
