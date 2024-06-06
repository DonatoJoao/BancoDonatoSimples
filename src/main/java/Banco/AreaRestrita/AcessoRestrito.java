package Banco.AreaRestrita;

public class AcessoRestrito {

    private int senha = 3422;

    public void autentica (Autenticavel fa){
        boolean acessoAutorizado = fa.autentica(this.senha);

        if (acessoAutorizado){
            System.out.println(", seu acesso foi autorizado!");
        } else {
            System.out.println(", seu acesso negado!");
        }
    }
}
