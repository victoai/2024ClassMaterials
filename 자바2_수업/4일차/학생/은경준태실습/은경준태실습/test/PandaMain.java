package java2.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import java2.변경에유리한코드.Animal;

public class PandaMain {
public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
	panda panda = getpanda();
	panda.name();
}
private static panda getpanda() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
	Properties p = new Properties();
	p.load(new FileReader("src/java2/test/config2.txt"));
	String className = p.getProperty("panda");
	Class clazz = Class.forName(className);
	panda panda = (panda)clazz.newInstance();
	return panda;

}
}
