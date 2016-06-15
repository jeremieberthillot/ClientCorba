import Jeux.*;
import org.omg.CORBA.Object;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by Utilisateur on 14/06/2016.
 */
public class ClientCORBA {

    public static void main(String[] args){

        try{

            // Connexion au serveur et chargement des interfaces
            InitialContext ctx = new InitialContext();
            Object refJoueur = (Object) ctx.lookup("JEUXJOUEUR");
            Object refConnexion = (Object) ctx.lookup("JEUXCONNEXION");
            Object refPartie = (Object) ctx.lookup("JEUXPARTIE");

            IJoueurRemote stubJ = IJoueurRemoteHelper.narrow((org.omg.CORBA.Object)refJoueur);
            IConnexionRemote stubC = IConnexionRemoteHelper.narrow((org.omg.CORBA.Object)refConnexion);
            IPartieRemote stubP = IPartieRemoteHelper.narrow((org.omg.CORBA.Object)refPartie);
            //TODO faire le taf du client :
            System.out.println("gg Connexion reussi :D");

        }
        catch(NamingException e){
            e.printStackTrace();
        }


    }


}
