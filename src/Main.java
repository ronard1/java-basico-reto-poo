public class Main {
    public static void main(String[] args) {

        iPhone iphone = new iPhone();

        // Probar métodos de IReprodutorMusical
        iphone.Tocar();
        iphone.Pausar();
        iphone.SelecionarMusica("Despacito");

        // Probar métodos de IAparelhoTelefonico
        iphone.Ligar("123-456-7890");
        iphone.Atender();
        iphone.IniciarCorreioVoz();

        // Probar métodos de INavegadorInternet
        iphone.ExibirPagina("www.google.com");
        iphone.AdicionarNovaAba();
        iphone.AtualizarPagina();
    }
}