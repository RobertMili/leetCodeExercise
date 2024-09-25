import java.util.*;

class ProblemC {
    static int[][][] walls;  // walls[row][col] = {wall below, wall on right}
    static int[][] distance;
    static final int[] rowChange = {0, 0, 1, -1};  // Row movement directions (left, right, down, up)
    static final int[] colChange = {-1, 1, 0, 0};  // Column movement directions (left, right, down, up)

    // Function to remove the wall between two adjacent cells (row, col) and (newRow, newCol)
    static void removeWall(int row, int col, int newRow, int newCol) {
        if (row == newRow) {  // If in the same row
            walls[row][Math.min(col, newCol)][1] = 0;  // Remove the right wall
        } else if (col == newCol) {  // If in the same column
            walls[Math.min(row, newRow)][col][0] = 0;  // Remove the wall below
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();  // Number of rows
        int width = sc.nextInt();   // Number of columns

        initializeWallsAndDistances(height, width);

        int centerRow = height / 2 + 1;  // Determine center row
        int centerCol = width / 2 + 1;   // Determine center column

        performBFS(height, width, centerRow, centerCol);

        printMaze(height, width);
    }

    // Initialize walls and distance arrays
    static void initializeWallsAndDistances(int height, int width) {
        walls = new int[height + 1][width + 1][2];  // Store if walls exist (below and right) for each cell
        distance = new int[height + 1][width + 1];  // Store distance from the center

        for (int row = 0; row <= height; row++) {
            for (int col = 0; col <= width; col++) {
                Arrays.fill(walls[row][col], 1);  // Initially all walls are present
                distance[row][col] = -1;          // Mark cell as unvisited
            }
        }
    }

    // Perform BFS starting from the center cell
    static void performBFS(int height, int width, int centerRow, int centerCol) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{centerRow, centerCol});
        distance[centerRow][centerCol] = 0;  // Mark center as visited with distance 0

        // Special case for grids where height is even and width is odd
        if (height % 2 == 0 && width % 2 == 1) {
            queue.add(new int[]{centerRow - 1, centerCol});
            removeWall(centerRow - 1, centerCol, centerRow, centerCol);  // Remove the wall between center and one above
            distance[centerRow - 1][centerCol] = 0;
        }

        // BFS loop to explore the grid and remove walls
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            // Explore the four possible directions
            for (int i = 0; i < 4; i++) {
                int newRow = row + rowChange[i];
                int newCol = col + colChange[i];

                // Check if the new cell is within bounds and unvisited
                if (newRow < 1 || newRow > height || newCol < 1 || newCol > width) continue;
                if (distance[newRow][newCol] != -1) continue;

                // Update the distance and add the new cell to the queue
                distance[newRow][newCol] = distance[row][col] + 1;
                queue.add(new int[]{newRow, newCol});

                // Remove the wall between the current cell and the new cell
                removeWall(row, col, newRow, newCol);
            }
        }
    }

    // Output the maze in the required format
    static void printMaze(int height, int width) {
        for (int row = 0; row <= height; row++) {
            // First row (top border)
            if (row == 0) {
                for (int col = 0; col < 2 * width; col++) {
                    if (col % 2 == 0) {
                        System.out.print(" ");  // Space between vertical bars
                    } else {
                        System.out.print("_");  // Horizontal border
                    }
                }
                System.out.println();
            } else {
                for (int col = 1; col <= 2 * width + 1; col++) {
                    // Vertical borders at the start and end of each row
                    if (col == 1 || col == 2 * width + 1) {
                        System.out.print("|");
                    } else if (col % 2 == 0) {  // Even columns for horizontal walls
                        if (row == height) {  // Bottom border for the last row
                            System.out.print("_");
                        } else if (walls[row][col / 2][0] == 1) {
                            System.out.print("_");  // Horizontal wall below
                        } else {
                            System.out.print(" ");  // No wall below
                        }
                    } else {  // Odd columns for vertical walls
                        if (walls[row][(col - 1) / 2][1] == 1) {
                            System.out.print("|");  // Vertical wall to the right
                        } else {
                            System.out.print(" ");  // No wall to the right
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}