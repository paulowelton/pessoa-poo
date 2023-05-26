public class pessoa {
    String nome;
    int peso;
    double idade;
    double altura;
    
    public void envelhecer(){
       this.idade++;
    }
    
    public void mostrarIdade(){
       System.out.println(this.idade);
    }
    
    public void engordar(){
       this.peso++;
    }
    
   
    
    public void emagrecer(){
        this.peso--;
    }
    
    public void mostrarPeso(){
        System.out.println(this.peso);
    }
    
    public void crescer(){
       this.altura++;
    }
    
    public void mostrarAltura(){
       System.out.println(this.altura);
    }
}
