public class CalculoIMC {

    public static void main(String[] args) {
       double peso = 70;< //O operador foi colocado após o ponto e vírgula
        double altura = 1.75;

        double imc = calcularIMC(peso); //Chamou apenas o peso
        exibirResultado(imc);
    }

    public static double calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
    }

    public static void exibirResultado(double valor) {
        System.out.println("Seu IMC é: " + valor);

        if (valor < 18.5)// Não abriu chave em nenhuma das condicionais
            System.out.println("Classificação: Abaixo do peso");
        else if (valor < 25)
            System.out.println("Classificação: Peso normal");
        else
            System.out.println("Classificação: Sobrepeso ou obesidade");
    }
}