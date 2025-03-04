import java.util.ArrayList;

public class AppMain {
    private static Maze maze = new Maze();

    public static void main(String[] args) {
        // Write a recursive method to solve the maze. It should make use of
        //  the instance member variable maze. It knows about the maze and
        //  can answer questions about open spaces, possible moves, etc.
        // On each step, you can only move in a cardinal direction (left/right/up/down).
        // Your solution should take the form of an array of Locations
        // TODO: ...

        // Print out your solution, maze can do that for you (it's already written)
        ArrayList<Location> replaceWithYourSln = solveMaze(Maze.START);
        Location[] locs = new Location[replaceWithYourSln.size()];
        for (int i = 0; i < locs.length; i++) {
            locs[i] = replaceWithYourSln.get(i);
        }
        maze.printMazeAndPath(locs);
    }

    public static ArrayList<Location> solveMaze(Location loc) {
        Location locInc = new Location();
        ArrayList<Location> locArr = new ArrayList<Location>();
        if (maze.isExit(loc)){
            return locArr;
        }
        else if (maze.canGoDown(loc)) {
            locInc = loc.incDown();
        }
        else if (maze.canGoLeft(loc)) {
            locInc = loc.incLeft();
        }
        else if (maze.canGoUp(loc)) {
            locInc = loc.incUp();
        }
        else if (maze.canGoRight(loc)) {
            locInc = loc.incRight();
        }
        else if (!maze.isMazeLocationClear(locInc)){
            return locArr;
        }
        else {
            System.out.println("Can't find path");
            return locArr;
        }
        locArr.add(locInc);
        ArrayList<Location> newLocArr = solveMaze(locInc);
        for (int i = 0; i < newLocArr.size(); i++) {
            locArr.add(newLocArr.get(i));
        }
        return locArr;
    }

    // Helper methods for marking locations as visited
    //  You are probably going to want to use: hasVisitedNode & markVisited.
    private static boolean[][] visited = null;
    private static boolean hasVisitedNode(Location loc) {
        if (!isValidVisitedLoc(loc)) {
            return true;
        }
        return visited[loc.getY()][loc.getX()];
    }
    private static void markVisited(Location loc) {
        if (!isValidVisitedLoc(loc)) {
            return;
        }
        visited[loc.getY()][loc.getX()] = true;
    }
    private static boolean isValidVisitedLoc(Location loc) {
        if (visited == null) {
            visited = new boolean[maze.getHeight()][maze.getWidth()];
        }
        if ((loc.getX() < 0) || (loc.getX() >= visited[0].length) ||
            (loc.getY() < 0) || (loc.getY() >= visited.length)) {
            return false;
        }
        return true;
    }
}
