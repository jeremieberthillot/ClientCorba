package Jeux;

/**
* Jeux/JoueurHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* mardi 14 juin 2016 17 h 52 CEST
*/

public final class JoueurHolder implements org.omg.CORBA.portable.Streamable
{
  public Jeux.Joueur value = null;

  public JoueurHolder ()
  {
  }

  public JoueurHolder (Jeux.Joueur initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Jeux.JoueurHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Jeux.JoueurHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Jeux.JoueurHelper.type ();
  }

}
