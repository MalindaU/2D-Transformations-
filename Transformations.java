import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.lang.Math;
import java.util.ArrayList;

public class Transformations {
    int numLines;
    ArrayList<Double> dataLines; //holds all points (original and transformed)
    Double[][] basicTrans; 
    Double[][] basicScale;
    Double[][] basicRo; 
    Double[][] scale;
    Double[][] rotate;
    Double[][] intermed; //holds result of muliplication of 3x3 matrices 
    Double[][] first; //Used to hold and multiply x0 and y0 times the appliedTrans matrix
    Double[][] second; //Used to hold and multiply x1 and y1 times the appliedTrans matrix
    Double[][] appliedTrans; //holds points that are being transformed
    Double[][] original; //original points from input file 
    Double[][] applyIntermedOne; //holds result of muliplication of first and appliedTrans
    Double[][] applyIntermedTwo; //holds result of muliplication of second and appliedTrans
    int trans = 0;
    
    Transformations() { //Initalizes all arrays and special numbers 
        basicTrans = new Double[3][3];
        basicScale = new Double[3][3];
        basicRo = new Double[3][3];
        scale = new Double[3][3];
        rotate = new Double[3][3];
        intermed = new Double[3][3];
        applyIntermedOne = new Double[1][3];
        applyIntermedTwo = new Double[1][3];
        first = new Double[1][3];
        second = new Double[1][3];
        dataLines = new ArrayList<Double>();
        numLines = 0;

    }
}
