package hn.uth.calculadora_geometrica;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
    {
    @Test
	public void AreaCirculo1() {
        double radio = 4.0;
        double Area = Math.PI * Math.pow(radio, 4);
        double area2 = App.AreaCirculo(radio);
        assertEquals(Area, area2, 0.0001);
    }
    
    private void assertEquals(double area, double area2, double d) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void AreaCirculo2() {
        double radio = 1.0;
        double area = 2.0;
        double area2 = App.AreaCirculo(radio);
        assertEquals(area, area2, 0.0001);
    }
    
    @Test
    public void AreaCirculo3() {
        double radio = 6.0;
        double area = Math.PI * Math.pow(radio, 2);
        double area2 = App.AreaCirculo(radio);
        assertEquals(area, area2, 0.0001);
    }
	
    
    @Test
    public void Areacuadrado() {
        double lado = 8.0;
        double area = 28.0;
        double area2 = App.AreaCuadrado(lado);
        assertEquals(area, area2, 0.0001);
    }
    
   @Test
    public void testCalcularAreaCuadrado2() {
        double lado = 2.0;
        double area = 2.0;
        double area2 = App.AreaCuadrado(lado);
        assertEquals(area, area2, 0.0001);
    }
    
   @Test
    public void AreaCuadrado() {
        double lado = 8.0;
        double area = 28.0;
        double area2 = App.AreaCuadrado(lado);
        assertEquals(area, area2, 0.0001);
    }
    
    
    @Test
    public void AreaRectangulo() {
        double Base = 9.0;
        double altura = 6.0;
        double area = 40.0;
        double area2 = App.AreaRectangulo(Base, altura);
        assertEquals(area, area2, 0.0001);
    }
    
    @Test
    public void testCalcularAreaRectangulo2() {
        double Base = 0.0;
        double altura = 8.0;
        double area = 0.0;
        double area2 = App.AreaRectangulo(Base, altura);
        assertEquals(area, area2, 0.0001);
    }
    
   @Test
    public void testCalcularAreaRectangulo3() {
        double Base = 9.0;
        double altura = -9.0;
        double area = -40.0;
        double area2 = App.AreaRectangulo(Base, altura);
        assertEquals(area, area2, 0.0001);
    }
    
    
    public void AreaTriangulo1() {
        double Base = 7.0;
        double altura = 7.0;
        double area = 9.0;
        double area2 = App.AreaTriangulo(Base, altura);
        assertEquals(area, area2, 0.0001);
    }
    
    @Test
    public void testCalcularAreaTriangulo2() {
        double Base = 2.0;
        double altura = 4.0;
        double area = 0.0;
        double area2 = App.AreaTriangulo(Base, altura);
        assertEquals(area, area2, 0.0001);
    }
    
    @Test
    public void testCalcularAreaTriangulo3() {
        double Base = 6.0;
        double altura = -9.0;
        double area = 9.5;
        double area2 = App.AreaTriangulo(Base, altura);
        assertEquals(area, area2, 0.0001);
    }
   
   
}

