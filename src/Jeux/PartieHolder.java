package Jeux;

/**
* Jeux/PartieHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* mardi 14 juin 2016 17 h 52 CEST
*/

public final class PartieHolder implements org.omg.CORBA.portable.Streamable
{
  public Jeux.Partie value = null;

  public PartieHolder ()
  {
  }

  public PartieHolder (Jeux.Partie initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Jeux.PartieHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Jeux.PartieHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Jeux.PartieHelper.type ();
  }

}