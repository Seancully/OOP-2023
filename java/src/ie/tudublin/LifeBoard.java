package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard{
    
    boolean[][] board;
    boolean[][] next;
    private int size;
    PApplet p;
    float cellWidth;


    // bounds checking so we are in bounds of board array
    public boolean getCell(int row, int col){

        if (row >= 0 && row < size && col >= 0 && col < size) {
            
            return board[row][col];

        } else {

            return false;

        }

    }

    public int countCells(int row, int col){
        int count = 0;


        for (int i = -1; i <= 1; i++){

            for (int j = -1; j <= 1; j++) {
                
                if (! (i == 0) && (j == 0)){

                    if (getCell(1, j)) {

                        count++;

                    }

                }
            
            }

        }

        return count;

    }

    public void applyRules(){

        for (int row = 0; row < size; row++) {
            
            for (int col = 0; col < size; col++) {
                int count = countCells(row, col);
                // <2 or > 3 dies
                // 2-3 survives
                // dead w 3 neighbours comes to life
            }

        }

    }

    public LifeBoard(int size, PApplet p){

        this.size = size;
        board = new boolean[size][size]; // creates board w size set
        next = new boolean[size][size]; // create new board w size set
        this.p = p;
        cellWidth = (p.width / (float)size);

    }

    public void randomise(){

        for (int row = 0; row < size; row++) {
            
            for (int col = 0; col < size; col++) {
                
                float dice = p.random(0.0f, 1.0f);
                board[row][col] = (dice <= 0.5f); // assigned 50% of cells in board to true and 50% to false :)

            }

        }

    }

    public void render(){
        p.stroke(255);


        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                float x = col * cellWidth;
                float y = row * cellWidth;


                if (board[row][col]) {

                    p.fill(0, 255, 0);
                    
                } else {

                    p.noFill();
                    
                }

                p.rect(x, y, cellWidth, cellWidth);

            }

        }

    }

    public int getSize() {

        return size;

    }

    public void setSize(int size) {

        this.size = size;

    }

    

}