package fiveKYU.Exc4;

public class ConwayLife {

    public static int[][] getGeneration(int[][] cells, int generations) {
        return deleteEmptyRowsAndColumns(getIteration(cells, 1, generations));
    }

    public static int[][] getIteration(int[][] cells, int iterations, int generations) {
        if (iterations<generations) {
            return getIteration(getStep(cells), iterations+1, generations);
        } else {
            return cells;
        }
    }

    public static int[][] getStep(int[][] cells) {
        int newX = cells.length + 4;
        int newY = cells[0].length + 4;
        int[][] extendTable = new int[newX][newY];
        for (int i = 0; i < newX; i++) {
            for (int j = 0; j < newY; j++) {
                if (i == 0 || i == extendTable.length - 1 || i == 1 || i == extendTable.length - 2) {
                    extendTable[i][j] = 0;
                } else {
                    if (j == 0 || j == extendTable[0].length - 1 || j == 1 || j == extendTable[0].length - 2) {
                        extendTable[i][j] = 0;
                    } else {
                        extendTable[i][j] = cells[i - 2][j - 2];
                    }
                }
            }
        }
        int[][] newTable = new int[newX][newY];
        for (int i = 1; i < newX - 1; i++) {
            for (int j = 1; j < newY - 1; j++) {
                int liveCells = 0;
                if (extendTable[i - 1][j - 1] == 1) {
                    liveCells += 1;
                }
                if (extendTable[i - 1][j] == 1) {
                    liveCells += 1;
                }
                if (extendTable[i - 1][j + 1] == 1) {
                    liveCells += 1;
                }
                if (extendTable[i][j - 1] == 1) {
                    liveCells += 1;
                }
                if (extendTable[i][j + 1] == 1) {
                    liveCells += 1;
                }
                if (extendTable[i + 1][j - 1] == 1) {
                    liveCells += 1;
                }
                if (extendTable[i + 1][j] == 1) {
                    liveCells += 1;
                }
                if (extendTable[i + 1][j + 1] == 1) {
                    liveCells += 1;
                }
                if (extendTable[i][j] == 0) {
                    if (liveCells == 3) {
                        newTable[i][j] = 1;
                    }
                } else {
                    if (liveCells == 2 || liveCells == 3) {
                        newTable[i][j] = 1;
                    } else {
                        newTable[i][j] = 0;
                    }
                }

            }
        }
        return newTable;
    }

    public static int[][] deleteEmptyRowsAndColumns (int[][] cells) {
        int firstRow = 0;
        int lastRow = 0;
        for (int i = 0; i < cells.length; i++) {
            boolean isEmpty = true;
            for (int j = 0; j < cells[0].length; j++) {
                if (cells[i][j] != 0) {
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                firstRow = i;
                break;
            }
        }
        for (int i =cells.length - 1; i > 0; i--) {
            boolean isEmpty = true;
            for (int j = 0; j < cells[0].length; j++) {
                if (cells[i][j] != 0) {
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                lastRow = i;
                break;
            }
        }
        int firstColumn = 0;
        int lastColumn = 0;
        for (int j = 0; j < cells[0].length; j++) {
            boolean isEmpty = true;
            for (int[] cell : cells) {
                if (cell[j] != 0) {
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                firstColumn = j;
                break;
            }
        }
        for (int j = cells[0].length - 1; j > 0; j--) {
            boolean isEmpty = true;
            for (int i = 0; i < cells.length; i++) {
                if (cells[i][j] != 0) {
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                lastColumn = j;
                break;
            }
        }
        int[][] finalTable = new int[lastRow-firstRow+1][lastColumn-firstColumn+1];

        for (int i = 0; i < finalTable.length; i++) {
            for (int j = 0; j < finalTable[0].length; j++) {
                finalTable[i][j] = cells[i+firstRow][j+firstColumn];
            }
        }

        return finalTable;
    }
}
