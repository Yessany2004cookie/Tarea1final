package hn.uth.calculadora_geometrica;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        
        System.out.println( " " );
        int opcion = 0;
        
        
        while(opcion != 5) {
        	imprimirMenu();
        	opcion = leerEnteroTeclado("");
        	Double resultado = null;
        	if(opcion == 1) {
        		resultado = AreaCirculo(leerDecimalTeclado(" radio del circulo:"));
        	}else if(opcion == 2) {
        		resultado = AreaCuadrado(leerDecimalTeclado(" lado del cuadrado:"));

        	}else if(opcion == 3) {
        		resultado = AreaRectangulo(leerDecimalTeclado(" base del rectangulo:"),leerDecimalTeclado(" ALTURA DEL RECTANGULO:"));

        	}else if(opcion == 4) {
        		resultado = AreaTriangulo(leerDecimalTeclado("base del traingulo:"),leerDecimalTeclado("ALTURA DEL TRIANGULO:"));

        	}else {
        		System.out.println("Finalizando....");
        		System.exit (5);
        		
        	}
        	System.out.println("el resultado es: "+resultado);
        }
    }
    
    private static int leerEnteroTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}
	
	private static double leerDecimalTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextDouble();
	}

	private static void imprimirMenu() {
		
		System.out.println(" CALCULADORA DE FIGURAS GEOMETRICAS ");
		System.out.println(" 1. CALCULAR EL AREA DE UN CIRCULO   ");
		System.out.println(" 2. CALCULAR EL AREA DE UN CUADRADO   ");
		System.out.println("   3. CALCULAR EL AREA DE UN RECTANGULO  ");
		System.out.println("   4. CALCULAR EL AREA DE UN TRIANGULO    ");
		System.out.println("    5. SALIR                                 ");
		System.out.println(" ELIJA UNA OPCIÓN DEL MENÚ:");
		
	}

	public static double AreaCuadrado(double lado) {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	public static double AreaTriangulo(double base, double altura) {
		// TODO Auto-generated method stub
		return (base * altura) / 2.0;
	}

	public static double AreaRectangulo(double base, double altura) {
		// TODO Auto-generated method stub
		return base*altura;
	}

	public static double AreaCirculo(double radio) {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radio, 2);
	}
}
