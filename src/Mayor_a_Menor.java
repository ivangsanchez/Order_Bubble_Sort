
/**
 * @author Iván Gamaliel Sánchez Zepeda
 *
 * 
 */
import java.util.Scanner;

public class Mayor_a_Menor {
	
	public static void main(String args[])
	{
		// declaracion de variables
		  //Tipo_de_variable[ ]   Nombre_del_array = new  Tipo_de_variable[dimensión];
		int[] miarreglo=new int[5];
		int[] miarregloOrdenado=new int[5];
		
		//declaración de objetos
		Scanner input=new Scanner(System.in);
		
		//obtener datos
		for(int i=5;i>=1;i--)
		{
		System.out.println("Dame el numero:"+i);
		miarreglo[i-1]=input.nextInt();
		}
		
		System.out.println("Arreglo Desordenado:");
		//mostrar desordenado
		for(int i=5;i>=1;i--)
		{
			System.out.println(miarreglo[i-1]);	
		}	
		
		//se manda a llamar el método para ordenar y se asigna a una nueva variable
		miarregloOrdenado=OrdenarBurbuja(miarreglo);
		
		System.out.println("Arreglo Ordenado:");
		//Mostrar Ordenado
		for(int i=5;i>=1;i--)
		{
			System.out.println(miarregloOrdenado[i-1]);;
		}
		
		input.close();
		
	}
	
	//Función para ordenar en método burbuja
	public static int[] OrdenarBurbuja(int[] n)

	{
	    int temp;
	    int t = n.length;
	    for (int i = 1; i < t; i++) 
	    {
	         for (int k = t- 1; k >= i; k--) 
	         {
	                if(n[k] < n[k-1])
	                {
	                    temp = n[k];
	                    n[k] = n[k-1];
	                    n[k-1]=  temp;
	                }
	         }
	    }
	    return n;

	}
	


}
