package test;

import org.junit.jupiter.api.Test;

public class Junit {
	
	static {
		try {
			logger = LogManager.getLogger(CalculationTest.class);
		} catch (Throwable e) {
			System.out.println("Don't work");
		}
	}

	@BeforeAll
	public static void onceExecutedBeforeAll() {
		logger.info("@BeforeAll: Al inicio de las pruebas");
	}

	@BeforeEach
	public void executedBeforeEach() {
		logger.info("@Before: Antes de cada prueba");
	}

	@AfterAll
	public static void onceExecutedAfterAll() {
		logger.info("@AfterAll: Al final de las pruebas");
	}

	@AfterEach
	public void executedAfterEach() {
		logger.info("@After: Despues de cada prueba");
	}

	@Disabled
	public void executionIgnored() {
		logger.info("@Ignore: This execution is ignored");
	}
	
	

}
