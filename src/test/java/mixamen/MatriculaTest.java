package mixamen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MatriculaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test()
	public void excepcion_vector_nulo_asignaturas() throws Exception {
		final Matricula matricula = new Matricula(null);
		assertThrows(Exception.class, () -> matricula.getImporte());
	}
	
	@Test()
	public void recorre_todas_las_asignaturas() throws Exception {
		Vector<Asignatura> vectorAsignaturas = new Vector<Asignatura>();
		vectorAsignaturas.add(0, null);
		vectorAsignaturas.add(1, null);
		// tendría que investigar cómo añadir asignaturas al vector.
		// hace muuucho que no trabajo con Java (vectores no se han visto
		// hasta ahora en los ejercicios, así que muy fresco no lo tengo :)
		final Matricula matricula = new Matricula(vectorAsignaturas);
		assertEquals(2, matricula.vectorAsignaturas.size());
		//assertEquals(0, matricula.getImporte());
	}
	

}
