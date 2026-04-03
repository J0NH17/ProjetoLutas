
public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias=0;
    private int derrotas=0;
    private int empate=0;
    
    public void apresentar(){
        System.out.println("LUTADOR 🤺");
        System.out.println("Nome : "+getNome());
        System.out.println("idade : "+getIdade());
        System.out.println("nacionalidade : "+getNacionalidade());
        System.out.println("Peso :"+getPeso());
        System.out.println("Categoria :"+getCategoria());
    
    }
    public void status(){
        System.out.println("Nome : "+getNome());
        System.out.println("Vitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpate());
    
    }
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    
    }
    public void perdeLuta(){
        setDerrotas(getDerrotas()+1);
    
    }
    public void empatarLuta(){
        setEmpate(getEmpate()+1);
    
    }

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso <52){
            categoria ="inválido!";
            System.out.println("Lutador inválido!");
        
        }else if(peso<=70){
            categoria ="Leve";
            System.out.println("Leve");
        
        }else if(peso<=83){
            categoria ="Médio";
            System.out.println("Médio");
        
        }else if(peso<=110){
            categoria ="Pesado";
            System.out.println("pesado");
        
        }else{
            categoria ="inválido!";
            System.out.println("inválido!");
        
        }
         this.peso = peso;
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(int peso) {
        setPeso(peso);
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
    
    
 
}

