public class main {
    public static void main(String[] args){
        pessoa euPessoa = new pessoa();

        euPessoa.idade = 16;
        euPessoa.peso = 90;
        euPessoa.altura = 185;

        euPessoa.envelhecer();
        euPessoa.mostrarIdade();
        euPessoa.engordar();
        euPessoa.mostrarPeso();
        euPessoa.crescer();
        euPessoa.mostrarAltura();
    }
}