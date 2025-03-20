
## Autor
- [Ronard_Surichaqui](https://github.com/ronard1)

## POO - Desafio

En éste desafío, se va mostrar la herencia múltiple en java utilizando interfaces. Con sintaxis mermaid y también una implementación básica en Java a modo de ejemplo en base al vídeo
[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 hasta 00:55

```mermaid
classDiagram
    class IReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class IAparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class INavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    IReprodutorMusical <|.. iPhone
    IAparelhoTelefonico <|.. iPhone
    INavegadorInternet <|.. iPhone
