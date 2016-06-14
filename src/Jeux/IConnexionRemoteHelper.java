package Jeux;


/**
* Jeux/IConnexionRemoteHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Jeux.idl
* mardi 14 juin 2016 17 h 52 CEST
*/

abstract public class IConnexionRemoteHelper
{
  private static String  _id = "IDL:Jeux/IConnexionRemote:1.0";

  public static void insert (org.omg.CORBA.Any a, Jeux.IConnexionRemote that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Jeux.IConnexionRemote extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (Jeux.IConnexionRemoteHelper.id (), "IConnexionRemote");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Jeux.IConnexionRemote read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_IConnexionRemoteStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Jeux.IConnexionRemote value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Jeux.IConnexionRemote narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Jeux.IConnexionRemote)
      return (Jeux.IConnexionRemote)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Jeux._IConnexionRemoteStub stub = new Jeux._IConnexionRemoteStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Jeux.IConnexionRemote unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Jeux.IConnexionRemote)
      return (Jeux.IConnexionRemote)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      Jeux._IConnexionRemoteStub stub = new Jeux._IConnexionRemoteStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}