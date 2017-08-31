public class TernaryOperatorChallenge {
    public static void main(String[] args) {
        Integer i = 42;
        String s;

        if (i < 40) {
            s = "bestProjects";
        } else {
            if (i > 50) {
                s = "powerfulCode";
            } else {
                s = "noBugs";
            }
        }

        if (i < 42) {
            s += "BestProgramingPractices";
        } else {
            if (i < 30) {
                s += (i > 41);
            } else {
                s += "noStress";
            }
        }

        System.out.println(s);
    }
}