import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArranjoTest {

	@Test
	void test() {
		Arranjo a = new Arranjo();
		
		//Testar se o menor � 510
		assertEquals(510, a.menor(), "O menor deve ser 440");
		
		//Testar se a mior � 940
		assertEquals(940, a.menor(), "o maior � 940");
		
		//Testar se a soma � 7540
		assertEquals(7540, a.soma(), "a soma � 7040");
		
		//Testa a quantidade de vezes que o n�mero 3 aparece
		assertEquals(0, a.repeticoes(3), "3 aparece 2 vezes");
		
		//Testa a quantidade de vezes que o n�mero 790 aparece
		assertEquals(1, a.repeticoes(790), "790 aparece 2 vezes");
		
		//Testa a quantidade de vezes que o n�mero 3 aparece
		assertEquals(2, a.repeticoes(940), "940 aparece 2 vezes");

	}

}
