package aula2802.a;

public class A {
    public static void main(String []args){
        ///
        Combustivel a = Combustivel.ALCOOL;
        Combustivel b = Combustivel.GASOLINA;
        Combustivel c = Combustivel.DIESEL;
        double valorCarro = 100;

        line();
        double valorDesconto = calculaDesconto(valorCarro, a);
        double valorVeiculoComDesconto = calculaValorVeiculo(valorCarro, a);
        System.out.println("VALOR DO CARRO SEM DESCONTO : " + valorCarro);
        System.out.println("VALOR DO DESCONTO : " + valorDesconto);
        System.out.println("VALOR DO CARRO COM DESCONTO " + valorVeiculoComDesconto);
        System.out.println("DESCONTO DE " + descontoConcedido(a) + "%");
        line();

        line();
        double valorDescontoB = calculaDesconto(valorCarro, b);
        double valorVeiculoComDescontoB = calculaValorVeiculo(valorCarro, b);
        System.out.println("VALOR DO CARRO SEM DESCONTO : " + valorCarro);
        System.out.println("VALOR DO DESCONTO : " + valorDescontoB);
        System.out.println("VALOR DO CARRO COM DESCONTO " + valorVeiculoComDescontoB);
        System.out.println("DESCONTO DE " + descontoConcedido(b) + "%");
        line();

        line();
        double valorDescontoC = calculaDesconto(valorCarro, c);
        double valorVeiculoComDescontoC = calculaValorVeiculo(valorCarro, c);
        System.out.println("VALOR DO CARRO SEM DESCONTO : " + valorCarro);
        System.out.println("VALOR DO DESCONTO : " + valorDescontoC);
        System.out.println("VALOR DO CARRO COM DESCONTO " + valorVeiculoComDescontoC);
        System.out.println("DESCONTO DE " + descontoConcedido(c) + "%");
        line();

    }

    public static double calculaDesconto(double valor, Combustivel c){
        // alcool 25% , gasolina 21% e diesel 14%
        double desconto = 0; 
        switch (c) {
            case ALCOOL:
                desconto = valor * 0.25;       
                break;
            case GASOLINA:
                desconto = valor * 0.21;
                break;
            case DIESEL: 
                desconto = valor * 0.14; 
                break;   
            default:
                break;
        }
        return desconto;
    }

    public static double calculaValorVeiculo(double valor, Combustivel c){
        // alcool 25% , gasolina 21% e diesel 14%
        double desconto = 0; 
        switch (c) {
            case ALCOOL:
                desconto = valor * 0.25;       
                break;
            case GASOLINA:
                desconto = valor * 0.21;
                break;
            case DIESEL: 
                desconto = valor * 0.14; 
                break;   
            default:
                break;
        }
        double result = valor - desconto;
        return result;
    }

    public static int descontoConcedido(Combustivel c ){

        switch (c) {
            case ALCOOL:
                return 25;
                
            case GASOLINA:
                return 21;
                
            case DIESEL: 
                return 14;

            default:
                return 0;
        }
    }

    public static void line(){
        System.out.println("============================================");
    }
}