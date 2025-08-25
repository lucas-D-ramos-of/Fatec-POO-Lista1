
public class Complexo {
    private double a, b;

    public Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void soma(Complexo c){

        a += c.a;
        b += c.b;

        System.out.println("A soma das partes reais é: "+ a);
        System.out.println("A soma das partes imaginárias é: "+ b);
    }
    public void multiplica(Complexo c){

        double parteReal = (a * c.a) - (b - c.b);
        double parteImaginaria = ( (a * c.b) + (b * c.a));

        System.out.println("O resultado da multiplicação é: "
        + parteReal + " + ("+ parteImaginaria + ")");
    }

    @Override
    public String toString(){

        String r;
        r = "Complexo: a + b.i\n";
        if ( b > 0){
        r += (a + " + " + b + ".i\n");
        } else {
            r += (a + " " + b + ".i\n");
        }
        return r;
    }

    public double modulo(){

        return Math.sqrt( (a*a) + (b*b) );
    }

    public double argumentoPrincipal(){

        return Math.atan((b/a));
    }
}
