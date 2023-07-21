package cs171.sum2023.lab7.A3;

class Position{
    public int i;     //row
    public int j;     //column
    public char val;  //1, 0, or 'X', '.'

    // reference to the previous position (parent) that leads to this position on a path
    Position parent;

    Position(int x, int y, char v){
        i=x; j = y; val=v;
    }

    Position(int x, int y, char v, Position p){
        i=x; j = y; val=v;
        parent=p;
    }

}
