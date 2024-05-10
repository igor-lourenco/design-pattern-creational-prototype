package creational.prototype.animation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import creational.prototype.animation.model.Person;
import creational.prototype.animation.model.PersonSamples;

public class Client {
    private static List<Person> frames = new ArrayList<Person>();
    
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
	PersonSamples samples = new PersonSamples();

//		Person person = samples.get("stickMan");
	Person person = samples.get("fatMan"); // pega o objeto Person de modelo de acordo com a key do Map<String, Person>
	frames.add(person);
	person = addLeft(person); // chama os metodos para criar os objeto e movendo para os lados e adicionando na lista
	person = addLeft(person);
	person = addLeft(person);
	person = addRight(person);
	person = addRight(person);
	person = addRight(person);
	person = addRight(person);
	person = addRight(person);
	person = addRight(person);
	person = addRight(person);
	person = addLeft(person);
	person = addLeft(person);
	person = addLeft(person);
	animate(); // faz a animacao no console
    }

    public static void animate() throws InterruptedException {
	System.out.println("*********************************");
	System.out.println("* ");
	System.out.println("* Adjust your screen's height!");
	System.out.println("* ");
	System.out.print("*********************************");
	Thread.sleep(3000);
	
	for (Person frame : frames) { // pra cada objeto Person que tem na lista
	    frame.draw();  // imprime no console o objeto 
	    Thread.sleep(500); // dá um tempo de espera de 0.5 segundos 
	}
	System.out.println("**********************");
	System.out.println("* ");
	System.out.println("* The End!");
	System.out.println("* ");
	System.out.print("**********************");
    }

    public static Person addLeft(Person p) throws CloneNotSupportedException {
	Person person = (Person) p.clone(); // cria clone
	person.left(); // chama metodo que move o objeto para esquerda
	frames.add(person); // adiciona na lista
	return person;
    }

    public static Person addRight(Person p) throws CloneNotSupportedException {
	Person person = (Person) p.clone(); // cria clone
	person.right(); // chama metodo que move o objeto para direita
	frames.add(person); // adiciona na lista
	return person;
    }


}
