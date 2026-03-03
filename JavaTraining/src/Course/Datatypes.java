package Course;

public class Datatypes {

	public static void main(String[] args) {
					
					        // ===============================
					        // 🔹 Primitive Data Types
					        // ===============================

					        // 1️. byte
					        // Represents small integer values (-128 to 127)
					        // Example use case: Storing age when range is small
					        byte studentAge = 20;
					        System.out.println("Age: " + studentAge);

					        // 2️. short
					        // Represents larger integer values (-32,768 to 32,767)
					        // Example use case: Storing year or population of small village
					        short admissionYear = 2026;
					        System.out.println("Admission Year: " + admissionYear);

					        // 3️. int
					        // Represents whole numbers (most commonly used integer type)
					        // Example use case: Storing marks, salary, mobile number (without country code)
					        int totalMarks = 850;
					        System.out.println("Total Marks: " + totalMarks);

					        // 4️.long
					        // Represents very large integer values
					        // Example use case: Storing national population or large transaction ID
					        long worldPopulation = 8000000000L;
					        System.out.println("World Population: " + worldPopulation);

					        // 5️.float
					        // Represents decimal numbers (single precision)
					        // Example use case: Storing temperature or percentage
					        float attendancePercentage = 85.5f;
					        System.out.println("Attendance Percentage: " + attendancePercentage);

					        // 6️. double
					        // Represents decimal numbers with high precision
					        // Example use case: Scientific calculations, precise measurements
					        double piValue = 3.1415926535;
					        System.out.println("Pi Value: " + piValue);

					        // 7️. char
					        // Represents a single character
					        // Example use case: Storing gender initial or grade
					        char grade = 'A';
					        System.out.println("Grade: " + grade);

					        // 8️.boolean
					        // Represents true or false values
					        // Example use case: Checking eligibility or login status
					        boolean isEligibleForExam = true;
					        System.out.println("Eligible for Exam: " + isEligibleForExam);


					        // ===============================
					        // 🔹 Non-Primitive Data Types
					        // ===============================

					        // 9️.String
					        // Represents a sequence of characters (text)
					        // Example use case: Storing name, address, email
					        String studentName = "likitha";
					        System.out.println("Student Name: " + studentName);

					        // 10.Array
					        // Represents a collection of values of the same type
					        // Example use case: Storing marks of multiple subjects
					        int[] subjectMarks = {85, 90, 88, 92, 80};

					        System.out.println("Subject Marks:");
					        for (int mark : subjectMarks) {
					            System.out.println(mark);
					        }
					           
					    }
			

	}

