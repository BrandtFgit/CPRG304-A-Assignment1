package utilities;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import comparators.BaseAreaComparator;
import comparators.VolumeComparator;
import shapes.*;

/**
 * ShapeFileReader
 * @author Brandt Fowler
 */
public class ShapeFileReader {
	
    public static void readShapes(String filePath, char comparisonType, char sortingAlgorithm) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int numberOfShapes = Integer.parseInt(reader.readLine());

            BaseGeometricShape[] shapes = new BaseGeometricShape[numberOfShapes];

            for (int i = 0; i < numberOfShapes; i++) {
                String line = reader.readLine();
                String[] parts = line.split(" ");
                String shapeType = parts[0];
                
                double height = Double.parseDouble(parts[1]);
                double arg2 = Double.parseDouble(parts[2]);
                
                switch (shapeType) {
                    case "Cylinder":
                        shapes[i] = new Cylinder(height, arg2);
                        break;
                    case "Cone":
                        shapes[i] = new Cone(height, arg2);
                        break;
                    case "Pyramid":
                        shapes[i] = new Pyramid(height, arg2);
                        break;
                    case "SquarePrism":
                        shapes[i] = new SquarePrism(height, arg2);
                        break;
                    case "TriangularPrism":
                        shapes[i] = new TriangularPrism(height, arg2);
                        break;
                    case "PentagonalPrism":
                        shapes[i] = new PentagonalPrism(height, arg2);
                        break;
                    case "OctagonalPrism":
                        shapes[i] = new OctagonalPrism(height, arg2);
                        break;
                    default:
                        System.out.println("Unknown shape type: " + shapeType);
                        break;
                }
            }
            
            Comparator<BaseGeometricShape> comparator = null;
         
            // COMPARISON TYPE
            switch (comparisonType) {
	            case 'v':
	                // Sort shapes by volume
	            	comparator = new VolumeComparator();
	                break;
	            case 'h':
	                // Sort shapes by height
	                comparator = Comparator.naturalOrder();
	                break;
	            case 'a':
	                // Sort shapes by base area 
	            	comparator = new BaseAreaComparator();
	                break;
	            default:
	                System.out.println("Invalid comparison type.");
	                break;
	        }

            switch(sortingAlgorithm) {
	            case 'b':
	                // Sort shapes using bubble sort
	                BubbleSort.sort(shapes, comparator);
	                break;
	            case 's':
	                // Sort shapes using selection sort
	                SelectionSort.sort(shapes, comparator);
	                break;
	            case 'i':
	                // Sort shapes using insertion sort
	                InsertionSort.sort(shapes, comparator);
	                break;
	            case 'm':
	                // Sort shapes using merge sort
	                MergeSort.sort(shapes, comparator);
	                break;
	            case 'q':
	                // Sort shapes using quick sort
	                QuickSort.sort(shapes, comparator);
	                break;
	            default:
	                System.out.println("Invalid sorting algorithm.");
	                break;
		        }
            
            
            System.out.println("Sorted Shapes:");
            for (BaseGeometricShape shape : shapes) {
            	if (comparisonType == 'v') {
                    System.out.println(shape.getVolume() + " - Volume -" + shape.getClass().getSimpleName());
                    continue;
                } else if (comparisonType == 'h') {
                    System.out.println(shape.getHeight() + " - Height - " + shape.getClass().getSimpleName());
                    continue;
                } else if (comparisonType == 'a') {
                    System.out.println(shape.getBaseArea() + " - Base Area - " + shape.getClass().getSimpleName());
                    continue;
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}