
class Heroi {
    
    String nome;
    String poder;
    int nivel;

    
    public Heroi(String nome, String poder, int nivel) {
        this.nome = nome;
        this.poder = poder;
        this.nivel = nivel;
    }

    
    public void exibirInfo() {
        System.out.println("Nome do herói: " + nome);
        System.out.println("Poder especial: " + poder);
        System.out.println("Nível de poder: " + nivel);
    }
}


class HeroiVoador extends Heroi {
    
    int velocidadeVoo;

    
    public HeroiVoador(String nome, String poder, int nivel, int velocidadeVoo) {
        super(nome, poder, nivel); 
        this.velocidadeVoo = velocidadeVoo;
    }

   
    @Override
    public void exibirInfo() {
        super.exibirInfo(); 
        System.out.println("Velocidade de voo: " + velocidadeVoo + " km/h");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Heroi heroi1 = new Heroi("FerroMan", "Super Força", 85);
        
        
        HeroiVoador heroi2 = new HeroiVoador("ÁguiaDourada", "Visão Aguçada", 92, 300);

        
        System.out.println("=== Herói 1 ===");
        heroi1.exibirInfo();

        System.out.println("\n=== Herói 2 ===");
        heroi2.exibirInfo();
    }
}