public class Agent {
    public int suggestTankSize(int turtleBreed, int turtleAge) {
        int tankSize = 0;

        switch (turtleBreed) {
            // Box Turtle
            case 0:
                tankSize = 100;
                break;
            // Eastern Box Turtle
            case 1:
                tankSize = 80;
                break;
            // Mud Turtle
            case 2:
                tankSize = 50;
                break;
            // Diamondback
            case 3:
                if (turtleAge <= 15) {
                    tankSize = 60;
                } else {
                    tankSize = 80;
                }
                break;
            // Peninsula Cooter
            case 4:
                tankSize = 160;
                break;
        }

        return tankSize;
    }
}
