package ex01.patterns.factory;

//1. Các interface chung cho Button và Checkbox
interface Button {
	void render();
}

interface Checkbox {
	void render();
}

//2. Implementations cho Windows
class WindowsButton implements Button {
	@Override
	public void render() {
		System.out.println("Windows Button 🖱️");
	}
}

class WindowsCheckbox implements Checkbox {
	@Override
	public void render() {
		System.out.println("Windows Checkbox ☑️");
	}
}

//3. Implementations cho MacOS
class MacButton implements Button {
	@Override
	public void render() {
		System.out.println("Mac Button 🖱️");
	}
}

class MacCheckbox implements Checkbox {
	@Override
	public void render() {
		System.out.println("Mac Checkbox ☑️");
	}
}

//4. Abstract Factory
interface GUIFactory {
	Button createButton();

	Checkbox createCheckbox();
}

//5. Concrete Factories
class WindowsFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}

class MacFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}

// demo Abstract Factory
public class AbstractFactoryDemo {
	public static void main(String[] args) {
		GUIFactory factory;

		String os = "Windows";

		if (os.equalsIgnoreCase("Windows")) {
			factory = new WindowsFactory();
		} else {
			factory = new MacFactory();
		}

		Button button = factory.createButton();
		Checkbox checkbox = factory.createCheckbox();

		button.render();
		checkbox.render();
	}
}

/*
 * Factory Method Khi có nhiều loại object chung interface, muốn ủy quyền việc
 * tạo object cho các lớp con. Dễ mở rộng, giảm sự phụ thuộc vào class cụ thể.
 */

/*
 * Abstract Factory Khi có nhiều loại object chung interface, muốn tạo object
 * theo nhóm. Dễ mở rộng, giảm sự phụ thuộc vào class cụ thể.
 */
