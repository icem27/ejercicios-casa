package PolizaSeguro;

public class Cliente {
	/*
	 * Variables miembro: los datos de los clientes
	 */
  String NIF, nombre;
  int edad;
  
  /**
   * Constructor
   * 
   * @param nombre
   * @param edad
   */
  public Cliente (String nombre, int edad)
  {
	  this.nombre=nombre;
	  this.edad=edad; 
  }
  
  /**
   * Constructor
   * 
   * @param NIF
   * @param nombre
   * @param edad
   */
  public Cliente (String NIF, String nombre, int edad)
  {
	  this.NIF=String.format("%09d",NIF); //relleno con ceros a la izquierda
	  this.nombre=nombre;
	  this.edad=edad;
  }
  
  /**
   * Valida el nif que le llegue como parámetro, si es correcto inicializa variable miembro y si no lanza excepción
   * 
   * @param nif
   * @throws Exception
   */
  public void setNif(String nif) throws Exception{
		if(ValidarDNI(nif)) {
			this.NIF=nif;
		}
		else
		{
			throw new Exception("Debes introducir 8 dígitos y una letra");
		}
	}
  
  /**
   * Valida el DNI que le llega como parámetro
   *  Si longitud <9 rellenamos con 0 a la izquierda
   *  La última posoción ha de ser un caracter
   *  la letra se calcula con mod23
   * Devuelve true si es correcto y false si no lo es
   * @param sDNI
   * @return
   * @throws Exception
   */
  public boolean ValidarDNI(String sDNI) throws Exception
	{ 
	 
		char[] letraDni = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };  
		
		char letra;		
		if (!Character.isLetter(sDNI.charAt(sDNI.length()-1))) {
			return false;			
        }
		else 
		{
			 letra=sDNI.charAt(sDNI.length()-1);
		}
		try
		{
		int digitos=Integer.parseInt(sDNI.substring(0,sDNI.length()-1));
		if(!(letra==letraDni[digitos%23]))
		{
			throw new Exception("Letra de NIF incorrecta");
		}
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		return true;
		
	}
  
  /**
   * 
   */
  
  @Override
	public String toString() {
		return nombre+" de edad "+edad+ " y NIF: " + NIF;
	}
 
} 

