package lab3;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;



import org.junit.FixMethodOrder;
import org.junit.Rule;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PizzaCookingOvenTest {

	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	private String getpizzaType(PizzaCookingOven p) {
		String v="";
		try {
			Field name = PizzaCookingOven.class.getDeclaredField("pizzaType");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getpizzaType");
			System.out.println(x);
		}
		return v;
	}
	
	private String getpizzaSize(PizzaCookingOven p) {
		String v="";
		try {
			Field name = PizzaCookingOven.class.getDeclaredField("pizzaSize");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getpizzaSize");
			System.out.println(x);
		}
		return v;
	}
	
	
	
	@Test
	public void test_0_PizzaCookingOven() {
		PizzaCookingOven p = new PizzaCookingOven();
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "S";
		
		String errorpizzaType = String.format(
				"\n Test no-arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test no-arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}

	@Test
	public void test_1_PizzaCookingOvenStringString() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","M");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "M";
		
		String errorpizzaType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
	}

	@Test
	public void test_2_PizzaCookingOvenPizzaCookingOven() {
		PizzaCookingOven c = new PizzaCookingOven("DOUBLECHEESE","L");
		PizzaCookingOven p = new  PizzaCookingOven(c);
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "L";
		String errorpizzaType = String.format(
				"\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
		
		
		
		
	}
	@Test
	public void test_2_0_PizzaCookingOvenPizzaCookingOven() {
		PizzaCookingOven c = new PizzaCookingOven("PEPPERONI","L");
		PizzaCookingOven p = new  PizzaCookingOven(c);
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "PEPPERONI";
		String epizzaSize = "L";
		String errorpizzaType = String.format(
				"\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}
	@Test
	public void test_2_1_PizzaCookingOvenPizzaCookingOven() {
		PizzaCookingOven c = new PizzaCookingOven("PEPPERONI","S");
		PizzaCookingOven p = new  PizzaCookingOven(c);
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "PEPPERONI";
		String epizzaSize = "S";
		String errorpizzaType = String.format(
				"\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}
	
	@Test
	public void test_2_2_PizzaCookingOvenPizzaCookingOven() {
		PizzaCookingOven c = new PizzaCookingOven("VEGGIE","S");
		PizzaCookingOven p = new  PizzaCookingOven(c);
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "VEGGIE";
		String epizzaSize = "S";
		String errorpizzaType = String.format(
				"\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}
	
	@Test
	public void test_2_3_PizzaCookingOvenPizzaCookingOven() {
		PizzaCookingOven c = new PizzaCookingOven("VEGGIE","M");
		PizzaCookingOven p = new  PizzaCookingOven(c);
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "VEGGIE";
		String epizzaSize = "M";
		String errorpizzaType = String.format(
				"\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}
	
	@Test
	public void test_2_4_PizzaCookingOvenPizzaCookingOven() {
		PizzaCookingOven c = new PizzaCookingOven("VEGGIE","XXL");
		PizzaCookingOven p = new  PizzaCookingOven(c);
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "VEGGIE";
		String epizzaSize = "XXL";
		String errorpizzaType = String.format(
				"\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}
	@Test
	public void test_2_5_PizzaCookingOvenPizzaCookingOven() {
		PizzaCookingOven c = new PizzaCookingOven("PEPPERONI","XXL");
		PizzaCookingOven p = new  PizzaCookingOven(c);
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "PEPPERONI";
		String epizzaSize = "XXL";
		String errorpizzaType = String.format(
				"\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}
	@Test
	public void test_3_SetPizzaType() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","M");
		p.setPizzaType("VEGGIE");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "VEGGIE";
		String epizzaSize = "M";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}

	@Test
	public void test_3_0_SetPizzaType() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","M");
		p.setPizzaType("PEPPERONI");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "PEPPERONI";
		String epizzaSize = "M";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}
	
	@Test
	public void test_3_1_SetPizzaType() {
		PizzaCookingOven p = new PizzaCookingOven("PEPPERONI","XL");
		p.setPizzaType("DOUBLECHEESE");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "XL";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}
	
	@Test
	public void test_3_2_SetPizzaType() {
		PizzaCookingOven p = new PizzaCookingOven("VEGGIE","XXL");
		p.setPizzaType("DOUBLECHEESE");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "XXL";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
		
	}
	
	
	@Test
	public void test_4_SetPizzaSize() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","M");
		p.setPizzaSize("L");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "L";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
	}

	
	@Test
	public void test_4_0_SetPizzaSize() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","L");
		p.setPizzaSize("M");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "M";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
	}
	
	@Test
	public void test_4_1_SetPizzaSize() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","XL");
		p.setPizzaSize("M");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "M";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
	}
	
	@Test
	public void test_4_2_SetPizzaSize() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","XL");
		p.setPizzaSize("XXL");
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "XXL";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
	}
	
	@Test
	public void test_5_GetPizzaType() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","M");
		
		String apizzaType = p.getPizzaType();
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "M";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
	}

	@Test
	public void test_5_0_GetPizzaType() {
		PizzaCookingOven p = new PizzaCookingOven("VEGGIE","M");
		
		String apizzaType = p.getPizzaType();
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "VEGGIE";
		String epizzaSize = "M";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
	}
	
	@Test
	public void test_5_1_GetPizzaType() {
		PizzaCookingOven p = new PizzaCookingOven("PEPPERONI","S");
		
		String apizzaType = p.getPizzaType();
		String apizzaSize = this.getpizzaSize(p);
		String epizzaType = "PEPPERONI";
		String epizzaSize = "S";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));	
	}
	
	
	@Test
	public void test_6_GetPizzaSize() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","L");
		
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = p.getPizzaSize();
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "L";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));
	}
	
	
	
	@Test
	public void test_6_0_GetPizzaSize() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","XL");
		
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = p.getPizzaSize();
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "XL";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));
	}
	
	
	@Test
	public void test_6_1_GetPizzaSize() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","XXL");
		
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = p.getPizzaSize();
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "XXL";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));
	}
	@Test
	public void test_6_2_GetPizzaSize() {
		PizzaCookingOven p = new PizzaCookingOven("DOUBLECHEESE","L");
		
		String apizzaType = this.getpizzaType(p);
		String apizzaSize = p.getPizzaSize();
		String epizzaType = "DOUBLECHEESE";
		String epizzaSize = "L";
		String errorpizzaType = String.format(
				"\n Test SetPizzaType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				apizzaType, epizzaType);
		assertTrue(errorpizzaType, epizzaType.equals(apizzaType));
		
		String errorpizzaSize = String.format(
				"\n Test  SetPizzaType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				apizzaSize, epizzaSize);
		
		assertTrue(errorpizzaSize, epizzaSize.equals(apizzaSize));
	}
	

	@Test
	public void test_7_PizzaCookTime() {
		PizzaCookingOven A = new PizzaCookingOven("DOUBLECHEESE","S");
		String errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 12);
		assertEquals(errorA, 12, A.pizzaCookTime());
		A = new PizzaCookingOven("DOUBLECHEESE","M");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 13);
		assertEquals(errorA, 13, A.pizzaCookTime());
		A = new PizzaCookingOven("DOUBLECHEESE","L");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 18);
		assertEquals(errorA, 18, A.pizzaCookTime());
		
	}
	
	
	@Test
	public void test_7_0_PizzaCookTime() {
		PizzaCookingOven A = new PizzaCookingOven("VEGGIE","S");
		String errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 14);
		assertEquals(errorA, 14, A.pizzaCookTime());
		A = new PizzaCookingOven("VEGGIE","M");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 15);
		assertEquals(errorA, 15, A.pizzaCookTime());
		A = new PizzaCookingOven("VEGGIE","L");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 20);
		assertEquals(errorA, 20, A.pizzaCookTime());
		
		A = new PizzaCookingOven("VEGGIE","XL");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 24);
		assertEquals(errorA, 24, A.pizzaCookTime());
		
		A = new PizzaCookingOven("VEGGIE","XXL");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 30);
		assertEquals(errorA, 30, A.pizzaCookTime());
		
		
	}
	@Test
	public void test_7_1_PizzaCookTime() {
		PizzaCookingOven A = new PizzaCookingOven("PEPPERONI","XL");
		String errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 26);
		assertEquals(errorA, 26, A.pizzaCookTime());
		A = new PizzaCookingOven("PEPPERONI","M");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 17);
		assertEquals(errorA, 17, A.pizzaCookTime());
		A = new PizzaCookingOven("PEPPERONI","L");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 22);
		assertEquals(errorA, 22, A.pizzaCookTime());
		
		A = new PizzaCookingOven("PEPPERONI","S");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 16);
		assertEquals(errorA, 16, A.pizzaCookTime());
		A = new PizzaCookingOven("PEPPERONI","XXL");
		errorA = String.format(
				"\n Test PizzaCookTime failed  Returned value ( %d ) " + " but correct value is ( %d ). \n",
				A.pizzaCookTime(), 32);
		assertEquals(errorA, 32, A.pizzaCookTime());
		
	}
	
	
	

	@Test
	public void test_8_ToString() {
		PizzaCookingOven A = new PizzaCookingOven("PEPPERONI","XXL");
		String actual = A.toString();
		String expected = "Pizza Cooking Order for (PEPPERONI, XXL) and cooking time is 32 minutes";
		String error = String.format(
				"\n Test toString failed  Returned value ( %s ) " + " but correct value is ( %s ). \n",
				A.toString(), expected);
		
		assertTrue(error, expected.equals(actual));
		
	}
	
	@Test
	public void test_8_0_ToString() {
		PizzaCookingOven A = new PizzaCookingOven("PEPPERONI","XXL");
		String actual = A.toString();
		String expected = "Pizza Cooking Order for (PEPPERONI, XXL) and cooking time is 32 minutes";
		String error = String.format(
				"\n Test toString failed  Returned value ( %s ) " + " but correct value is ( %s ). \n",
				A.toString(), expected);
		
		assertTrue(error, expected.equals(actual));
		
	}
	
	@Test
	public void test_8_1_ToString() {
		PizzaCookingOven A = new PizzaCookingOven("VEGGIE","S");
		String actual = A.toString();
		String expected = "Pizza Cooking Order for (VEGGIE, S) and cooking time is 14 minutes";
		String error = String.format(
				"\n Test toString failed  Returned value ( %s ) " + " but correct value is ( %s ). \n",
				A.toString(), expected);
		
		assertTrue(error, expected.equals(actual));
		
	}
	
	@Test
	public void test_8_2_ToString() {
		PizzaCookingOven A = new PizzaCookingOven("VEGGIE","M");
		String actual = A.toString();
		String expected = "Pizza Cooking Order for (VEGGIE, M) and cooking time is 15 minutes";
		String error = String.format(
				"\n Test toString failed  Returned value ( %s ) " + " but correct value is ( %s ). \n",
				A.toString(), expected);
		
		assertTrue(error, expected.equals(actual));
		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void test_90_exceptionsize() {
		new PizzaCookingOven("DOUBLECHEESE","V");
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void test_91_exceptiontype() {
		new PizzaCookingOven("DOUBLECHEESSE","S");
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_9_2_exceptiontype() {
		new PizzaCookingOven("DOUBLESSE","S");
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_9_3_exceptiontype() {
		new PizzaCookingOven("DOUBLECHEESSE","LX");
		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void test_9_4_exceptiontype() {
		new PizzaCookingOven("VEGGIEE","L");
		
	}
	
}
