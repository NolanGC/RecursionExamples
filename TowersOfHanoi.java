class Main {
  public static void main(String[] args) {
    /*

    Towers of Hanoi
    Puzzle starts with three rods and n disks. Objective of the puzzle is to move the entire stack to another rod while obeying three rules.
    1) You can only move one disk at a time.
    2) Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
    3) No disk may be placed on top of a smaller disk.

    */
    solveHanoi(3, 1, 2, 3);

  }
  static void solveHanoi(int n, int from, int to, int aux){
    //last disk or only moving 1 disk
    if(n == 1){
      System.out.println("Move disk 1 from rod " +  from + " to rod " + to);
      return;
    }
    solveHanoi(n - 1, from, aux, to); 
    System.out.println("Move disk " + n + " from rod " +  from + " to rod " + to); 
    solveHanoi(n - 1, aux, to, from);   

  }
}