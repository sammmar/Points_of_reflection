/*
"Point reflection" or "point symmetry" is a basic concept in geometry where a given point, P,
at a given position relative to a mid-point, Q has a corresponding point, P1, which is the same distance from Q but in the opposite direction.

Task
Given two points P and Q, output the symmetric point of point P about Q.
Each argument is a two-element array of integers representing the point's X and Y coordinates.
Output should be in the same format, giving the X and Y coordinates of point P1. You do not have to validate the input.
 */
public class Reflections {
    public static void main(String[] args) {
        int[] P = new int[]{2, 6};
        int[] Q = new int[]{-2, -6};
        reflectPoint(P,Q);
    }

    public static void reflectPoint(int[] P, int[] Q) {
        int P1[];
        P1 = new int[2];
        for(int i=0;i<2;i++) {
            int dif = Math.abs(Q[i] - P[i]);
            if (Q[i] > P[i])
                P1[i] = Q[i] + dif;
            else
                P1[i] = Q[i] - dif;
        }
        for(int i=0;i<2;i++) {
            System.out.println(P1[i]);
        }
    }
}
