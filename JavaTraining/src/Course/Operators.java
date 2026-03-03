package Course;

public class Operators {

	public static void main(String[] args) {
		
					//1.Arithmetic Operators(+,-,*,/,%)
					int a=5;
					int b=3;
					int result;
					
					result=a+b;
					System.out.println("Addition:" +result);
					result=a-b;
					System.out.println("Sub:" +result);
					result=a*b;
					System.out.println("Multiplication:" +result);
					result=a/b;
					System.out.println("division:" +result);
					result=a%b;
					System.out.println("remainder:" +result);
					
					
					//2.unary operators(--,++)
					//1.Increment
					//1.Post-Increment (x++)
					//number++ → First use the value (10), then increase
					//After that, number becomes 11
					int number = 10;

					System.out.println(number++);  
					System.out.println(number);

					//or

					for (int i = 0; i < 3; i++) {
					    System.out.println(i);
					}

					//2.Pre-Increment (++x)
					//++number → First increase (11), then use it
					int num = 10;

					System.out.println(++num);
					System.out.println(num);

					//or

					for (int i = 0; i < 3; ++i) {
					    System.out.println(i);
					}


					//1.Decrement Operator (--)
					//It decreases the value by 1.
					//1.Post-Decrement (x--)
					int value = 5;

					System.out.println(value--);
					System.out.println(value);

					//or

					for (int i = 3; i > 0; i--) {   // change initialization and condtion value for decrement.
					    System.out.println(i);
					}


					//2.Pre-Decrement (--x)
					// First reduces
					//Then prints
					int val = 5;

					System.out.println(--val);
					System.out.println(val);

					//or

					for (int i = 3; i > 0; --i) {   // change initialization and condtion value for decrement.
					    System.out.println(i);
					}
					
					
					
							
					
					
					//3.Assignment operators(+=,-=,/=,%=,*=)

					int c = 5;

					c += 5;   // c = 5 + 5 → 10
					System.out.println("After += : " + c);

					c -= 5;   // c = 10 - 5 → 5
					System.out.println("After -= : " + c);

					c /= 5;   // c = 5 / 5 → 1
					System.out.println("After /= : " + c);

					c %= 5;   // c = 1 % 5 → 1
					System.out.println("After %= : " + c);

					c *= 5;   // c = 1 * 5 → 5
					System.out.println("After *= : " + c);
					
					
					//4.relational operators(>,<,==,<=,>=,!=)
					System.out.println("a > b : " + (a > b));
					System.out.println("a < b : " + (a < b));
					System.out.println("a == b : " + (a == b));
					System.out.println("a <= b : " + (a <= b));
					System.out.println("a >= b : " + (a >= b));
					System.out.println("a != b : " + (a != b));
					
					//5.logical operators(&&,||,!)
					boolean isOne = true;
					boolean isTwo = false;

					System.out.println("AND (&&): " + (isOne && isTwo));//true && true → true Otherwise → false
					System.out.println("OR (||): " + (isOne || isTwo));//If at least one is true → result is true Result = true
					System.out.println("NOT (!isOne): " + (!isOne));//It reverses the value.
					System.out.println("NOT (!isTwo): " + (!isTwo));//It reverses the value.
					
					//6.Ternary operator(cond?true:false;)
					//Syntax:condition ? value_if_true : value_if_false;
				
					int max = (a > b) ? a : b;

					System.out.println("Maximum value: " + max);
					
					
					//Bitwise & Shift Operators(&,|,^,<<,>>,>>>)
					// 1️.Bitwise AND (&)
			        System.out.println("AND (&): " + (a & b));

			        // 2️.Bitwise OR (|)
			        System.out.println("OR (|): " + (a | b));

			        // 3️. Bitwise XOR (^)
			        System.out.println("XOR (^): " + (a ^ b));

			        // 4️. Left Shift (<<)
			        System.out.println("Left Shift (a << 1): " + (a << 1));

			        // 5️. Right Shift (>>)
			        System.out.println("Right Shift (a >> 1): " + (a >> 1));

			        // 6️. Unsigned Right Shift (>>>)
			        int negativeNumber = -5;
			        System.out.println("Unsigned Right Shift (-5 >>> 1): " + (negativeNumber >>> 1));
			        
			        //Instance of Operator(obj instance of integer)
			        Integer obj = 100;

			        System.out.println("Is obj instance of Integer? " + (obj instanceof Integer));
			        
					

			   }
			}

	
