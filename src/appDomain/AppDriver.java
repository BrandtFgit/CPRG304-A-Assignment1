package appDomain;

import utilities.ShapeFileReader;

public class AppDriver
{

	public static void main( String[] args )
	{
		// TODO Auto-generated method stub
		
		// refer to demo001 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)

		// refer to demo03 OfficeManager.java on how to create specific
		// objects using reflection from a String
		
		// TODO: Command line arguments.
	        System.out.println("Usage: java Main -f<file_path> -t<comparison_type> -s<sorting_algorithm>");

	        String filePath = "";
	        char comparisonType = ' ';
	        char sortingAlgorithm = ' ';

	        for (int i = 0; i < args.length; i++) {
	            switch (args[i].substring(0, 2).toLowerCase()) {
	                case "-f":
	                    filePath = args[i].substring(2).toLowerCase();
	                    break;
	                case "-t":
	                    comparisonType = args[i].substring(2).toLowerCase().charAt(0);
	                    break;
	                case "-s":
	                    sortingAlgorithm = args[i].substring(2).toLowerCase().charAt(0);
	                    break;
	                default:
	                    System.out.println("Invalid option: " + args[i]);
	                    return;
	            }
	        }

        // Validate comparison type and sorting algorithm
        if (!isValidComparisonType(comparisonType) || !isValidSortingAlgorithm(sortingAlgorithm)) {
            System.out.println("Invalid comparison type or sorting algorithm.");
            return;
        }

        // Now you have filePath, comparisonType, and sortingAlgorithm to proceed with your logic
        System.out.println("File Path: " + filePath);
        System.out.println("Comparison Type: " + comparisonType);
        System.out.println("Sorting Algorithm: " + sortingAlgorithm);
	        
		ShapeFileReader.readShapes(filePath, comparisonType, sortingAlgorithm);
	}
	
	private static boolean isValidComparisonType(char comparisonType) {
        return comparisonType == 'h' || comparisonType == 'v' || comparisonType == 'a';
    }

    private static boolean isValidSortingAlgorithm(char sortingAlgorithm) {
        return sortingAlgorithm == 'b' || sortingAlgorithm == 's' || sortingAlgorithm == 'i' ||
               sortingAlgorithm == 'm' || sortingAlgorithm == 'q' || sortingAlgorithm == 'z';
    }
}
