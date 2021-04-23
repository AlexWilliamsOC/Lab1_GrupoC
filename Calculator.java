import java.util.Scanner;

class Calculator {
	int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	int sub(int a, int b) {
		int rest = a - b;
                return rest;
        }
	int mul(int a, int b) {
                int mult = a * b;
		return mult;
        }
	int div(int a, int b) {
                int div = a / b;
		return div;
        }
	int mod(int a, int b) {
                int mod=a%b;
                return mod;
        }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();

		System.out.println("Ingrese dos numeros:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("\nAdicion: " + c.add(num1, num2));
		System.out.println("Sustraccion: " + c.sub(num1, num2));
		System.out.println("Multiplicacion: " + c.mul(num1, num2));
		System.out.println("Division: " + c.div(num1, num2));
		System.out.println("Modulo: " + c.mod(num1, num2));
	}
}
