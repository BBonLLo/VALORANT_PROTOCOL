package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import controlador.MapManager;
import controlador.MapManagerDBImplementation;

public class MapTest {
	String name = "Split";
	MapManager newMap = new MapManagerDBImplementation();

	@Test
	public void testGetMapByName() {
		assertNotNull(newMap.getMapByName(name));
	}

	@Test
	public void testMakeStadisctic() {
	}

	@Test
	public void testGetAllMaps() {
	}
}
