import Jeux.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by Utilisateur on 14/06/2016.
 */
public class ClientCORBA {

    public static void main(String[] args){

        try{
            InitialContext ctx = new InitialContext();
            Object ref = ctx.lookup("JEUX");
            IJoueurRemote stubJ = IJoueurRemoteHelper.narrow((org.omg.CORBA.Object)ref);
            //IConnexionRemote stubC = IConnexionRemoteHelper.narrow((org.omg.CORBA.Object)ref);
            //IPartieRemote stubP = IPartieRemoteHelper.narrow((org.omg.CORBA.Object)ref);
            //TODO faire le taf du client :
            System.out.println("lol");
        }
        catch(NamingException e){
            e.printStackTrace();
        }


    }

}
