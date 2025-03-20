public class iPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

    // Métodos de la interfaz IReprodutorMusical
    @Override
    public void Tocar() {
        System.out.println("Reproduciendo música...");
    }

    @Override
    public void Pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("Seleccionando la música: " + musica);
    }

    // Métodos de la interfaz IAparelhoTelefonico
    @Override
    public void Ligar(String numero) {
        System.out.println("Llamando al número: " + numero);
    }

    @Override
    public void Atender() {
        System.out.println("Llamada atendida.");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando correo de voz...");
    }

    // Métodos de la interfaz INavegadorInternet
    @Override
    public void ExibirPagina(String url) {
        System.out.println("Mostrando la página: " + url);
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("Añadiendo nueva pestaña al navegador.");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Actualizando página...");
    }
}
