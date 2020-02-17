package com.company.GHC.QualificationRound2018;
import java.io.*;
import java.util.*;

public class Class {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\asico\\IdeaProjects\\ProgrammingContests\\src\\com\\company\\GHC\\QualificationRound2018\\qualification_round_2018.in\\a_example.in"));
            //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\asico\\IdeaProjects\\ProgrammingContests\\src\\com\\company\\GHC\\QualificationRound2018\\qualification_round_2018.in\\a_example.in"));

            while(sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readInput() {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("pathname"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            assert sc != null;
            sc.close();
        }
    }

    public static void writeOutput() {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("pathname"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int[] dfsAdjMatrix(int[][] adjMatrix, int origin) {
        boolean[] visited = new boolean[adjMatrix.length];
        ArrayList<Integer> visitOrder = new ArrayList<>();
        Stack<Integer> dfsStack = new Stack<>();
        dfsStack.push(origin);
        visited[origin] = true;
        while(!dfsStack.empty()) {
            int current = dfsStack.peek();
            dfsStack.pop();
            visitOrder.add(current);
            for(int i=0; i < adjMatrix.length; ++i) {
                if(!visited[adjMatrix[current][i]]) {
                }
            }
        }
        return null;
    }
}

