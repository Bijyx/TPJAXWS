import proxy.BanqueWS;
import proxy.Compte;
import proxy.CompteService;

public class ClientWS {
    public static void main(String[] args) {
        CompteService stub=new BanqueWS().getCompteServicePort();
        System.out.println(stub.convert(76000));
        Compte cp=stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());cap

    }
}
