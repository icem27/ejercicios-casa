package PolizaSeguro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PolizasSanitarias {
	
	static int edadMinima=18; // edad mínima que acepta la póliza
	static int edadMaxima=64; // edad áxima que acepta la póliza
    static Cliente [] clientes;  // array donde almacenaremos los datos de los futuros clientes
	static Scanner sc =new Scanner (System.in);
	
	
    public static void main(String[] args)
    {
    	try
    	{
    		int numClientes=CapturarTotalClientes();        		
    		
    		clientes=new Cliente[numClientes];    		
    		for(int i=0;i<clientes.length;i++)
    		{
    			clientes[i]=CapturarDatos();
    			pintarCuota(clientes[i]);
    		}
    		pintarInformeTotal();
        }
    	catch(Exception e)
    	{
    			System.out.println(e.getMessage());    
        }
    	finally
    	{
    		sc.close();
    	}
    }
    
    
    
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  ///////////////CAPTURA DATOS///////////////////////////////////////////////////////////////////////////////////////////////////  
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *  Solicita por pantalla y devuelve el nº de clientes
     *  Valida que se introduzcan números enteros>=1, en caso contrario vuelve a solicitar la edad
     *  Llama a método que valida rango permitido
     * 
     */    
    private static int CapturarTotalClientes()
    {   		
    
    	int tot=0;
    	do
    	{
    		tot=0;
    		System.out.println("¿Cuántos clientes deseas introducir?");
    		try
    		{    		
    			tot=sc.nextInt();    			
    		}
    		catch(InputMismatchException iex )
    		{
    			tot=0;
    			sc.next();
    			System.out.println("ERROR: Debes introducir un número");
    		}
    		catch(NumberFormatException nfex )
    		{
    			tot=0;
    			sc.next();
    			System.out.println("ERROR: Debes introducir un valor numérico entero");
    		}
    	
    	}
    	while(tot==0);
    	 return tot;
    	 
    }
    
    /**
     * Llama a los métodos para capturar cada uno de los datos necesarios de un cliente ( CapturarNombre, CapturaEdad y CapturarNIF)
     * Crea y devuelve el objeto Cliente con sus datos     
     */
    private static Cliente CapturarDatos() 
    {
    
    	String nombre= CapturarNombre() ;
    	int edad=CapturaEdad();
    	
    	Cliente c=new Cliente(nombre,edad);
    	String NIF="";
    	do
    	{
			try {
				NIF = CapturarNIF();
				c.setNif(NIF);
			} catch (Exception ex) {
				NIF = "";
				System.out.println(ex.getMessage());
			}
    	
    	}
    	while(NIF.length()==0);
    
    	 return c;
    }
    
    /**
     *  Solicita por pantalla, captura y devuelve el Nombre
     *  Valida que se itroduzcan sólo letras, en caso contrario vuelve a solictar el nombre
     * 
     */
    private static String CapturarNombre()  
    {
    
    	String nombre="";
    	do
    	{
    		nombre="";
    		
    		System.out.println("Introduce el nombre del cliente: ");
    		nombre=sc.next();
    		if(!contieneSoloLetras(nombre))
    		{
    			nombre="";    
    			System.out.println("ERROR: El nombre solo puede contener letras");
    		}
    		
    		
    	}
    	while(nombre.length()==0);
    	
    	return nombre;
    }
    
    /**
     *  Solicita por pantalla, captura  y devuelve el posible NIF introducido
     */
    private static String CapturarNIF()  
    {
    
    	String nif="";
    	   		
    		System.out.println("Introduce el NIF: ");
    		nif=sc.next();
    
    	
    	
    	return nif;
    }
    
    /**
     *  Solicita por pantalla la edad
     *  Valida que se introduzcan números enteros, en caso contrario vuelve a solicitar la edad
     *  Llama a método que valida rango permitido
     *  Devuelve edad
     */
    private static int CapturaEdad() 
    {
    
    	int  edad=0;
    	do
    	{
    		edad=0;
    		System.out.println("Introduce la edad");
    		try
    		{    		
    			edad=sc.nextInt();    	
    			if(!ValidarRangoEdad(edad))
    			{
    				edad=0;
    				System.out.println("ERROR: La edad debe estar comprendida entre 18 y 64 años");    				
    			}
    		}
    		catch(InputMismatchException iex)
    		{
    			edad=0;
    			sc.next();
    			System.out.println("ERROR: Debes introducir un número ");
    		}
    		catch(NumberFormatException nfex )
    		{
    			edad=0;
    			sc.next();
    			System.out.println("ERROR: Debes introducir un valor numérico entero");
    		}
    		
    	}
    	while(edad==0);
   
    	return edad;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////COMPROBACIONES///////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Método que comprueba si la cadena que le llega como parámetro contiene sólo letras
     * Devuelve false en caso contrario
     */
    public static boolean contieneSoloLetras(String cadena) {
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }
    
  
  
  /**
  * Valida que el valor introducido está comprendido entre el rabgo definido para la edad en variables miembro
  */
    private static boolean ValidarRangoEdad(int valor) 
	{
    	return (valor>=edadMinima && valor<=edadMaxima);
		
	}
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////CALCULOS/////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
    /**
	 * Calcula y devuelve la cuota correspondiente según el valor de la edad que le llega como parámetro
	 */
	private static int calcularCuotaMensual(int edad)
	{
		if(edad<=30) {
			return 40;
		}else if(edad>30&&edad<40) {
			return 50;
		}else if(edad>=40&&edad<50) {
			return 60;
		}else if(edad>=50&&edad<60) {
			return 70;
		}else {
			return 80;
		}
	}
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////// PINTAR PANTALLA //////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 *  Saca por pantalla el importe de la cuota mensual del cliente que le lllega como parámetro
	 */
	private static void pintarCuota(Cliente cliente)
	{
		//try de null
		
		double cuota= calcularCuotaMensual(cliente.edad);
		String cadena="++++++++++++++++++"+cliente.toString() +" debe abonar una cuota mensual de "+ cuota +"€";
		
		System.out.println(cadena);
	}
	
	/**
	 * Calcula la edad media, cliente de mayor y menor edad y total recaudado mensualmente y lo saca por pantalla 
	 */
	
	private static void pintarInformeTotal()
	{
		//try array
		
		int edadMedia=0;
		int totalCuota=0;
		int iMayor=0;
		int iMenor=0;
		
		edadMedia+=clientes[0].edad;
		totalCuota+=calcularCuotaMensual(clientes[0].edad);
				
				
		for(int i=1;i<clientes.length;i++)
		{
			if(clientes[i]!=null)
			{
				edadMedia+=clientes[i].edad;
				totalCuota+=calcularCuotaMensual(clientes[i].edad);
				if (clientes[iMayor].edad<clientes[i].edad )
				{
					iMayor=i;
				}
				if (clientes[iMenor].edad>clientes[i].edad )
				{
					iMenor=i;
				}
			}
		}
		
		
		edadMedia/=clientes.length;
	  System.out.println("****************************************************************************************");
	  System.out.println("El cliente de mayor edad es "+ clientes[iMayor].toString());
	  System.out.println("El cliente de menor edad es "+ clientes[iMenor].toString());
	  System.out.println("La edad media de los clientes es "+edadMedia);	  
	  System.out.println("****************************************************************************************");
	  System.out.println("Total recaudado/mes: "+totalCuota);
	}
	
	
}
