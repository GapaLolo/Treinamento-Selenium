package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class DescontosStep {

    @Dado("^que estou no site da qazando")
    public void acessar_site_qazando(){
        System.out.println("passou 0");
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws Throwable {
        System.out.println("Passou 1");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() throws Throwable {
        System.out.println("Passou 2");
    }

    @Entao("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto() throws Throwable {
        System.out.println("passou 3");
    }
}
