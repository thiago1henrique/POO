# Anotações para cadeira de POO 💻
* Dia 25/04
### Programação Orientada a Objetos - Introução ☕
- ☕ **Multithread**: Capacidade de executar múltiplas threads simultaneamente
- 🔢 **Fortemente tipada**: Verificação rigorosa de tipos em tempo de compilação
- 🌐 **Distribuída**: Ideal para aplicações em rede
- 📦 **Portátil**: "Write Once, Run Anywhere" (WORA) graças à JVM
---

### Introdução a Classe e Objetos
* Dia 27/04
* Uma classe em Java☕ representa uma estrutura de dados que contem **métodos** (funções) e **atributos** (dados).
* Ao representar um método temos que passar o tipo do valor que eele vai retornar `void, int, String, boolean`,etc
* Utilizamos uma classe para representar objetos genéricos do mundo real (carro, casa, computador). Exemplo abaixo 
```Java
public class Veiculo {
    String modelo; //atributo
    boolean cambioAuto; //atributo
    String cor; //atributo
    int numeroRodas; //atributo
    double velocidade; //atributo

    public void acelerar(double valor) { //método
        velocidade += valor;
    }

    public void imprimirDados() { //método
        System.out.println("Cor " + this.cor);
        System.out.println("Número de rodas " + this.numeroRodas);
        System.out.println("Velocidade " + this.velocidade);
        System.out.println("Modelo " + this.modelo);
        System.out.println("É câmbio automático? " + this.cambioAuto);
    }

}
```
* Agora criamos uma classe `Main` onde instanciamos a classe `Veiculo`

```Java
public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo();

        carro1.modelo = "Esportivo";
        carro1.cor = "Preto";
        carro1.numeroRodas = 4;
        carro1.velocidade = 0;
        carro1.cambioAuto = true;
        
        carro1.acelerar(25);
        carro1.imprimirDados();

    }
}
```