package Jeux;


/**
* Jeux/IConnexionRemoteOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* mardi 14 juin 2016 17 h 52 CEST
*/

public interface IConnexionRemoteOperations 
{
  boolean seConnecter (String pseudo, String mdp);
  boolean seDeconnecter (Jeux.Joueur joueur);
} // interface IConnexionRemoteOperations
